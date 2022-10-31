package com.example.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpattern.StrategyPattern.Action1
import com.example.designpattern.StrategyPattern.Action2
import com.example.designpattern.StrategyPattern.Sub

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub = Sub()

        sub.action()

        sub.setWeapon(Action1())
        sub.action()

        sub.setWeapon(Action2())
        sub.action()
    }
}