;Keegan Maundrell

;Graphics
Graphics (150,150,0,3)
AppTitle ("Gladiator Wars: The Fight For Fame")
SetBuffer (BackBuffer())

;load images
AutoMidHandle (True)

Global idleRightRed = LoadImage ("idleRightRed.bmp")
MaskImage (idleRightRed,255,255,255)

Global idleRightGreen = LoadImage("idleRightGreen.bmp")
MaskImage (idleRightGreen,255,255,255)

Global idleRightPurple = LoadImage ("idleRightPurple.bmp")
MaskImage (idleRightPurple,255,255,255)

Global idleLeftRed = LoadImage ("idleLeftRed.bmp")
MaskImage (idleLeftRed,255,255,255)

Global idleLeftGreen = LoadImage ("idleLeftGreen.bmp")
MaskImage (idleLeftGreen,255,255,255)

Global idleLeftPurple = LoadImage ("idleLeftPurple.bmp")
MaskImage (idleLeftPurple,255,255,255)

Global blockUpRightGreen = LoadImage ("blockUpRightGreen.bmp")
MaskImage (blockUpRightGreen,255,255,255)

Global blockUpRightPurple = LoadImage ("blockUpRightPurple.bmp")
MaskImage (blockUpRightPurple,255,255,255)

Global blockUpRightRed = LoadImage ("blockUpRightRed.bmp")
MaskImage (blockUpRightRed,255,255,255)

Global blockUpLeftRed = LoadImage ("blockUpLeftRed.bmp")
MaskImage (blockUpLeftRed,255,255,255)

Global blockUpLeftGreen = LoadImage ("blockUpLeftGreen.bmp")
MaskImage (blockUpLeftGreen,255,255,255)

Global blockUpLeftPurple = LoadImage ("blockUpLeftPurple.bmp")
MaskImage (blockUpLeftPurple,255,255,255)

Global blockMidRightRed = LoadImage ("blockMidRightRed.bmp")
MaskImage (blockMidRightRed,255,255,255)

Global blockMidRightGreen = LoadImage ("blockMidRightGreen.bmp")
MaskImage (blockMidRightGreen,255,255,255)

Global blockMidRightPurple = LoadImage ("blockMidRightPurple.bmp")
MaskImage (blockMidRightPurple,255,255,255)

Global blockMidLeftRed = LoadImage ("blockMidLeftRed.bmp")
MaskImage (blockMidLeftRed,255,255,255)

Global blockMidLeftGreen = LoadImage ("blockMidLeftGreen.bmp")
MaskImage (blockMidLeftGreen,255,255,255)

Global blockMidLeftPurple = LoadImage ("blockMidLeftPurple.bmp")
MaskImage (blockMidLeftPurple,255,255,255)

Global blockDownRightRed = LoadImage ("blockDownRightRed.bmp")
MaskImage (blockDownRightRed,255,255,255)

Global blockDownRightGreen = LoadImage ("blockDownRightGreen.bmp")
MaskImage (blockDownRightGreen,255,255,255)

Global blockDownRightPurple = LoadImage ("blockDownRightPurple.bmp")
MaskImage (blockDownRightPurple,255,255,255)

Global blockDownLeftRed = LoadImage ("blockDownLeftRed.bmp")
MaskImage (blockDownLeftRed,255,255,255)

Global blockDownLeftGreen = LoadImage ("blockDownLeftGreen.bmp")
MaskImage (blockDownLeftGreen,255,255,255)

Global blockDownLeftPurple = LoadImage ("blockDownLeftPurple.bmp")
MaskImage (blockDownLeftPurple,255,255,255)

Global attackUpRightPurple = LoadImage ("attackUpRightPurple.bmp")
MaskImage (attackUpRightPurple,255,255,255)

Global attackUpRightRed = LoadImage ("attackUpRightRed.bmp")
MaskImage (attackUpRightRed,255,255,255)

Global attackUpRightGreen = LoadImage ("attackUpRightGreen.bmp")
MaskImage (attackUpRightGreen,255,255,255)

