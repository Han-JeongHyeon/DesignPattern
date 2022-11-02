package com.example.designpattern.AbstractFactoryPattern

class Computer: Equipment, GamingTool {

    override fun equipment() = "콘솔 게임"

    override fun tool() = "패드 사용"

}