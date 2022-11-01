package com.example.designpattern.TemplateMethodPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

/*
* 템플릿 메소드 패턴은 내가 중복으로 사용하는 것을 최소화하고 여러번 재사용할 수 있게 만들 수 있다.
* 내가 필요한 부분만 상속 받아 여러 이벤트에 대비 할 수 있고 코드를 여러번 사용하지 않아도 된다.
* */

abstract class Coffee {
    fun makeCoffee(){
        boilWater()
        putEspresso()
        putIce()
        putExtra()
    }

    //이 부분을 상속 받아 이벤트를 변경할 수 있다.
    abstract fun putExtra()

    //반복 코드
    private fun boilWater(){
        Log.d(Tag.TAG, "물을 끓인다.")
    }

    private fun putEspresso(){
        Log.d(Tag.TAG, "에스프레소를 넣는다.")
    }

    private fun putIce(){
        Log.d(Tag.TAG,"얼음을 넣는다.")
    }

}