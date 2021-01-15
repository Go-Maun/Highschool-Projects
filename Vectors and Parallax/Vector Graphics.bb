;Keegan Maundrell



;GRAPHICS
Graphics (800,600,0,2)
AppTitle ("Vector Graphics")
SetBuffer(BackBuffer())


;INITIALIZATION


;Types
Type point
	Field x,y
End Type


;Constants

Const escKey = 1
Const upKey = 200
Const downKey = 208
Const leftKey = 203
Const rightKey = 205
Const scaleDown = 51 ; the '<' key
Const scaleUp = 52 ;the '>' key


;Global
;indentifying all 6 points on our ship
point1.point = New point
point2.point = New point
point3.point = New point
point4.point = New point
point5.point = New point
point6.point = New point
;giving each point an x and y value based on the ships origin
point1\x = 0
point1\y = -60

point2\x = -30
point2\y = 40

point3\x = 30
point3\y = 40

point4\x = -15
point4\y = 20

point5\x = 15
point5\y = 20

point6\x = 0
point6\y = 60

Global xs = 400 ;center of ship
Global ys = 300 ;center of ship
Global sxyDown# = .5
Global sxyUp# = 2

;frame timer
frameTimer = CreateTimer(60)

;MAIN

Repeat 
	WaitTimer(frameTimer)
	Cls()
	
	Text(400,30,"Press the '<' key and the '>' key to scale the ship up and down.",True,True)
	Text(400,45,"Use the arrow keys to move the ship around the screen",True,True)

	If (KeyDown(upKey))
		ys = ys - 3
	EndIf
	
	If (KeyDown(downKey))
		ys = ys + 3
	EndIf
	
	If (KeyDown(leftKey))
		xs = xs - 3
	EndIf
	
	If (KeyDown(rightKey))
		xs = xs + 3
	EndIf
	
	If (KeyHit(scaleDown))
		point1\x = point1\x * sxyDown
		point1\y = point1\y * sxyDown
		point2\x = point2\x * sxyDown
		point2\y = point2\y * sxyDown
		point3\x = point3\x * sxyDown
		point3\y = point3\y * sxyDown
		point4\x = point4\x * sxyDown
		point4\y = point4\y * sxyDown
		point5\x = point5\x * sxyDown
		point5\y = point5\y * sxyDown
		point6\x = point6\x * sxyDown
		point6\y = point6\y * sxyDown
		EndIf
	
	If (KeyHit(scaleUp))
		point1\x = point1\x * sxyUp
		point1\y = point1\y * sxyUp
		point2\x = point2\x * sxyUp
		point2\y = point2\y * sxyUp
		point3\x = point3\x * sxyUp
		point3\y = point3\y * sxyUp
		point4\x = point4\x * sxyUp
		point4\y = point4\y * sxyUp
		point5\x = point5\x * sxyUp
		point5\y = point5\y * sxyUp
		point6\x = point6\x * sxyUp
		point6\y = point6\y * sxyUp
	EndIf
	
	
	
	
	Line (point1\x + xs, point1\y + ys, point2\x + xs, point2\y + ys)
	Line (point1\x + xs, point1\y + ys, point3\x + xs, point3\y + ys)
	Line (point3\x + xs, point3\y + ys, point5\x + xs, point5\y + ys)
	Line (point2\x + xs, point2\y + ys, point4\x + xs, point4\y + ys)
	Line (point5\x + xs, point5\y + ys, point6\x + xs, point6\y + ys)
	Line (point4\x + xs, point4\y + ys, point6\x + xs, point6\y + ys)
	
	Flip()
Until(KeyHit(escKey))
End()
;END MAIN

