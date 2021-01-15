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

;Types

Type player
	Field x,y		;coordinates of player
	Field image		;which sprite sheet to use depending on movement and action
	Field frame#	;the frame to be drawn
End Type

;Create Player
Global player.player = New player
player\x = WINDOWWIDTH/4
player\y = WINDOWHEIGHT*3/4 
player\image = idleRight
player\frame = 0

;Constants
Const escKey = 1
Const spaceKey = 57
Const leftKey = 203
Const rightKey = 205
Const enterKey = 28

;Variables and Globals
Global FontH = FontHeight()
Global facing$ = "right" 	; direction player was last facing
Global speed = 2.5 			;image movement speed
Global strikeCommit = 0 	;whether the player is commited to a strike true/false
Global jumpCommit = 0		;whether the player is commited to a jump true/false
Global animationCount# = 0	;counts which frame of the animations the functoin
Global yOffset# = 0
Global jumpDist = speed


;Set the animation frame rate
frameTimer = CreateTimer(60)



;MAIN ANIMATION LOOP
Repeat 
	
	;animation frame rate timer
	WaitTimer(frameTimer)
	
	Cls()
	If Not(jumpCommit) Then
		If Not(strikeCommit) Then
			If (KeyDown(rightKey)) Then 
				facing = "right"
				Walk()
			ElseIf (KeyDown(leftKey)) Then
				facing = "left"
				Walk()
			Else 
				Stand()
				player\frame = 0	
			EndIf
		EndIf
	EndIf
	
If Not(jumpCommit)
	If (KeyHit(enterKey)) Or strikeCommit = 1 Then
		strikeCommit = 1
		Strike()
	EndIf
EndIf

If Not (strikeCommit)
	If (KeyDown(spaceKey)) Or jumpCommit = 1 Then
		jumpCommit = 1
		Jump()
	EndIf
EndIf	

	DisplayInstructions()
	DrawImage(player\image, player\x + jumpDist, player\y - yOffset, player\frame)
	
	Flip()
	
	
Until (KeyHit(escKey))

End()



;FUNCTIONS

Function DisplayInstructions()
	Color(150,150,150)
	Text(FontH, FontH,   "Use the Arrow Keys to move Left and Right")
	Text(FontH, FontH*2, "Use the Spacebar to jump")
	Text(FontH, FontH*3, "Use the Enter Key to Attack") 
End Function


Function Walk()
	If facing = "right"
		player\image = moveRight
		player\x = player\x + speed
	EndIf
	
	If facing = "left"
		player\image = moveLeft
		player\x = player\x - speed
	EndIf

	player\frame = player\frame + .1
	
	If player\frame > 5 
		player\frame = 0
	EndIf
	
End Function

Function Stand()
	If facing = "right"
		player\image = idleRight
	Else
		player\image = idleLeft
	EndIf
End Function

Function Strike()
	If facing = "right"
		player\image = punchRight
	EndIf
	If facing = "left"
		player\image = punchLeft
	EndIf
	
	player\frame = animationCount
	animationCount = animationCount + .25
	
	If player\frame > 6	Then	;strike animation ends
		strikeCommit = 0		;reset to false
		player\frame = 0		;reset to zero
		animationCount = 0		;reset to zero
		If facing = "right"	Then		;
			player\image = idleRight	;set to idle after punching
		Else							;
			player\image = idleLeft		;
		EndIf
	EndIf
End Function

Function Jump()
	If facing = "right"
		player\image = jumpRight
		player\x = player\x + speed
	EndIf
	If facing = "left"
		player\image = jumpLeft
		player\x = player\x - speed
	EndIf
	
	player\frame = animationCount
	animationCount = animationCount + .015
	
	yOffset = 100*(1-(2*animationCount-1)^2)^.5
	
	If player\frame > 1		;jump animation ends
		jumpCommit = 0		;reset to false
		player\frame = 0	;reset to zero
		animationCount = 0	;reset to zero
		yOffset = 0
		
		If facing = "right"				;
			player\image = idleRight	;set to idle after jumping
		EndIf							;
		If facing = "left"				;
			player\image = idleLeft		;
		EndIf
	EndIf
End Function








