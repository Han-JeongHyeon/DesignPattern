package com.example.designpattern.StrategyPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class MoveBack: Move {

    override fun move() {
        Log.d(Tag.TAG,"뒤로 이동하기")
    }

}