Global attackUpLeftRed = LoadImage ("attackUpLeftRed.bmp")
MaskImage (attackUpLeftRed,255,255,255)

Global attackUpLeftGreen = LoadImage ("attackUpLeftGreen.bmp")
MaskImage (attackUpLeftGreen,255,255,255)

Global attackUpLeftPurple = LoadImage ("attackUpLeftPurple.bmp")
MaskImage (attackUpLeftPurple,255,255,255)

Global attackMidRightRed = LoadImage ("attackMidRightRed.bmp")
MaskImage (attackMidRightRed,255,255,255)

Global attackMidRightGreen = LoadImage ("attackMidRightGreen.bmp")
MaskImage (attackMidRightGreen,255,255,255)

Global attackMidRightPurple = LoadImage ("attackMidRightPurple.bmp")
MaskImage (attackMidRightPurple,255,255,255)

Global attackMidLeftRed = LoadImage ("attackMidLeftRed.bmp")
MaskImage (attackMidLeftRed,255,255,255)

Global attackMidLeftGreen = LoadImage ("attackMidLeftGreen.bmp")
MaskImage (attackMidLeftGreen,255,255,255)

Global attackMidLeftPurple = LoadImage ("attackMidLeftPurple.bmp")
MaskImage (attackMidLeftPurple,255,255,255)

Global attackDownRightRed = LoadImage ("attackDownRightRed.bmp")
MaskImage (attackDownRightRed,255,255,255)

Global attackDownRightGreen = LoadImage ("attackDownRightGreen.bmp")
MaskImage (attackDownRightGreen,255,255,255)

Global attackDownRightPurple = LoadImage ("attackDownRightPurple.bmp")
MaskImage (attackDownRightPurple,255,255,255)

Global attackDownLeftRed = LoadImage ("attackDownLeftRed.bmp")
MaskImage (attackDownLeftRed,255,255,255)

Global attackDownLeftGreen = LoadImage ("attackDownLeftGreen.bmp")
MaskImage (attackDownLeftGreen,255,255,255)

Global attackDownLeftPurple = LoadImage ("attackDownLeftPurple.bmp")
MaskImage (attackDownLeftPurple,255,255,255)

Global KORightRed = LoadAnimImage ("KORightRed.bmp",100,70,0,5)					;
MaskImage (KORightRed,255,255,255)												;
																				;
Global KORightGreen = LoadAnimImage ("KORightGreen.bmp",100,70,0,5)				;
MaskImage (KORightGreen,255,255,255)											;
																				;
Global KORightPurple = LoadAnimImage ("KORightPurple.bmp",100,70,0,5)			;
MaskImage (KORightPurple,255,255,255)											;
																				;Sprites for losing the round
Global KOLeftRed = LoadAnimImage ("KOLeftRed.bmp",100,70,0,5)					;
MaskImage (KOLeftRed,255,255,255)												;	
																				;
Global KOLeftGreen = LoadAnimImage ("KOLeftGreen.bmp",100,70,0,5)				;
MaskImage (KOLeftGreen,255,255,255)												;
																				;
Global KOLeftPurple = LoadAnimImage ("KOLeftPurple.bmp",100,70,0,5)				;
MaskImage (KOLeftPurple,255,255,255)											;

Global deathRightRed = LoadAnimImage ("deathRightRed.bmp",100,70,0,5)			;
MaskImage (deathRightRed,255,255,255)											;
																				;
Global deathRightGreen = LoadAnimImage ("deathRightGreen.bmp",100,70,0,5)		;
MaskImage (deathRightGreen,255,255,255)											;
																				;
Global deathRightPurple = LoadAnimImage ("deathRightPurple.bmp",100,70,0,5)		;
MaskImage (deathRightPurple,255,255,255)										;
																				;
Global deathLeftRed = LoadAnimImage ("deathLeftRed.bmp",100,70,0,5)				;Sprites for losing the game
MaskImage (deathLeftRed,255,255,255)											;
																				;
Global deathLeftGreen = LoadAnimImage ("deathLeftGreen.bmp",100,70,0,5)			;
MaskImage (deathLeftGreen,255,255,255)											;
																				;
