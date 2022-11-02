package com.example.designpattern.AbstractFactoryPattern

/*
* 추상 팩토리 패턴은 클래스들을 팩토리를 통하여 일관성 있게 생성이 가능하도록 한다.
* */

class GameService(private val riderFactory: GameFactory) {

    fun start(): String {
        val rider = riderFactory.getEquipment()
        val helmet = riderFactory.getGamingTool()

        return rider.equipment() + " " + helmet.tool()
    }

}