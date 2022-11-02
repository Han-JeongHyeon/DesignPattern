package com.example.designpattern.PrototypePattern

/*
* 프로토타입 패턴은 자신을 Clone하여 여러변 새로 만들 수 있게 만든다.
* */

class CloneArray: Clone {
    private var list = ArrayList<String>()

    fun data(){
        list.add("LOL")
        list.add("Overwatch")
        list.add("FIFA")
    }

    fun getDataList(): ArrayList<String>? {
        return list
    }

    override fun clone(): CloneArray {
        return CloneArray()
    }

}