Global deathLeftPurple = LoadAnimImage ("deathLeftPurple.bmp",100,70,0,5)		;
MaskImage (deathLeftPurple,255,255,255)											;

Global p1Health = LoadAnimImage ("p1Health.bmp",35,10,0,4)
MaskImage (p1Health,255,255,255)

Global p2Health = LoadAnimImage ("p1Health.bmp",35,10,0,4)
MaskImage (p2Health,255,255,255)

Global p1Win = LoadImage ("p1Wins.bmp")
MaskImage (p1Win,117,117,117)

Global p2Win = LoadImage ("p2Wins.bmp")
MaskImage (p2Win,117,117,117)

Global turnAttack = LoadImage ("turnAttack.bmp")
MaskImage (turnAttack,255,255,255)

Global turnBlock = LoadImage("turnBlock.bmp")
MaskImage (turnBlock,255,255,255)

Global textBack = LoadImage ("textBack.bmp")
MaskImage (textBack,255,255,255)

Global title = LoadImage ("titleScreen.bmp")

Global background = LoadImage ("background.bmp")

;types
Type player
	Field x,y
	Field xOffset
	Field frame#
	Field image
	Field colour$
	Field wins%				;tracks individual player round wins
	Field animationCount#
	Field animationTimer%
	Field aiming$			;showcases where the other player is going to attack
	Field turn$				;tells the program whos doing what each turn
End Type 
	
	
;constants
Const escKey = 1
Const upKey = 200
Const leftKey = 203
Const downKey = 208
Const p2block = 54 ; player 2's block key, the left hand tab key, testing phase
Const p2attack = 157 ; player 2's attack key, the caps lock key, testing phase
Const wKey = 17
Const dKey = 32
Const sKey = 31
Const p1block = 15 ; player 1's block key, the right hand shift key,testing phase
Const p1attack = 58 ; player 1's attack key, the right hand crtl key, testing phase

Const r = 19, p = 25, g = 34 ; the 3 colours the players can choose from
Const backSpace = 14

;globals
Global player1.player = New player
player1\x = 40
player1\y = 100
player1\image = idleRightRed
player1\frame = 0
player1\xOffset = 0
player1\wins = 0
player1\animationCount = 0
player1\animationTimer = 0
player1\colour = "red"
player1\aiming = "middle" ;will always default to the middle, hold up/down to attack up and down



Global player2.player = New player
player2\x = 110
player2\y = 100
player2\image = idleLeftRed
player2\frame = 0
player2\xOffset = 0
player2\wins = 0
player2\animationCount = 0
player2\animationTimer = 0
player2\colour = "red"
player2\aiming = "middle"



Global colourP1
Global p1knockCommit
Global p1deathCommit

Global colourP2
Global p2knockCommit
Global p2deathCommit

Global turn ; if 0, player 1 is attacking, if 1 player2 is attacking
Global rematch$ ;restarts the game if yes is entered
Global win = 0 ;tests if any player has won a match
Global font = LoadFont ("arial",12,False,False,False)


;timer
frameTimer = CreateTimer(60)

;set randomizer
SeedRnd(MilliSecs())


;MAIN

	DrawImage (title,75,75)
	Flip()
	WaitKey()
	
	Repeat
		P1Colour()
	Until KeyHit(backSpace) 
	
	Repeat
		P2Colour()
	Until KeyHit(backSpace)
		


		Repeat
			turn = Rand (0,1)
			Repeat
			WaitTimer(frameTimer)
			Cls()
			
			P1AIM()
			P2AIM()
		
		
			If  (KeyDown (p1block))
				BlockP1()
			ElseIf  (KeyDown (p1attack))
				AttackP1()
			ElseIf (KeyDown(32)) Or p1knockCommit = 1 Then
				p1knockCommit = 1
				KnockP1()
			ElseIf (KeyDown(30)) Or p1deathCommit = 1 Then
				p1deathCommit = 1
				DeathP1()
			ElseIf Not KeyDown
				player1\frame = 0
				P1STAND()
			EndIf
		
			
			
		
			If (KeyDown (p2block))
				BlockP2()
			ElseIf (KeyDown (p2attack))
				AttackP2()
			ElseIf (KeyDown(203)) Or p2knockCommit = 1 Then 
				p2knockCommit = 1
				KnockP2()
			ElseIf (KeyDown(205)) Or p2deathCommit = 1 Then
				p2deathcommit = 1
				DeathP2()
			ElseIf Not KeyDown
				player2\frame = 0
				P2STAND()
			EndIf
		
		
		
			DrawImage (player1\image,player1\x + player1\xOffset,player1\y,player1\frame)
			DrawImage (player2\image,player2\x + player2\xOffset,player2\y,player2\frame)
			
			Flip()
			
			Until (win = 1)
			
			Rematch()	
	
		Until (rematch = "no" Or "No")



