;Keegan Maundrell this program demonstrates the use of animated graphics

;GRAPHICS
Const WINDOWWIDTH = 800
Const WINDOWHEIGHT = 300
Graphics (WINDOWWIDTH, WINDOWHEIGHT, 0, 2)
SetBuffer(BackBuffer())

AppTitle ("Character Animation")

;INITIALIZATION

;Images
AutoMidHandle (True)

;Hulk Images
Global idleRight = LoadImage("idleRight.bmp")
MaskImage (idleRight,255,255,255)

Global idleLeft = LoadImage("idleLeft.bmp")
MaskImage (idleLeft,255,255,255)

Global moveRight = LoadAnimImage("moveRight.bmp",100,100,0,6)
MaskImage (moveRight,255,255,255)

Global moveLeft = LoadAnimImage("moveLeft.bmp",100,100,0,6)
MaskImage (moveLeft,255,255,255)

Global punchRight = LoadAnimImage("punchRight.bmp",140,100,0,7)
MaskImage (punchRight,255,255,255)

Global punchLeft = LoadAnimImage("punchLeft.bmp",140,100,0,7)
MaskImage (punchLeft,255,255,255)

Global jumpRight = LoadAnimImage("jumpRight.bmp",100,100,0,2)
MaskImage (jumpRight,255,255,255)

Global jumpLeft = LoadAnimImage("jumpLeft.bmp",100,100,0,2)
MaskImage (jumpLeft,255,255,255)

;Master Chief Images
Global idleRightMC = LoadImage ("idleRightMC.bmp")
MaskImage (idleRightMC,255,255,255)

Global idleLeftMC = LoadImage ("idleLeftMC.bmp")
MaskImage (idleLeftMC,255,255,255)

Global moveRightMC = LoadAnimImage("moveRightMC.bmp",100,100,0,10)
MaskImage (moveRightMC,255,255,255)

Global moveLeftMC = LoadAnimImage("moveLeftMC.bmp",100,100,0,10)
MaskImage (moveLeftMC,255,255,255)

Global shootRight = LoadAnimImage("shootRight.bmp",100,100,0,3)
MaskImage (shootRight,255,255,255)

Global shootLeft = LoadAnimImage("shootLeft.bmp",100,100,0,3)
MaskImage (shootLeft,255,255,255)

Global bulletLeft = LoadImage("bulletLeft.bmp")
MaskImage (bulletLeft,255,255,255)

Global bulletRight = LoadImage("bulletRight.bmp")
MaskImage (bulletRight,255,255,255)

;Types
Type bullet
	Field x,y
	Field image
	Field facing$
End Type

Type player
	Field x,y				;coordinates of player
	Field image				;which sprite sheet to use depending on movement and action
	Field frame#			;the frame to be drawn
	Field facing$			;the direction the user is facing
	Field animationCount#	;counts the frames in each players special actions
	Field speed#			;speed of each character
	Field strikeCommit%		;user is locked into their action until its complete
	Field yOffset#			;ammount the sprites are offset on the y axis
	Field xOffset#			;ammount the sprites are offset on the x axis
End Type


;Create the Players
Global hulk.player = New player
hulk\x = WINDOWWIDTH/4
hulk\y = WINDOWHEIGHT*3/4 
hulk\image = idleRight
hulk\frame = 0
hulk\facing = "right"
hulk\animationCount = 0
hulk\speed = 2.5
hulk\strikeCommit = 0
hulk\yOffset = 0
Global mc.player = New player
mc\x = WINDOWWIDTH - 200
mc\y = WINDOWHEIGHT*3/4 
mc\image = idleLeftMC
mc\frame = 0
mc\facing = "left"
mc\animationCount = 0
mc\speed = 3
mc\strikeCommit = 0
mc\yOffset = 8
mc\xOffset = 0
Global bullet.bullet = New bullet
bullet\facing = "left"

;Constants
Const escKey 	= 1
Const upKey 	= 200
Const leftKey 	= 203
Const rightKey 	= 205
Const enterKey	= 28
Const aKey		= 30
Const dKey		= 32
Const shiftKey	= 42

;Variables and Globals
Global FontH = FontHeight()
Global jumpCommit = 0			;whether the player is commited to a jump true/false;
Global jumpDist = hulk\speed*2	;distance of Hulks jump
Global shoot = 0
Global move = 0
Global fired = 0

;Set the animation frame rate
frameTimer = CreateTimer(60)


;MAIN ANIMATION LOOP
Repeat 
	
	;animation frame rate timer
	WaitTimer(frameTimer)
	
		
	Cls()
	;hulk's movement	
	If Not(jumpCommit) Then
		If Not(hulk\strikeCommit) Then
			If (KeyDown(rightKey)) Then 
				hulk\facing = "right"
				Walk1()
			ElseIf (KeyDown(leftKey)) Then
				hulk\facing = "left"
				Walk1()
			Else 
				Stand1()
				hulk\frame = 0	
			EndIf
		EndIf
	EndIf
	;master chief's movement
	If Not (mc\strikeCommit)
		If (KeyDown(dKey))
			mc\facing = "right"
			Walk2()
		ElseIf (KeyDown (aKey))
			mc\facing = "left"
			walk2()
		Else
			Stand2()
			mc\frame = 0
		EndIf
	EndIf
	
	;hulk's attack
	If Not(jumpCommit)
		If (KeyHit(enterKey)) Or hulk\strikeCommit = 1 Then
			hulk\strikeCommit = 1
			Strike1()
		EndIf
	EndIf
		
	;master chief's attack	
	
	
		If (KeyHit (shiftKey) Or mc\strikeCommit = 1)
			mc\strikeCommit = 1
			Strike2()
			Bullet()
		EndIf
		
		If move = 1
			MoveBullet()
		EndIf
		

	If Not (hulk\strikeCommit)
		If (KeyDown(upKey)) Or jumpCommit = 1 Then
			jumpCommit = 1
			Jump()
		EndIf
	EndIf	
	
	DisplayInstructions()
	DrawImage(mc\image, mc\x + mc\xOffset, mc\y + mc\yOffset, mc\frame)
	DrawImage(hulk\image, hulk\x + jumpDist, hulk\y - hulk\yOffset, hulk\frame)
	
	Flip()
		
