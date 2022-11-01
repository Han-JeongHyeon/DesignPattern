package com.example.designpattern.BridgePattern

class Circle(val x: Int, val y: Int, val radius: Int, drawAPI: DrawAPI) : Shape(drawAPI) {

    override fun draw() {
        drawAPI.drawCircle(radius, x, y)
    }
}