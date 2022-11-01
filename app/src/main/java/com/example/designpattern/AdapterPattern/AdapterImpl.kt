package com.example.designpattern.AdapterPattern

/*
* 어뎁터 패턴은 내가 필요한 수식 & 알고리즘을 만들어 여러번 사용할 수 있게 만드는 것이다
* 다른 속성을 가진 알고리즘을 만드는 것보다 기존에 만든것을 사용하여 변경하는 것이 더 편리하다
* */

class AdapterImpl: Adapter {

    override fun twiceOf(num: Float): Float {
        return Math().twoTime(num)
    }

    override fun halfOf(num: Float): Float {
        return Math().half(num)
    }

}