End ()
;END MAIN







;FUNCTIONS
Function BlockP1()
	
	If player1\aiming = "middle"
		
		If player1\colour = "red"			
			player1\image = blockMidRightRed
		ElseIf player1\colour = "green"
			player1\image = blockMidRightGreen
		ElseIf player1\colour = "purple"
			player1\image = blockMidRightPurple
		EndIf

	ElseIf player1\aiming = "up"
		
		If player1\colour = "red"
			player1\image = blockUpRightRed
		ElseIf player1\colour = "green"
			player1\image = blockUpRightGreen
		ElseIf player1\colour = "purple"
			player1\image = blockUpRightPurple
		EndIf
		
	ElseIf player1\aiming = "down"
		
		If player1\colour = "red"
			player1\image = blockDownRightRed
		ElseIf player1\colour = "green"
			player1\image = blockDownRightGreen
		ElseIf player1\colour = "purple"
			player1\image = blockDownRightPurple
		EndIf
	
	EndIf
	
End Function



Function BlockP2()
	
	If player2\aiming = "middle"
		
		If player2\colour = "red"
			player2\image = blockMidLeftRed
		ElseIf player2\colour = "green"
			player2\image = blockMidLeftGreen
		ElseIf player2\colour = "purple"
			player2\image = blockMidLeftPurple
		EndIf

		player2\xOffset = 4

	ElseIf player2\aiming = "up"
		
		If player2\colour = "red"
			player2\image = blockUpLeftRed
		ElseIf player2\colour = "green"
			player2\image = blockUpLeftGreen
		ElseIf player2\colour = "purple"
			player2\image = blockUpLeftPurple
		EndIf
		
		player2\xOffset = 2

	ElseIf player2\aiming = "down"
		
		If player2\colour = "red"
			player2\image = blockDownLeftRed
		ElseIf player2\colour = "green"
			player2\image = blockDownLeftGreen
		ElseIf player2\colour = "purple"
			player2\image = blockDownLeftPurple
		EndIf
		
		player2\xOffset = 3

	EndIf
	
End Function



Function AttackP1()
	
	If player1\aiming = "middle"
		
		If player1\colour = "red"			
			player1\image = attackMidRightRed
		ElseIf player1\colour = "green"
			player1\image = attackMidRightGreen
		ElseIf player1\colour = "purple"
			player1\image = attackMidRightPurple
		EndIf

	ElseIf player1\aiming = "up"
		
		If player1\colour = "red"
			player1\image = attackUpRightRed
		ElseIf player1\colour = "green"
			player1\image = attackUpRightGreen
		ElseIf player1\colour = "purple"
			player1\image = attackUpRightPurple
		EndIf
		
	ElseIf player1\aiming = "down"
		
		If player1\colour = "red"
			player1\image = attackDownRightRed
		ElseIf player1\colour = "green"
			player1\image = attackDownRightGreen
		ElseIf player1\colour = "purple"
			player1\image = attackDownRightPurple
		EndIf
	
	EndIf

	player1\xOffset = 18

End Function



