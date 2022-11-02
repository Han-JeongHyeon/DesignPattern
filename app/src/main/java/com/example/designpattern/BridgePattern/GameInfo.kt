package com.example.designpattern.BridgePattern

class GameInfo(val name: String, val level: Int, gameLevelAPI: GameLevelAPI) : Level(gameLevelAPI) {

    override fun findUser() {
        gameLevelAPI.getInfo(name, level)
    }

}