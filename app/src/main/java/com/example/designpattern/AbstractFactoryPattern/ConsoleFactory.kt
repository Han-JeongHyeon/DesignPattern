package com.example.designpattern.AbstractFactoryPattern

class ConsoleFactory: GameFactory {

    override fun getEquipment() = Console()

    override fun getGamingTool() = Console()

}