Function AttackP2()

	If player2\aiming = "middle"
		
		If player2\colour = "red"			
			player2\image = attackMidLeftRed
		ElseIf player2\colour = "green"
			player2\image = attackMidLeftGreen
		ElseIf player2\colour = "purple"
			player2\image = attackMidLeftPurple
		EndIf

		player2\xOffset = -23

	ElseIf player2\aiming = "up"
		
		If player2\colour = "red"
			player2\image = attackUpLeftRed
		ElseIf player2\colour = "green"
			player2\image = attackUpLeftGreen
		ElseIf player2\colour = "purple"
			player2\image = attackUpLeftPurple
		EndIf
		
		player2\xOffset = -19

	ElseIf player2\aiming = "down"
		
		If player2\colour = "red"
			player2\image = attackDownLeftRed
		ElseIf player2\colour = "green"
			player2\image = attackDownLeftGreen
		ElseIf player2\colour = "purple"
			player2\image = attackDownLeftPurple
		EndIf
	
		player2\xOffset = -19
	
	EndIf

End Function



Function KnockP1()

	If player1\colour = "red"
		player1\image = KORightRed
	ElseIf player1\colour = "green"
		player1\image = KORightGreen
	ElseIf player1\colour = "purple"
		player1\image = KORightPurple
	EndIf
	
	player1\frame = player1\animationCount
	player1\animationCount = player1\animationCount + 0.15

	If player1\frame > 4
		player1\animationTimer = player1\animationTimer + 1
		player1\animationCount = 4
	EndIf

	If player1\animationTimer = 50
		player1\frame = 0
		player1\animationCount = 0
		player1\animationTimer = 0
		p1knockCommit = 0
		If player1\colour = "red"
			player1\xOffset = 0			
			player1\image = idleRightRed
		ElseIf player1\colour = "green"
			player1\xOffset = 0
			player1\image = idleRightGreen
		ElseIf player1\colour = "purple"
			player1\xOffset = 0
			player1\image = idleRightPurple
		EndIf
	EndIf

End Function



Function KnockP2()
	
	If player2\colour = "red"
		player2\image = KOLeftRed
	ElseIf player2\colour = "green"
		player2\image = KOLeftGreen
	ElseIf player2\colour = "purple"
		player2\image = KOLeftPurple
	EndIf
	
	player2\frame = player2\animationCount
	player2\animationCount = player2\animationCount + 0.15

	If player2\frame > 4
		player2\animationTimer = player2\animationTimer + 1
		player2\animationCount = 4
	EndIf

	If player2\animationTimer = 50
		player2\frame = 0
		player2\animationCount = 0
		player2\animationTimer = 0
		p2knockCommit = 0
		If player2\colour = "red"
			player2\xOffset = 0			
			player2\image = idleLeftRed
		ElseIf player2\colour = "green"
			player2\xOffset = 0
			player2\image = idleLeftGreen
		ElseIf player2\colour = "purple"
			player2\xOffset = 0
			player2\image = idleLeftPurple
		EndIf
	EndIf 
End Function 



Function DeathP1()
	If player1\colour = "red"
		player1\image = deathRightRed
	ElseIf player1\colour = "green"
		player1\image = deathRightGreen
	ElseIf player1\colour = "purple"
		player1\image = deathRightPurple
	EndIf
	
	player1\xOffset = -10
	player1\frame = player1\animationCount
	player1\animationCount = player1\animationCount + 0.15

	If player1\frame > 4
		player1\animationTimer = player1\animationTimer + 1
		player1\animationCount = 4
	EndIf

	If player1\animationTimer = 50
		player1\frame = 0
		player1\animationCount = 0
		player1\animationTimer = 0
		p1deathCommit = 0
		If player1\colour = "red"
			player1\xOffset = 0			
			player1\image = idleRightRed
		ElseIf player1\colour = "green"
			player1\xOffset = 0
			player1\image = idleRightGreen
		ElseIf player1\colour = "purple"
			player1\xOffset = 0
			player1\image = idleRightPurple
		EndIf
	EndIf
End Function



