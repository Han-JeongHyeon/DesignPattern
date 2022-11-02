package com.example.designpattern.AbstractFactoryPattern

interface GameFactory {

    fun getEquipment(): Equipment
    fun getGamingTool(): GamingTool

}