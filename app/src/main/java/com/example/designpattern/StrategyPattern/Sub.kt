package com.example.designpattern.StrategyPattern

class Sub {

    private var weapon: Weapon? = null

    fun setWeapon(weapon: Weapon){
        this.weapon = weapon
    }

    fun action(){
        if (weapon == null) println("아무것도 안함")
        else weapon!!.action()
    }

}