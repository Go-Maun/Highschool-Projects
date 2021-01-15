;Keegan Maundrell this game demonstrates all that ive learned so far.


;PROGRAM INITIALIZATION [properties that are only ever set once]

;Graphics
Graphics(800,600,0,2)
SetBuffer(BackBuffer())
AppTitle ("The Hunt: Hunt or Be Hunted")
;Types

Type player
Field x,y
Field lives
Field sprite$
End Type

Type enemy
Field x,y
Field EnSprite$
Field atk
Field run
End Type

Type obstacle
Field x,y
End Type

;Constants
Const escKey = 1, upKey = 200, leftKey = 203, downKey = 208, rightKey = 205, spaceBar = 57
Const PlayAtk$ = ("<X>"), PlayRun$ = ("(O)"), EnSprite$ = ("{H}")
Const bEmpty$ = ("[          ]"), b1$ = ("[|         ]"), b2$ = ("[||        ]"), b3$ = ("[|||       ]"), b4$ = ("[||||      ]"), b5$ = ("[|||||     ]"), b6$ = ("[||||||    ]"), b7$ = ("[|||||||   ]"), b8$ = ("[||||||||  ]"), b9$ = ("[||||||||| ]"), b10$ = ("[||||||||||]")

;Globals
Global player.player = New player
Global enemy.enemy = New enemy
Global obstacle.obstacle = New obstacle
Global EnStartX = Rnd(20,780)
Global EnStartY = Rnd(20,580)
Global BCHARGE = 4
Global timer
Global time
Global charge
Global recharge
Global hunt = 0 ; determines if enemies chase player or not. 0 = not active, 1 = active
Global bar$
Global difficulty# = 1 ; 1-3, determines the enemies speed. increments of .2 increases (1 less than player)Global dead = 0
Global EnemyCounter = 5
Global ObstacleCount = 5
Global move = 1
Global name$
Global dead = 0
Global replay$ = reset
Global level

Global MakeEnemy
player\sprite = PlayRun
player\x = 388
player\y = 293
enemy\EnSprite = EnSprite


;Seed random number generator
SeedRnd(MilliSecs())
;Set frametimer
frameTimer = CreateTimer(60)


;GAME INITIALIZATION [properties set for each game replay]

Repeat
	;Create player
	Begin()
	level = 0
	dead = 0
	
	;LEVEL INITIALIZATION [properties that are set at the beginning of each level]
	Repeat
		level = level + 1
		DrawEnemy()
		DrawObstacle()
		;Create & position enemies
		;Create $ position other things (barriers, pickups, etc)
		;Position player
		;Show level feedback (instructions, encouragement, hints)
		
		
		;GAME LOOP
		Repeat
			Cls()
			WaitTimer(frameTimer)
			Text (player\x,player\y,player\sprite)	
			TestInput()
			HuntMode()
			MoveEnemy()
			HUD(BCHARGE)
			Bar()
			Obstacle()
			Collision()
			;function calls [check player input, update movements, check collisions, draw objects & hud]
			
			Flip()
		Until (EnemyCounter = 0 Or dead = 1);'the level is complete Or player is dead')
			Cls()
			Garbage()
			Level()
			Delay(1000)
		;Garbage collection for level
		
	Until (level = 4 Or dead = 1);'all levels complete Or player is dead')
	
		Reset()

	;Show congrats/consolation screen
	;Garbage collection for game (delete player)
	;Ask if replay/quit
	
Until (replay$ = "n" Or "N")

End()


;FUNCTION DECLARATIONS

Function TestInput() ;tests input

For obstacle.obstacle = Each obstacle
	If (player\x <= obstacle\x + 30 And player\x >= obstacle\x - 20) And (player\y <= obstacle\y + 50  And player\y >= obstacle\y - 10) 
		If KeyDown (rightKey)
		player\x = player\x - 4
		ElseIf KeyDown (leftKey)
		player\x = player\x + 4
		ElseIf KeyDown (upKey)
		player\y = player\y + 4
		ElseIf KeyDown (downKey)
		player\y = player\y - 4
		EndIf
		Text (50,0,"walls are working")
	EndIf
Next


;If Left is pressed, move Left
If KeyDown (leftKey)
	If player\x < 0 
		player\x = player\x + 0
	Else
		player\x = player\x - 4
	EndIf
EndIf 

;If rightkey is is pressed, move right
If KeyDown (rightKey)
	If player\x > 775 
		player\x = player\x + 0
	Else
		player\x = player\x + 4
	EndIf
EndIf 

;if up key is pressed, move up
If KeyDown (upKey)
	If player\y < 0 
		player\y = player\y + 0
	Else
		player\y = player\y - 4
	EndIf
EndIf

;if down key is pressed, move down
If KeyDown (downKey)
	If player\y > 585  
		player\y = player\y + 0
	Else
		player\y = player\y + 4
	EndIf
EndIf

