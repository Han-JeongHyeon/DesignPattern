package com.example.designpattern.StrategyPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

/*
* 전략 패턴은 Interface를 활용하여 동적으로 수정이 가능하다.
* 새로운 클래스를 만들고 Main에서 setMove를 활용하여 move 값을 동적으로 변경이 가능하다.
* */

class Controller {
    private var move: Move? = null

    fun setMove(move: Move){
        this.move = move
    }

    fun move(){
        if (move == null) {
            Log.d(Tag.TAG,"아무것도 안하기")
        }
        else{
            move!!.move()
        }
    }

}