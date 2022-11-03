package com.example.designpattern

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.designpattern.AbstractFactoryPattern.ComputerFactory
import com.example.designpattern.AbstractFactoryPattern.ConsoleFactory
import com.example.designpattern.AbstractFactoryPattern.GameService
import com.example.designpattern.AdapterPattern.AdapterImpl
import com.example.designpattern.BridgePattern.GameInfo
import com.example.designpattern.BridgePattern.GameUser1
import com.example.designpattern.BuilderPattern.Member
import com.example.designpattern.CompositePattern.File
import com.example.designpattern.CompositePattern.Folder
import com.example.designpattern.FactoryMethodPattern.GameFactory
import com.example.designpattern.PrototypePattern.CloneArray
import com.example.designpattern.SingletonPattern.Tag
import com.example.designpattern.StrategyPattern.Game
import com.example.designpattern.StrategyPattern.GameLogin
import com.example.designpattern.StrategyPattern.GameLogout
import com.example.designpattern.TemplateMethodPattern.LoL
import com.example.designpattern.TemplateMethodPattern.Overwatch

/*
* 자바 디자인 패턴보고 코틀린으로 변환
* 내가 이해한 걸로 예제 만들기(자료를 따라하지 말것)
* */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //전략 패턴 (Strategy Pattern)
//        val game = Game()
//
//        game.getAction() //아무것도 안하기
//
//        game.setMove(GameLogin())
//        game.getAction() //게임 로그인 하기
//
//        game.setMove(GameLogout())
//        game.getAction() //게임 로그아웃 하기
//
//        //어뎁터 패턴 (Adapter Pattern)
//        val adapterImpl = AdapterImpl()
//
//        Log.d(Tag.TAG, "${adapterImpl.twiceOf(10F)}") //20.0
//        Log.d(Tag.TAG, "${adapterImpl.halfOf(100F)}") //50.0
//
//        //탬플릿 메소드 패턴 (Template Method Pattern)
//        val lol = LoL()
//        val overwatch = Overwatch()
//
//        lol.startGame()
//
//        overwatch.startGame()
//
//        //팩토리 메소드 패턴 (Factory Method Pattern)
//        val gameFactory = GameFactory()
//
//        val gameChoice = gameFactory.getGame("FIFA")
//
//        Log.d(Tag.TAG, "내가 선택한 게임은 ${gameChoice.gameName()}")
//
//        //프로토타입 패턴 (Prototype Pattern)
//        val cloneArray = CloneArray()
//
//        val list1 = cloneArray.clone()
//        list1.data()
//
//        Log.d(Tag.TAG, "${list1.getDataList()}")
//
        //빌더 패턴 (Builder Pattern)
        Member.Builder()
            .name("True")
            .gender("남")
            .age(19)
            .build()

//        //추상 팩토리 패턴 (Abstract Factory Pattern)
//        val gameService1 = GameService(ComputerFactory())
//        val gameService2 = GameService(ConsoleFactory())
//
//        Log.d(Tag.TAG, gameService1.start())
//        Log.d(Tag.TAG, gameService2.start())
//
//        //브릿지 패턴 (Bridge Pattern)
//        val gameUser1 = GameInfo("True",100, GameUser1())
//
//        gameUser1.findUser()
//
//        //컴포지트 패턴 (Composite Pattern)
//        val folder1 = Folder("폴더 1")
//
//        folder1.add("파일 1", File("파일 1",300))
//
//        folder1.getSize()

    }
}