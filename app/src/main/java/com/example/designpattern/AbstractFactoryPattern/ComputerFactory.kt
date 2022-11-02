package com.example.designpattern.AbstractFactoryPattern

class ComputerFactory: GameFactory {

    override fun getEquipment() = Computer()

    override fun getGamingTool() = Computer()

}