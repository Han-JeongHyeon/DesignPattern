package com.example.designpattern.TemplateMethodPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class IceAmericano: Coffee() {

    //Coffee Class 상속
    override fun putExtra() {
        Log.d(Tag.TAG,"시럽을 넣는다.")
    }

}