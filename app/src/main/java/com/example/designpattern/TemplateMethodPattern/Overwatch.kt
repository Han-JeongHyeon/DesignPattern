package com.example.designpattern.TemplateMethodPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class Overwatch: Game() {

    //Coffee Class 상속
    override fun putExtra() {
        Log.d(Tag.TAG,"오버워치를 시작한다.")
    }
}