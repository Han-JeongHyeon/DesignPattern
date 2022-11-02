package com.example.designpattern.TemplateMethodPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class LoL: Game() {

    override fun putExtra() {
        Log.d(Tag.TAG,"롤을 시작한다.")
    }

}