;if space bar held, goes into hunt mode
If KeyDown (spaceBar)
	hunt = 1
Else
	hunt = 0
EndIf
If BCHARGE = 0
	hunt = 0
EndIf


End Function

Function HuntMode() ;determines if the player wil die or not when a collision occurs
If hunt = 0
	player\sprite = PlayRun
ElseIf hunt = 1
	player\sprite = PlayAtk
EndIf 
End Function


Function HUD(charge); the hud of the game
Text (400,25,"Hunt Charge at " + BCHARGE + "0%", True,True)
Text (400,40,bar,True,True)

If charge = 0
	bar = bEmpty
ElseIf charge = 1
	bar = b1
ElseIf charge = 2
	bar = b2
ElseIf charge = 3
	bar = b3
ElseIf charge = 4	
	bar = b4
ElseIf charge = 5
	bar = b5
ElseIf charge = 6
	bar = b6
ElseIf charge = 7
	bar = b7
ElseIf charge = 8	
	bar = b8
ElseIf charge = 9
	bar = b9
ElseIf charge = 10
	bar = b10 
EndIf	

End Function

Function Bar() ; the hunt bar, tells the player if they can get hit or not
	If KeyDown(spaceBar)
		If BCHARGE > 0
			charge = 0
			time =  1
			If time = 1
				timer = timer + 1
				If timer = 90
					timer = 0
					BCHARGE = BCHARGE - 1
				EndIf
			EndIf
			If charge = 0
				recharge = recharge
			EndIf
		EndIf
	Else
		If BCHARGE < 10	
			time = 0
			charge =  1
			If charge = 1
				recharge = recharge + 1
				If recharge = 150
					BCHARGE = BCHARGE + 1
					recharge = 0
				EndIf
			EndIf
			If time = 0
				timer = timer
			EndIf
		EndIf 
	EndIf
End Function

Function DrawEnemy() ;draws the ebemies
	For MakeEnemy = 0 To 4
		enemy.enemy = New enemy
		enemy\x = Rand(20,780)
		enemy\y = Rand(20,580)
		enemy\EnSprite = EnSprite
		For enemy.enemy = Each enemy
			Text (enemy\x,enemy\y,enemy\EnSprite)
		Next
	Next
End Function 

Function MoveEnemy() ;moves the enemies
	For enemy.enemy = Each enemy
		If enemy\x < 0 
			enemy\x = 0
		ElseIf enemy\x + 25 > 800
			enemy\x = 775
		EndIf
		If enemy\y < 0
			enemy\y = 0
		ElseIf enemy\y + 15 > 600
			enemy\y = 585
		EndIf
		If hunt = 0
			If (enemy\x < player\x) And (enemy\y < player\y)
				enemy\x = enemy\x + difficulty
				enemy\y = enemy\y + difficulty
			EndIf
			If (enemy\x < player\x) And (enemy\y > player\y)
				enemy\x = enemy\x + difficulty
				enemy\y = enemy\y - difficulty
			EndIf
			If (enemy\x > player\x) And (enemy\y < player\y)
				enemy\x = enemy\x - difficulty
				enemy\y = enemy\y + difficulty
			EndIf
			If (enemy\x > player\x) And (enemy\y > player\y)
				enemy\x = enemy\x - difficulty
				enemy\y = enemy\y - difficulty
			EndIf
			If (enemy\x > player\x) And (enemy\y = player\y)
				enemy\x = enemy\x - difficulty
			EndIf
			If (enemy\x < player\x) And (enemy\y = player\y)
				enemy\x = enemy\x + difficulty
			EndIf
			If (enemy\x = player\x) And (enemy\y > player\y)
				enemy\y = enemy\y - difficulty
			EndIf
			If (enemy\x = player\x) And (enemy\y < player\y)
				enemy\y = enemy\y + difficulty
			EndIf
		Else 
			If (enemy\x < player\x) And (enemy\y < player\y)
				enemy\x = enemy\x - difficulty
				enemy\y = enemy\y - difficulty
			EndIf
			If (enemy\x < player\x) And (enemy\y > player\y)
				enemy\x = enemy\x - difficulty
				enemy\y = enemy\y + difficulty
			EndIf
			If (enemy\x > player\x) And (enemy\y < player\y)
				enemy\x = enemy\x + difficulty
				enemy\y = enemy\y - difficulty
			EndIf
			If (enemy\x > player\x) And (enemy\y > player\y)
				enemy\x = enemy\x + difficulty
				enemy\y = enemy\y + difficulty
			EndIf
			If (enemy\x > player\x) And (enemy\y = player\y)
				enemy\x = enemy\x + difficulty
			EndIf
			If (enemy\x < player\x) And (enemy\y = player\y)
				enemy\x = enemy\x - difficulty
			EndIf
			If (enemy\x = player\x) And (enemy\y > player\y)
				enemy\y = enemy\y + difficulty
			EndIf
			If (enemy\x = player\x) And (enemy\y < player\y)
				enemy\y = enemy\y - difficulty
			EndIf
			EndIf
		
		Text (enemy\x,enemy\y,enemy\EnSprite)
	Next 