Function DeathP2()
	If player2\colour = "red"
		player2\image = deathLeftRed
	ElseIf player2\colour = "green"
		player2\image = deathLeftGreen
	ElseIf player2\colour = "purple"
		player2\image = deathLeftPurple
	EndIf
	
	player2\xOffset = 10
	player2\frame = player2\animationCount
	player2\animationCount = player2\animationCount + 0.15

	If player2\frame > 4
		player2\animationTimer = player2\animationTimer + 1
		player2\animationCount = 4
	EndIf

	If player2\animationTimer = 50
		player2\frame = 0
		player2\animationCount = 0
		player2\animationTimer = 0
		p2deathCommit = 0
		If player2\colour = "red"
			player2\xOffset = 0			
			player2\image = idleLeftRed
		ElseIf player2\colour = "green"
			player2\xOffset = 0
			player2\image = idleLeftGreen
		ElseIf player2\colour = "purple"
			player2\xOffset = 0
			player2\image = idleLeftPurple
		EndIf
	EndIf
End Function


Function P1AIM()

	If (KeyHit (wKey)) 
		player1\aiming = "up"
	ElseIf (KeyHit (sKey))
		player1\aiming = "down"
	ElseIf (KeyHit (dkey))
		player1\aiming = "middle"
	EndIf

End Function



Function P2AIM()

	If (KeyHit (upKey)) 
		player2\aiming = "up"
	ElseIf (KeyHit (downKey))
		player2\aiming = "down"
	ElseIf (KeyHit (dKey))
		player2\aiming = "middle"
	EndIf

End Function

Function P1STAND()
	
	If player1\colour = "red"			
		player1\image = idleRightRed
		player1\xOffset = 0
	ElseIf player1\colour = "green"
		player1\image = idleRightGreen
		player1\xOffset = 0
	ElseIf player1\colour = "purple"
		player1\image = idleRightPurple
		player1\xOffset = 0
	EndIf

End Function

Function P2STAND()

	If player2\colour = "red"
		player2\xOffset = 0			
		player2\image = idleLeftRed
	ElseIf player2\colour = "green"
		player2\xOffset = 0
		player2\image = idleLeftGreen
	ElseIf player2\colour = "purple"
		player2\xOffset = 0
		player2\image = idleLeftPurple
	EndIf

End Function

Function P1Colour()
	Cls()

	DrawImage (background,75,75)
	DrawImage (textBack,75,75)

	SetFont font
	Text (75,20,"Player 1, Choose Your Colour:",True,True)
	Text (75,40,"Press 'R' for Red",True,True)
	Text (75,50,"Press 'P' for Purple",True,True)
	Text (75,60,"Press 'G' for Green",True,True)
	Text (75,130,"Press Back Space to Confirm",True,True)
	If KeyHit(r)
		player1\colour = "red"
		player1\image = idleRightRed
	ElseIf KeyHit(p)
		player1\colour = "purple"
		player1\image = idleRightPurple
	ElseIf KeyHit (g)
		player1\colour = "green"
		player1\image = idleRightGreen
	EndIf
	DrawImage (player1\image,75,85)
	Flip()
End Function

Function P2Colour()
	Cls()

	DrawImage (background,75,75)
	DrawImage (textBack,75,75)

	SetFont font
	Text (75,20,"Player 2, Choose Your Colour:",True,True)
	Text (75,40,"Press 'R' for Red",True,True)
	Text (75,50,"Press 'P' for Purple",True,True)
	Text (75,60,"Press 'G' for Green",True,True)
	Text (75,130,"Press Back Space to Confirm",True,True)
	If KeyHit(r)
		player2\colour = "red"
		player2\image = idleLeftRed
	ElseIf KeyHit(p)
		player2\colour = "purple"
		player2\image = idleLeftPurple
	ElseIf KeyHit (g)
		player2\colour = "green"
		player2\image = idleLeftGreen
	EndIf
	DrawImage (player2\image,75,85)
	Flip()
End Function

Function Rematch()
	DrawImage (background,75,75)
	DrawImage (textBack,75,75)

	SetFont font
	Locate (45,65)
	Print ("Would You Like")
	Locate (35,75)
	rematch = Input("A Rematch?: ")
End Function








;END FUNCTIONS

















;need to make sprites to dictate the opponents move e.i an arrow orsomething
; press the arrow key to choose a direction then press the attack/block button
;each player will have to guess if the other is gonna attack or not






