package com.example.designpattern.BridgePattern

abstract class Level(protected val gameLevelAPI: GameLevelAPI) {

    abstract fun findUser()

}