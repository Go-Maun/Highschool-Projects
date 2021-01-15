;Keegan Maundrell

;INITIALIZATION
;GRAPHICS
Const WINDOWWIDTH = 800
Const WINDOWHEIGHT = 600
Graphics(WINDOWWIDTH,WINDOWHEIGHT,0,2)
AutoMidHandle (True)
SetBuffer(BackBuffer())


;CONSTANTS
Const leftKey = 203
Const rightKey = 205
Const rotations = 16


;LOAD IMAGES
TFormFilter(0)
shipimage = LoadImage("spaceship.bmp")
backgroundimageclose = LoadImage("stars.bmp")
backgroundimagefar = LoadImage("starsfarther.bmp")


;Declair Array
Dim imagearray(rotations)

;For all of the rotations you want, copy the spaceship image and rotate it the correct amount of degrees
For frame = 0 To rotations - 1
	imagearray(frame) = CopyImage (shipimage)
	RotateImage imagearray(frame), frame*360/rotations
Next 

frame = 0

;GLOBALS
Global scrollx = 0
Global scrolly = 0
Global moveStar = 0
;SET FRAME TIMER
frameTimer = CreateTimer(60)

;MAIN


WaitTimer(frameTimer)
Repeat
Cls()

Text(400,100,"!!!!Press the SPACE BAR to power your SPACE SHIP!!!!",True,True)
Text(400,115,"!!!!Use the LEFT and RIGHT arrow keys to turn your SPACE SHIP!!!!",True,True)
Color(0,0,0)
MoveStar()

;Tile both backgrounds at proper speed
TileImage (backgroundimagefar,scrollx,scrolly)
TileImage (backgroundimageclose,scrollx*2,scrolly*2)
;Increment scrolly 



;Reset tracker variable if it gets too large
If scrolly >= ImageHeight(backgroundimageclose)
	scrolly = 0
EndIf

If scrollx >= ImageWidth(backgroundimageclose)
	scrollx = 0
EndIf



;Rotate the ship left if user presses left
	If KeyDown (leftKey)
	
			frame = frame - 1
			moveStar = frame
		If frame < 0
			frame = rotations - 1
			moveStar = frame
		EndIf
	;Rotate the ship right if user presses right
	ElseIf KeyDown (rightKey)
	
			frame = frame + 1
			moveStar = frame
		If frame >= rotations
			frame = 0
			moveStar = frame
		EndIf 
		
	EndIf


;Draw the current frame
MaskImage (imagearray(frame),0,0,0)
DrawImage (imagearray(frame),400,300)


Flip

Delay (20)
Until (KeyHit(1))
End()
;END MAIN

;FUNCTION 
Function MoveStar()
If KeyDown(57)
	If moveStar = 0
	scrollx = scrollx + 0
	scrolly = scrolly + 4
	ElseIf moveStar = 1
	scrollx = scrollx + 0
	scrolly = scrolly + 4
	ElseIf moveStar = 2
	scrollx = scrollx - 4
	scrolly = scrolly + 4
	ElseIf moveStar = 3
	scrollx = scrollx - 4
	scrolly = scrolly + 4
	ElseIf moveStar = 4
	scrollx = scrollx - 4
	scrolly = scrolly + 0
	ElseIf moveStar = 5
	scrollx = scrollx - 4
	scrolly = scrolly + 0
	ElseIf moveStar = 6
	scrollx = scrollx - 4
	scrolly = scrolly - 4
	ElseIf moveStar = 7
	scrollx = scrollx - 4
	scrolly = scrolly - 4
	ElseIf moveStar = 8
	scrollx = scrollx + 0
	scrolly = scrolly - 4
	ElseIf moveStar = 9
	scrollx = scrollx + 0
	scrolly = scrolly - 4
	ElseIf moveStar = 10
	scrollx = scrollx + 4
	scrolly = scrolly - 4
	ElseIf moveStar = 11
	scrollx = scrollx + 4
	scrolly = scrolly - 4
	ElseIf moveStar = 12
	scrollx = scrollx + 4
	scrolly = scrolly + 0
	ElseIf moveStar = 13
	scrollx = scrollx + 4
	scrolly = scrolly + 0
	ElseIf moveStar = 14
	scrollx = scrollx + 4
	scrolly = scrolly + 4
	ElseIf moveStar = 15
	scrollx = scrollx + 4
	scrolly = scrolly + 4
	EndIf
Else
	scrollx = scrollx + 0
	scrolly = scrolly + 0
	Color(255,255,255)
EndIf

End Function
;END FUNCTION