Until (KeyHit(escKey))

End()



;FUNCTIONS

Function DisplayInstructions()
	Color(150,150,150)
	Text(FontH, FontH,   "CONTROLS FOR THE HULK")
	Text(FontH, FontH*2, "Use the Arrow Keys to move Left and Right")
	Text(FontH, FontH*3, "Use the Up Key to jump")
	Text(FontH, FontH*4, "Use the Enter Key to Attack") 
End Function

;hulk walking function
Function Walk1()
	If hulk\facing = "right"
		hulk\image = moveRight
		hulk\x = hulk\x + hulk\speed
	EndIf
	
	If hulk\facing = "left"
		hulk\image = moveLeft
		hulk\x = hulk\x - hulk\speed
	EndIf

	hulk\frame = hulk\frame + .1
	
	If hulk\frame > 5 
		hulk\frame = 0
	EndIf
	
End Function

;hulk walking function
Function Walk2()
	If mc\facing = "right"
		mc\image = moveRightMC
		mc\x = mc\x + mc\speed
	EndIf
	
	If mc\facing = "left"
		mc\image = moveLeftMC
		mc\x = mc\x - mc\speed
	EndIf

	mc\frame = mc\frame + .2
	
	If mc\frame > 9 
		mc\frame = 0
	EndIf
	
End Function

;Hulk's standing function
Function Stand1()
	If hulk\facing = "right"
		hulk\image = idleRight
	Else
		hulk\image = idleLeft
	EndIf
End Function

;master chiefs standing function
Function Stand2()
	If mc\facing = "right"
		mc\image = idleRightMC
	Else
		mc\image = idleLeftMC
	EndIf
End Function

;Hulks attack animation
Function Strike1()
	If hulk\facing = "right"
		hulk\image = punchRight
	EndIf
	If hulk\facing = "left"
		hulk\image = punchLeft
	EndIf
	
	hulk\frame = hulk\animationCount
	hulk\animationCount = hulk\animationCount + .25	
	
	If hulk\frame > 6 Then				;strike animation ends
		hulk\strikeCommit = 0			;reset to false
		hulk\frame = 0					;reset to zero
		hulk\animationCount = 0			;reset to zero
		If hulk\facing = "right" Then	;
			hulk\image = idleRight		;set to idle after punching
		Else							;
			hulk\image = idleLeft		;
		EndIf
	EndIf
End Function

;master chiefs attack animation
Function Strike2()
			If mc\facing = "right"
			mc\image = shootRight
			mc\xOffset = 7
			If mc\animationCount > 2
				mc\xOffset = 600
			EndIf
		EndIf
		If mc\facing = "left"
			mc\image = shootLeft
			mc\xOffset = -7
		EndIf
		
		mc\frame = mc\animationCount
		mc\animationCount = mc\animationCount + .1	
		
		
		If mc\frame > 2 Then				;strike animation ends
			mc\strikeCommit = 0				;reset to false
			mc\frame = 0					;reset to zero
			mc\animationCount = 0			;reset to zero
			mc\xOffset = 0
			If mc\facing = "right" Then		;
				mc\image = idleRightMC		;set to idle after punching
			Else							;
				mc\image = idleLeftMC		;
			EndIf
		EndIf
	
End Function

;bullet create function
Function Bullet()
	shoot = 1
		If fired = 0
		If shoot = 1
			bullet.bullet = New bullet
			bullet\x = mc\x
			bullet\y = mc\y - 10
			If mc\facing = "right"
				bullet\image = bulletRight
				bullet\facing = "right"
			ElseIf mc\facing = "left"
				bullet\image = bulletLeft
				bullet\facing = "left"
			EndIf
			move = 1
			shoot = 0
			fired = 1
		EndIf
		EndIf
End Function

Function MoveBullet()
	If bullet\facing = "right"
		bullet\x = bullet\x + mc\speed*2
	ElseIf bullet\facing = "left"
		bullet\x = bullet\x - mc\speed*2
	EndIf
	DrawImage(bullet\image,bullet\x,bullet\y)
	If bullet\x > 815
		fired = 0
	ElseIf bullet\x < -15
		fired = 0
	EndIf
End Function

;Hulk's Jump
Function Jump()
	If hulk\facing = "right"
		hulk\image = jumpRight
		hulk\x = hulk\x + hulk\speed
	EndIf
	If hulk\facing = "left"
		hulk\image = jumpLeft
		hulk\x = hulk\x - hulk\speed
	EndIf
	
	hulk\frame = hulk\animationCount
	hulk\animationCount = hulk\animationCount + .015
	
	hulk\yOffset= 100*(1-(2*hulk\animationCount-1)^2)^.5
	
	If hulk\frame > 1			;jump animation ends
		jumpCommit = 0			;reset to false
		hulk\frame = 0			;reset to zero
		hulk\animationCount = 0	;reset to zero
		hulk\yOffset = 0		;reset to zero
		
		If hulk\facing = "right"		;
			hulk\image = idleRight		;set To idle After jumping
		EndIf							;
		If hulk\facing = "left"			;
			hulk\image = idleLeft		;
		EndIf
	EndIf
End Function
















