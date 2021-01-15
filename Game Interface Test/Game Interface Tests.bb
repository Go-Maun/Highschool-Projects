;Keegan Maundrell. This program demonstrates the use of input and position functions built into blitz

;INITIALIZE GRAPHICS
Graphics(800,600,0,2)
AppTitle ("Game Interface Tests")
SetBuffer(BackBuffer())

;Load the images
background = LoadImage("stars.bmp")
MaskImage(background,0,0,0)

ship = LoadImage("ship.bmp")
HandleImage (ship,ImageWidth(ship)/2,ImageHeight(ship)/2)

targetR = LoadImage("targetRed.bmp")
HandleImage (targetR,ImageWidth(targetR)/2,ImageHeight(targetR)/2)
MaskImage (targetR,255,255,255)

targetG = LoadImage("targetGreen.bmp")
HandleImage (targetG,ImageWidth(targetG)/2,ImageHeight(targetG)/2)
MaskImage (targetG,255,255,255)

targetB = LoadImage("targetBlue.bmp")
HandleImage (targetB,ImageWidth(targetB)/2,ImageHeight(targetB)/2)
MaskImage (targetB,255,255,255)

;Type
Type ship
	Field x,y
End Type

Type target
	Field image
End Type

;Constants
Const escKey 	= 1
Const rKey 		= 114	;turns the target red
Const gKey 		= 103	;turns the target green
Const bKey 		= 98	;turns the target blue
Const sKey		= 31	;reset the mouse position and ship position to the middle of the screen

;Globals
Global shipLocal.ship = New ship
shipLocal\x = 400
shipLocal\y = 300

Global target.target = New target
target\image = targetR

Global value

;MAIN

Text(400,200,"What Colour would you like the target to be?",True,True)
Text(400,275,"The 'R' key turns the target Red",True,True)
Text(400,300,"The 'G' key turns the target Green",True,True)
Text(400,325,"The 'B' key turns the target Blue",True,True)
Text(400,375,"If none of the keys above are selected, the target will default to Red",True,True)
Text(400,400,"Press the button of your desired colour, then any key to continue.",True,True)
;asks the player for their choice of target colour
While Not value
value = GetKey()
Wend

If value = rKey
	target\image = targetR
ElseIf value = gKey
	target\image = targetG
ElseIf value = bKey
	target\image = targetB
EndIf

WaitKey()

;game loop
Repeat
	Cls()
	
	;the, with user input, scrolling background
	TileBlock(background,0,MouseZ()*15)
	
	HUD()
	
	Move()
	
	If (KeyDown(sKey))
		Reset()
	EndIf
	
	;draws out all the necessary images
	DrawImage (target\image,MouseX(),MouseY())
	DrawImage (ship,shipLocal\x,shipLocal\y)
	MaskImage (ship,0,0,0)
		
	Flip()
Until (KeyHit(escKey))
End()
;END MAIN

;FUNCTIONS

Function Move() ;tests where the user clicks the left mouse button and moves the ship there
	If MouseHit(1) ;Left Click
	shipLocal\x = MouseX()
	shipLocal\y = MouseY()
	EndIf
End Function

Function HUD() ;writes out the controls for the program
	Color(200,200,200)
	Text(15,15,"Click the Left Mouse Button to move the ship")
	Text(15,30,"Hold the 'S' Key to reset the mouse, and ship to the center of the screen")
	Text(15,45,"Use the Scroll Wheel to move the background up and down")
End Function

Function Reset() ;uses MoveMouse() to move the target and the ship to the center of the screen
	MoveMouse(400,300)
	shipLocal\x = 400
	shipLocal\y = 300
End Function
;END FUNCTIONS







