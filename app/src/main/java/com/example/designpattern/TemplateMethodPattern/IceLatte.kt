package com.example.designpattern.TemplateMethodPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class IceLatte: Coffee() {

    //Coffee Class 상속
    override fun putExtra() {
        Log.d(Tag.TAG,"우유를 넣는다.")
    }
}