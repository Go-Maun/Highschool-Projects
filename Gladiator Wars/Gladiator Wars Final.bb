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

Global p1Health = LoadAnimImage ("p1Health.bmp",35,10,0,5)
MaskImage (p1Health,255,255,255)

Global p2Health = LoadAnimImage ("p2Health.bmp",35,10,0,5)
MaskImage (p2Health,255,255,255)

Global p1Win = LoadImage ("p1Wins.bmp")
MaskImage (p1Win,117,117,117)

Global p2Win = LoadImage ("p2Wins.bmp")
MaskImage (p2Win,117,117,117)

Global turnAttack = LoadImage ("turnAttack.bmp")
MaskImage (turnAttack,255,255,255)

Global turnBlock = LoadImage("turnBlock.bmp")
MaskImage (turnBlock,255,255,255)

Global Counter = LoadAnimImage("roundTime.bmp",20,20,0,11)
MaskImage (Counter,255,255,255)

Global textBack = LoadImage ("textBack.bmp")
MaskImage (textBack,255,255,255)

Global title = LoadImage ("titleScreen.bmp")

Global background = LoadImage ("background.bmp")

;Load Sound Effects
Global Hit = LoadSound ("Hit.wav")
Global ShieldHit = LoadSound ("ShieldHit.wav")

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
	Field health%			;the health of each player
	
End Type 
	
Type time
	Field image
	Field frame% ; the frame of the round timer sprite
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
player1\health = 4


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
player2\health = 4

Global time.time = New time
time\image = Counter
time\frame = 0 ;displays "10"

Global colourP1
Global p1knockCommit
Global p1deathCommit = 0
Global confirmP1 = 0 ;confirms that the player has hit a key


Global colourP2
Global p2knockCommit
Global p2deathCommit = 0
Global confirmP2 = 0 ;confirms that the player has hit a key


Global soundPlay = 0 ;makes it so the sound effects dont loop
Global turnTimer = 0 ;determines when to switch turns
Global CommandExecuted = 0 ;tests to see if a collision has occured, if so, stops all other possibilities to happen
Global turnOver = 0 ;tracks if the turn is over or not
Global timer# = 0 ;makes the timer go down each second
Global roundTimer% = 10 ;10 seconds for each player to choose a direction
Global turn ; if 0, player 1 is attacking, if 1 player2 is attacking
Global rematch$ ;restarts the game if yes is entered
Global win = 0 ;tests if any player has won a match
Global font = LoadFont ("arial",12,False,False,False)


;timer
frameTimer = CreateTimer(30)

;set randomizer
SeedRnd(MilliSecs())


