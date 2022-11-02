package com.example.designpattern.AbstractFactoryPattern

class Console: Equipment, GamingTool{

    override fun equipment() = "컴퓨터 게임"

    override fun tool() = "키보드 사용"
}