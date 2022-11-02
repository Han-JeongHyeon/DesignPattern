package com.example.designpattern.BridgePattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class GameUser1 : GameLevelAPI {

    override fun getInfo(name: String, level: Int) {
        Log.d(Tag.TAG, "닉네임 : $name 현재 Lv : $level")
    }
}