;MAIN
	
	Cheering = PlayMusic ("Cheering.mp3")
	ChannelVolume (Cheering,.0075)

	Story()
	WaitKey()
	Cls()
	DrawImage (title,75,75)
	Flip()
	WaitKey()
	Cls()
	Repeat
		P1Colour()
	Until KeyHit(backSpace) 
	Cls()
	Repeat
		P2Colour()
	Until KeyHit(backSpace)
	Cls()
	Repeat
		HowToPlay1()
	Until KeyHit(backSpace)
	Cls()
	Repeat 
		HowToPlay2()
	Until KeyHit(backSpace)
	Cls()
	Repeat
		HowToPlay3()
	Until KeyHit(backSpace)
	Cls()
	Repeat
		HowToPlay4()
	Until KeyHit(backSpace)
	Cls()

	Repeat
		
		turn = Rand (0,1)
		Repeat
			
			WaitTimer(frameTimer)
			Cls()
			
			
			
			P1STAND()
			P2STAND()
			
			If turn = 0
				Repeat 
					Cls()
					DrawImage(background,75,75)
					DrawImage (turnAttack,player1\x,player1\y - 40,0)
					DrawImage (turnBlock,player2\x,player2\y - 40,0)

					RoundTimer()
					
					P1AIM()
					P1Health()
					P2AIM()
					p2Health()
					
					If confirmP1 = 1 And confirmP2 = 1
						roundTimer = 0
						timer = 0
						AttackP1()
						BlockP2()
						
						If CommandExecuted = 0
							Collision()
						EndIf

						If player1\aiming <> player2\aiming

							If player2\health > 0
								KnockP2()
							ElseIf player2\health = 0
								DeathP2()
							EndIf

							SoundHit()

						Else
						
							SoundShield()
						
						EndIf
						
						turnTimer = turnTimer + 1

						If turnTimer = 200
							turnOver = 1
						EndIf
			
					EndIf
					
					DrawImage (player1\image,player1\x + player1\xOffset,player1\y,player1\frame)
					DrawImage (player2\image,player2\x + player2\xOffset,player2\y,player2\frame)

					Flip()		
				Until (turnOver = 1)
					
			ElseIf turn = 1
	
				Repeat

					Cls()
					DrawImage(background,75,75)
					DrawImage (turnBlock,player1\x,player1\y - 40,0)
					DrawImage (turnAttack,player2\x,player2\y - 40,0)

					RoundTimer()
					
					P1AIM()
					P1Health()
					P2AIM()
					p2Health()
					
					If confirmP1 = 1 And confirmP2 = 1
						roundTimer = 0
						timer = 0
						AttackP2()
						BlockP1()
						
						If CommandExecuted = 0
							Collision()
						EndIf

						If player1\aiming <> player2\aiming

							If player1\health > 0
								KnockP1()
							ElseIf player1\health = 0
								DeathP1()
								
							EndIf

							SoundHit()

						Else

							SoundShield()					

						EndIf
						
						turnTimer = turnTimer + 1

						If turnTimer = 200
							turnOver = 1
						EndIf	
							
					EndIf
				
					DrawImage (player1\image,player1\x + player1\xOffset,player1\y,player1\frame)
					DrawImage (player2\image,player2\x + player2\xOffset,player2\y,player2\frame)

					Flip()		
				
				Until (turnOver = 1)

			EndIf

			Flip()

			RoundGarbageCollection()

		Until (win = 1)
			
			GameGarbageCollection()
			Rematch()	
	
	Until (rematch = "no" Or rematch = "No")

	End ()
;END MAIN







;FUNCTIONS

;this function brings up the block sprite for player 1
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


;this function brings up the block sprite for player 2
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


;this fnction brings up the attack sprite for player 1
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


;this function brings up the attack sprite for player 2
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


;this function plays the knocked down animation for player 1
Function KnockP1()

	If player1\colour = "red"
		player1\image = KORightRed
	ElseIf player1\colour = "green"
		player1\image = KORightGreen
	ElseIf player1\colour = "purple"
		player1\image = KORightPurple
	EndIf
	
	player1\frame = player1\animationCount
	player1\animationCount = player1\animationCount + 0.04

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


;this function plays the knocked down animation for player 2
Function KnockP2()
	
	If player2\colour = "red"
		player2\image = KOLeftRed
	ElseIf player2\colour = "green"
		player2\image = KOLeftGreen
	ElseIf player2\colour = "purple"
		player2\image = KOLeftPurple
	EndIf
	
	player2\frame = player2\animationCount
	player2\animationCount = player2\animationCount + 0.04

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


;this function plays the death animation for player 1
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
	player1\animationCount = player1\animationCount + 0.04

	If player1\frame > 4
		player1\animationTimer = player1\animationTimer + 1
		player1\frame = 4
	EndIf
	DrawImage (p2Win,75,50,0)
	If player1\animationTimer = 100
		player1\frame = 0
		player1\animationCount = 0
		player1\animationTimer = 0
		p1deathCommit = 1
		win = 1
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


;this function plays the death animation for player 2
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
	player2\animationCount = player2\animationCount + 0.04

	If player2\frame > 4
		player2\animationTimer = player2\animationTimer + 1
		player2\frame = 4
	EndIf
	DrawImage (p1Win,75,50,0)
	If player2\animationTimer = 100
		player2\frame = 0
		player2\animationCount = 0
		player2\animationTimer = 0
		p2deathCommit = 1
		win = 1
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


;this function tracks where player 1 aimed
Function P1AIM()
	If confirmP1 <> 1
		If (KeyHit (wKey)) 
			player1\aiming = "up"
			confirmP1 = 1
		ElseIf (KeyHit (sKey))
			player1\aiming = "down"
			confirmP1 = 1
		ElseIf (KeyHit (dkey))
			player1\aiming = "middle"
			confirmP1 = 1
		EndIf
	EndIf
