package com.example.designpattern.BridgePattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class GreenCircle : DrawAPI {

    override fun drawCircle(radius: Int, x: Int, y: Int) {
        Log.d(Tag.TAG, "색상 : Green, $radius, $x, $y")
    }

}