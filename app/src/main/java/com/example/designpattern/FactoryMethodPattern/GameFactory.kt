package com.example.designpattern.FactoryMethodPattern

/*
* 팩토리 메소드 패턴은 템플릿 메소드 패턴가 다르게 내가 원하는 것을 가져오기 편하다.
* Main에서 Name을 정해주면 그 Name에 값을 가진 클래스를 가져와 준다
* */

class GameFactory {

    fun getGame(name: String): Game{
        return if (name == "FIFA") FIFA() else Overwatch()
    }

}