End Function


;this function tracks where player 2 is aimed
Function P2AIM()
	If confirmP2<> 1
		If (KeyHit (upKey)) 
			player2\aiming = "up"
			confirmP2= 1
		ElseIf (KeyHit (downKey))
			player2\aiming = "down"
			confirmP2= 1
		ElseIf (KeyHit (leftKey))
			player2\aiming = "middle"
			confirmP2= 1
		EndIf
	EndIf
End Function


;this function tells the game to display the idle sprite for player 1
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


;this function tells the game to display the idle sprite for player 2
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


;this function is used for selecting player 1's colour
Function P1Colour()
	Cls()

	DrawImage (background,75,75)
	DrawImage (textBack,75,75)

	SetFont font
	Text (75,20,"Player 1, Choose Your Colour:",True,True)
	Text (75,40,"Press 'R' for Red",True,True)
	Text (75,50,"Press 'P' for Purple",True,True)
	Text (75,60,"Press 'G' for Green",True,True)
	Text (75,130,"Press 'Back Space' to Confirm",True,True)
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


;this function is used for selecting player 2's colour
Function P2Colour()
	Cls()

	DrawImage (background,75,75)
	DrawImage (textBack,75,75)

	SetFont font
	Text (75,20,"Player 2, Choose Your Colour:",True,True)
	Text (75,40,"Press 'R' for Red",True,True)
	Text (75,50,"Press 'P' for Purple",True,True)
	Text (75,60,"Press 'G' for Green",True,True)
	Text (75,130,"Press 'Back Space' to Confirm",True,True)
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


;this function is used for restarting the game
Function Rematch()
	DrawImage (background,75,75)
	DrawImage (textBack,75,75)

	SetFont font
	Text (75,65,"Would You Like",True,True)
	Text (75,75,"A Rematch?",True,True)
	Text (75,85,"Yes Or No?",True,True)
	Locate (65,95)
	rematch = Input ("")
End Function


;this function resets all turn based variables to complete a round
Function RoundGarbageCollection()
	confirmP1 = 0
	confirmP2 = 0
	timer = 0
	roundTimer = 10
	CommandExecuted = 0
	turnOver = 0
	turnTimer = 0
	soundPlay = 0
	If turn = 1
		turn = 0
	Else
		turn = 1
	EndIf
End Function


;this function resets all game based variables to complete the retart
Function GameGarbageCollection()
	win = 0
	player1\health = 4
	player2\health = 4
	p1deathCommit = 0
	p2deathCommit = 0
End Function


