package com.example.designpattern

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.designpattern.AbstractFactoryPattern.FullTimeRiderFactory
import com.example.designpattern.AbstractFactoryPattern.PartTimeRiderFactory
import com.example.designpattern.AbstractFactoryPattern.Rider
import com.example.designpattern.AbstractFactoryPattern.RiderService
import com.example.designpattern.BridgePattern.Circle
import com.example.designpattern.BridgePattern.GreenCircle
import com.example.designpattern.BridgePattern.RedCircle
import com.example.designpattern.BuilderPattern.Builder
import com.example.designpattern.CompositePattern.File
import com.example.designpattern.CompositePattern.Folder
import com.example.designpattern.PrototypePattern.CloneArray
import com.example.designpattern.SingletonPattern.Tag

/*
* 자바 디자인 패턴보고 코틀린으로 변환
* 내가 이해한 걸로 예제 만들기(자료를 따라하지 말것)
* */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //전략 패턴 (Strategy Pattern)
//        val controller = Controller()
//
//        controller.move() //아무것도 안하기
//
//        controller.setMove(MoveGo())
//        controller.move() //앞으로 가기
//
//        controller.setMove(MoveBack())
//        controller.move() //뒤로 가기

        //어뎁터 패턴 (Adapter Pattern)
//        val adapterImpl = AdapterImpl()
//
//        Log.d(Tag.TAG, "${adapterImpl.twiceOf(10F)}") //20.0
//        Log.d(Tag.TAG, "${adapterImpl.halfOf(100F)}") //50.0

        //탬플릿 메소드 패턴 (Template Method Pattern)
//        val iceAmericano = IceAmericano()
//        val iceLatte = IceLatte()
//
//        iceAmericano.makeCoffee()
//
//        iceLatte.makeCoffee()

        //팩토리 메소드 패턴 (Factory Method Pattern)
//        val monsterFactory = MonsterFactory()
//
//        val monster = monsterFactory.makeMonster("Dragon")
//
//        Log.d(Tag.TAG, "아생 ${monster.name()}이 나타났다!!\t힘 : ${monster.str()}")

        //프로토타입 패턴 (Prototype Pattern)
//        val cloneArray = CloneArray()
//
//        val list1 = cloneArray.clone()
//        list1.loadData()
//
//        Log.d(Tag.TAG, "${list1.getDataList()}")

        //빌더 패턴 (Builder Pattern)
//        val user = Builder(
//            "HanJeongHyeon",
//            "true@gna.company.com",
//            19
//        )
//
//        Log.d(Tag.TAG, "${user.name}")

        //추상 팩토리 패턴 (Abstract Factory Pattern)
//        val riderServiceFull = RiderService(FullTimeRiderFactory())
//        val riderServicePart = RiderService(PartTimeRiderFactory())
//
//        Log.d(Tag.TAG, riderServiceFull.work())
//        Log.d(Tag.TAG, riderServicePart.work())

        //브릿지 패턴 (Bridge Pattern)
//        val redCircle = Circle(100, 100, 10, RedCircle())
//        val greenCircle = Circle(100, 100, 10, GreenCircle())
//
//        redCircle.draw()
//        greenCircle.draw()

        //컴포지트 패턴 (Composite Pattern)
        val folder1 = Folder("폴더 1")

        folder1.add("파일 1", File("파일 1",300))

        folder1.getSize()

    }
}