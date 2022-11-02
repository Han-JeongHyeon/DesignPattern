package com.example.designpattern.StrategyPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class GameLogout: Action {

    override fun action() {
        Log.d(Tag.TAG,"게임 로그아웃")
    }

}