;this function tests whether an attack was blocked or not
Function Collision()
	If turn = 0
		
		If player1\aiming = "up"

			If player2\aiming = "up"
				player2\health = player2\health - 0

				CommandExecuted = 1

			ElseIf player2\aiming = "middle"

				If player2\health > 1
					player2\health = player2\health - 1
					KnockP2()
				ElseIf player2\health = 1
					player2\health = player2\health - 1
					DeathP2()
				EndIf

				CommandExecuted = 1

			ElseIf player2\aiming = "down"

				If player2\health > 1
					player2\health = player2\health - 1
					KnockP2()
				ElseIf player2\health = 1
					player2\health = player2\health - 1
					DeathP2()
				EndIf

				CommandExecuted = 1

			EndIf

		ElseIf player1\aiming = "middle"

			If player2\aiming = "up"

				If player2\health > 1
					player2\health = player2\health - 1
					KnockP2()
				ElseIf player2\health = 1
					player2\health = player2\health - 1
					DeathP2()
				EndIf

				CommandExecuted = 1

			ElseIf player2\aiming = "middle"
				player2\health = player2\health - 0

				CommandExecuted = 1

			ElseIf player2\aiming = "down"

				If player2\health > 1
					player2\health = player2\health - 1
					KnockP2()
				ElseIf player2\health = 1
					player2\health = player2\health - 1
					DeathP2()
				EndIf

				CommandExecuted = 1

			EndIf

		ElseIf player1\aiming = "down"

			If player2\aiming = "up"

				If player2\health > 1
					player2\health = player2\health - 1
					KnockP2()
				ElseIf player2\health = 1
					player2\health = player2\health - 1
					DeathP2()
				EndIf

				CommandExecuted = 1

			ElseIf player2\aiming = "middle"

				If player2\health > 1
					player2\health = player2\health - 1
					KnockP2()
				ElseIf player2\health = 1
					player2\health = player2\health - 1
					DeathP2()
				EndIf

				CommandExecuted = 1

			ElseIf player2\aiming = "down"
				player2\health = player2\health - 0

				CommandExecuted = 1

			EndIf

		EndIf

	ElseIf turn = 1

		If player2\aiming = "up"

			If player1\aiming = "up"
				player1\health = player1\health - 0

				CommandExecuted = 1

			ElseIf player1\aiming = "middle"

				If player1\health > 1
					player1\health = player1\health - 1
					KnockP1()
				ElseIf player1\health = 1
					player1\health = player1\health - 1
					DeathP1()
				EndIf

				CommandExecuted = 1

			ElseIf player1\aiming = "down"

				If player1\health > 1
					player1\health = player1\health - 1
					KnockP1()
				ElseIf player1\health = 1
					player1\health = player1\health - 1
					DeathP1()
				EndIf

				CommandExecuted = 1

			EndIf

		ElseIf player2\aiming = "middle"

			If player1\aiming = "up"

				If player1\health > 1
					player1\health = player1\health - 1
					KnockP1()
				ElseIf player1\health = 1
					player1\health = player1\health - 1
					DeathP1()
				EndIf

				CommandExecuted = 1

			ElseIf player1\aiming = "middle"
				player1\health = player1\health - 0

				CommandExecuted = 1

			ElseIf player1\aiming = "down"

				If player1\health > 1
					player1\health = player1\health - 1
					KnockP1()
				ElseIf player1\health = 1
					player1\health = player1\health - 1
					DeathP1()
				EndIf

				CommandExecuted = 1

			EndIf

		ElseIf player2\aiming = "down"

			If player1\aiming = "up"
				If player1\health > 1
					player1\health = player1\health - 1
					KnockP1()
				ElseIf player1\health = 1
					player1\health = player1\health - 1
					DeathP1()
				EndIf

				CommandExecuted = 1

			ElseIf player1\aiming = "middle"

				If player1\health > 1
					player1\health = player1\health - 1
					KnockP1()
				ElseIf player1\health = 1
					player1\health = player1\health - 1
					DeathP1()
				EndIf

				CommandExecuted = 1

			ElseIf player1\aiming = "down"
				player1\health = player1\health - 0

				CommandExecuted = 1

			EndIf

		EndIf
	
	EndIf

End Function


;INSTUCTION FUNCTIONS
Function HowToPlay1()
	
	DrawImage(background,75,75)
	DrawImage(textBack,75,75)
	SetFont font
	Text (75,15,"How To Play:",True,True)
	Text (75,25,"To Aim Up:",True,True)
	
	If player1\colour = "red"
		DrawImage (attackUpRightRed,58,60)
	ElseIf player1\colour = "green"
		DrawImage (attackUpRightGreen,58,60)
	ElseIf player1\colour = "purple"
		DrawImage (attackUpRightPurple,58,60)
	EndIf
	
	If player2\colour = "red"
		DrawImage (blockUpLeftRed,112,60)
	ElseIf player2\colour = "green"
		DrawImage (blockUpLeftGreen,112,60)
	ElseIf player2\colour = "purple"
		DrawImage (blockUpLeftPurple,112,60)
	EndIf
	
	Text (50,100,"Player1 Press ' W '",True,True)
	Text (100,115,"Player2 Press 'Up'",True,True)
	Text (75,135,"Press 'Back Space' to Continue",True,True)
	Flip()
	
End Function

Function HowToPlay2()
	
	DrawImage(background,75,75)
	DrawImage(textBack,75,75)
	SetFont font
	Text (75,15,"How To Play:",True,True)
	Text (75,25,"To Aim Middle:",True,True)
	
	If player1\colour = "red"
		DrawImage (attackMidRightRed,58,60)
	ElseIf player1\colour = "green"
		DrawImage (attackMidRightGreen,58,60)
	ElseIf player1\colour = "purple"
		DrawImage (attackMidRightPurple,58,60)
	EndIf
	
	If player2\colour = "red"
		DrawImage (blockMidLeftRed,114,60)
	ElseIf player2\colour = "green"
		DrawImage (blockMidLeftGreen,114,60)
	ElseIf player2\colour = "purple"
		DrawImage (blockMidLeftPurple,114,60)
	EndIf
	
	Text (50,100,"Player1 Press ' D '",True,True)
	Text (100,115,"Player2 Press 'Left'",True,True)
	Text (75,135,"Press 'Back Space' to Continue",True,True)
	Flip()
	
