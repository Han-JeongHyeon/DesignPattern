package com.example.designpattern.BridgePattern

abstract class Shape(protected val drawAPI: DrawAPI) {

    abstract fun draw()

}