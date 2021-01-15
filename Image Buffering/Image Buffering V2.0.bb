;Keegan Maundrell, this program demonstrates the use of image buffering and pixel arrays

;INITIALIZATION

;Set up the graphics window
Const WINDOWWIDTH = 800
Const WINDOWHEIGHT = 600
Graphics (WINDOWWIDTH,WINDOWHEIGHT,0,2)

AppTitle ("Image Buffering")

;constants
Const ESC = 1
Const SPACEBAR = 57
Const A = 30
Const B = 48
Const C = 46
Const D = 32
Const E = 18

;set up the random number
SeedRnd(MilliSecs())

;load image
AutoMidHandle(True)
Global sImage = LoadImage("unusual.bmp")
Global sImageX = WINDOWWIDTH/2
Global sImageY = WINDOWHEIGHT/2
Global sImageW = ImageWidth(sImage)
Global sImageH = ImageHeight(sImage)

;variables
Global fontH = FontHeight()
Global ssNum = 0 ;screen shot number
Dim pixelArray(sImageW, sImageH)




;MAIN PROGRAM
Repeat
	
	Cls()
	
	DrawMenu()
	
	If KeyHit(SPACEBAR) Then
		MoveImage()
	EndIf
	
	If KeyHit(A) Then
		AddShape()
	EndIf
	
	If KeyHit(B) Then
		ResetImage()
	EndIf
	
	If KeyHit(C) Then
		FlipHorz()
	EndIf
	
	If KeyHit(D) Then
		FlipVert()
	EndIf
	
	;display image
	DrawImage(sImage,sImageX,sImageY)
	
	Flip()
	
	If KeyHit(E) Then
		ScrSht()
	EndIf
	
Until (KeyHit(ESC))

End ()
;END MAIN


;FUNCTION DECLAIRATIONS
Function DrawMenu()
	Color(200,200,200)
	Text(10,2*fontH, "Menu")
	Text(10,3*fontH, "SPACEBAR = move image")
	Text(10,4*fontH, "A = add shape")
	Text(10,5*fontH, "B = reset image")
	Text(10,6*fontH, "C = flip horizontal")
	Text(10,7*fontH, "D = flip vertical")
	Text(10,8*fontH, "E = take screenshot")
	Text(10,9*fontH, "ESC = quit")
	
End Function
; moves the image to a random location on screen
Function MoveImage() 
	
	sImageX = Rand(sImageW/2,WINDOWWIDTH - sImageW/2)
	sImageY = Rand(sImageH/2,WINDOWHEIGHT - sImageH/2)
	
End Function

;adds and oval with random colour and location onto sImage
Function AddShape()
	
	SetBuffer (ImageBuffer(sImage))
	Color (Rand(0,255),Rand(0,255),Rand(0,255))
	Oval(Rand(0,sImageW),Rand(0,sImageH),Rand(10,100),Rand(10,100),Rand(0,1))
	SetBuffer (BackBuffer())
	
End Function

;restores the original image to sImage
Function ResetImage()
	
	sImage = LoadImage("unusual.bmp")
	
End Function


;Flips the small image horixontally
Function FlipHorz()
	;read in the pixels (colours) from the image into an array
	SetBuffer (ImageBuffer(sImage))
	LockBuffer() 	
	
	For x = 0 To sImageW
		For y = 0 To sImageH
			pixelArray(x,y) = ReadPixelFast(x,y)
		Next
	Next
	
	;write the pixel values from the pixelArray back into sImage, reverse the horz direction
	For x = 0 To sImageW
		For y = 0 To sImageH
			WritePixelFast(x,y,pixelArray(sImageW-x,y))
		Next
	Next
	
	UnlockBuffer ()
	SetBuffer (BackBuffer())
	
End Function

;flips the small image vertically
Function FlipVert()
	;read in the pixels (colours) from the image into an array
	SetBuffer (ImageBuffer(sImage))
	LockBuffer() 	
	
	For x = 0 To sImageW
		For y = 0 To sImageH
			pixelArray(x,y) = ReadPixelFast(x,y)
		Next
	Next
	
	;write the pixel values from the pixelArray back into sImage, reverse the horz direction
	For x = 0 To sImageW
		For y = 0 To sImageH
			WritePixelFast(x,y,pixelArray(x,sImageH-y))
		Next
	Next
	
	UnlockBuffer ()
	SetBuffer (BackBuffer())

End Function

;captures an image of the entire window
Function ScrSht()
	
	ssNum = ssNum + 1
	SaveBuffer(FrontBuffer(), "screenshot" + ssNum + ".bmp")

End Function




;END FUNCTION DELAIRATIONS

