End Function

Function HowToPlay3()
	
	DrawImage(background,75,75)
	DrawImage(textBack,75,75)
	SetFont font
	Text (75,15,"How To Play:",True,True)
	Text (75,25,"To Aim Down:",True,True)
	
	If player1\colour = "red"
		DrawImage (attackDownRightRed,58,60)
	ElseIf player1\colour = "green"
		DrawImage (attackDownRightGreen,58,60)
	ElseIf player1\colour = "purple"
		DrawImage (attackDownRightPurple,58,60)
	EndIf
	
	If player2\colour = "red"
		DrawImage (blockDownLeftRed,113,60)
	ElseIf player2\colour = "green"
		DrawImage (blockDownLeftGreen,113,60)
	ElseIf player2\colour = "purple"
		DrawImage (blockDownLeftPurple,113,60)
	EndIf
	
	Text (50,100,"Player1 Press ' S '",True,True)
	Text (100,115,"Player2 Press 'Down'",True,True)
	Text (75,135,"Press 'Back Space' to Continue",True,True)
	Flip()

End Function

Function HowToPlay4()

	DrawImage(background,75,75)
	DrawImage(textBack,75,75)
	SetFont font
	Text (75,15,"How To Play:",True,True)
	Text (75,25,"T u r n s:",True,True)
	
	DrawImage (turnAttack,75,45,0)
	DrawImage (turnBlock,75,90,0)
	
	Text (75,60,"This Sword Means You ",True,True)
	Text (75,70,"Are Attacking",True,True)
	Text (75,105,"This Shield Means You ",True,True)
	Text (75,115,"Are Blocking",True,True)
	Text (75,135,"Press 'Back Space' to Continue",True,True)
	Flip()

End Function
;END INSTRUCTION FUNCTIONS


;this function displays the round timer and tells the game to auto aim each player to "middle if they've not selected by the time the time runs out 
Function RoundTimer()
	timer = timer + .2
	roundTimer = 10 - timer/60
	time\frame = 10 - roundTimer
	DrawImage (time\image,77,22,time\frame)
	If roundTimer = 0
		timer = 0
		time\frame = 10
		If confirmP1 = 0
			player1\aiming = "middle"
			confirmP1 = 1
		EndIf
		If confirmP2 = 0
			player2\aiming = "middle"
			confirmP2 = 1
		EndIf
	EndIf

End Function

Function Story()

	DrawImage(background,75,75)
	DrawImage(textBack,75,75)
	SetFont font
	Text (75,30,"Welcome To The Arena!",True,True)
	Text (75,45,"It Is Destiny For A",True,True)
	Text (75,55,"Gladiator To Live ,",True,True)
	Text (75,65,"Fight , And Die For",True,True)
	Text (75,75,"The Arena!",True,True)
	Text (75,90,"They Are Strategic,",True,True)
	Text (75,100,"Ferocious, And Agile!",True,True)
	Text (75,110,"And They All Fight In The...",True,True)
	Flip()

End Function

;this function tracks player 1's health
Function P1Health()
	p1frame = 4 - player1\health
	If p1frame > 4
		p1frame = 4
	EndIf
	DrawImage (p1Health,36,144,p1frame)
End Function


;this function tracks player 2's health
Function P2Health()
	p2frame = 4 - player2\health
	If p2frame > 4
		psframe = 4
	EndIf
	DrawImage (p2Health,113,144,p2frame)
End Function


;this function creates the shield hitting sound effect
Function SoundShield()

	If soundPlay <> 1

		PlaySound ShieldHit
		soundPlay = 1

	EndIf

End Function


;this function creates the getting hot sound effect
Function SoundHit()
	
	If soundPlay <> 1

		PlaySound Hit
		soundPlay = 1

	EndIf

End Function
;END FUNCTIONS

