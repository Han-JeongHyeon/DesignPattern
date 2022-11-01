package com.example.designpattern.StrategyPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class MoveGo: Move {

    override fun move() {
        Log.d(Tag.TAG, "앞으로 이동하기")
    }

}