End Function 

Function Collision() ; tests collisions between the player and the enemies
	For enemy.enemy = Each enemy
		If hunt = 1 
			If (player\x <= enemy\x + 16 And player\x >= enemy\x - 16) And (player\y <= enemy\y + 10 And player\y >= enemy\y - 10)
				Delete enemy.enemy
				EnemyCounter = EnemyCounter - 1
			EndIf
		EndIf
		If hunt = 0
			If (player\x <= enemy\x + 16 And player\x >= enemy\x - 16) And (player\y <= enemy\y + 10 And player\y >= enemy\y - 10)
				dead = 1			
			EndIf
		EndIf
	Next
	
End Function

Function DrawObstacle() ; draws the traps placed randomly in the level
For ObstacleCount = 1 To 9
	obstacle.obstacle = New obstacle
	obstacle\x = Rand(50,750)
	obstacle\y = Rand(50,550)
	Text (obstacle\x,obstacle\y,"|---|")
	Text (obstacle\x,obstacle\y+12,"|   |")
	Text (obstacle\x,obstacle\y+24,"|   |")
	Text (obstacle\x,obstacle\y+36,"|---|")
Next
End Function

Function Obstacle(); keeps the obstacles in place over the clear screen
For obstacle.obstacle = Each obstacle
	Text (obstacle\x,obstacle\y,"|---|")
	Text (obstacle\x,obstacle\y+12,"|   |")
	Text (obstacle\x,obstacle\y+24,"|   |")
	Text (obstacle\x,obstacle\y+36,"|---|")
Next
End Function


Function Begin() ; gives back stor and tells the player how to play the game
Print ("This is THE HUNT and you are my prisoner!")
Delay (2000)
Print ("")
name$=Input("What is your name, prisoner? ")
Print ("")
Print (name$ + ", this is how to escape:")
Print ("")
Print ("You are an 'O'. Use the arrow keys to navigate. Dont let the guards catch you or you'll die!")
Print ("")
Print ("Beware the traps, you'll get caught if you aren't careful! You'll have to escape them!")
Print ("")
Print ("Can you beat them? Hold the space bar to become an 'X', guards hate X's")
Print ("")
Print ("Every floor cleared results in higher trained guards!")
Print ("")
Print ("Dont let your power meter run out or you'll become an 'O' again. It recharges slowly over time")
Print ("")
Print ("Are you ready, " + name$ + "? Press any key to begin your journey!")
WaitKey ()
Print ("")
Print ("Run, " + name$ + ", but catch them before they catch you.")
Print ("")
Delay (2500)
End Function

Function Garbage() ; deletes all the non esential elements to be replaced
For obstacle = Each obstacle
	Delete obstacle
Next
For enemy = Each enemy
	Delete enemy
Next

Cls()
End Function

Function Reset(); determines whether or not the player should be congratualted for winning or asked to play again if they died
	If dead = 1
		Cls()
		Print(name$ + ", You Died!")
		Delay(2000)
		replay$ = Input ("Do you want to play again? Type n for no, y for yes. ")
		If replay$ = "n" Or "N"
			Print("")
			Print("Thanks for playing!")
			Delay(2500)	
		End()
		ElseIf replay$ = "y" Or "Y"
			EnemyCounter = 0
			level = 0
			player\x = 388
			player\y = 293
			For enemy = Each enemy
				Delete enemy
			Next
			For obstacle = Each obstacle
				Delete obstacle
			Next
			difficulty = 1
			EnemyCounter = 5
			BCHARGE = 4
			ObstacleCount = 5
			replay$ = reset
			hunt = 0
		EndIf
	ElseIf dead = 0
		Cls()
		Print ("Congratulations, " + name$ + "! You Escapped The Prison! Press Any Button To Taste Freedom!")
		Delay(1500)
		WaitKey()
		End()
	EndIf
End Function


Function Level() ; increases the levels of the game
	player\x = 388
	player\y = 293
	For enemy = Each enemy
		Delete enemy
	Next
	For obstacle = Each obstacle
		Delete obstacle
	Next
	EnemyCounter = 5
End Function


;Game Idea: 
;kind of like pacman but the main goal is to get all of the enemies before they get you
;if a key is held a bar will gradually deplete and you can get the enemies but if the 
;key is not held you will get caught and lose a life(maybe). bar replenishes over time.
;randomly places obstacles in each level(may need to tweak enemy ai for that)

;PlaySpriteRun is 26 wide by 15 tall

;garbage collection is gona tell game to either restart from begnining (dif. back to 1, encount back to #, and dead = 0, replay = 1)

;make new play againm variab;e to use fo restarting in the loop in main game loop



;TEST IF AN "AND" STATEMENT CAN GO INSIDE AN ELSEIF REMARK



