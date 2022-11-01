package com.example.designpattern.AbstractFactoryPattern

class FullTimeRider: Rider, Helmet {

    override fun delivery() = "오토바이 배달"

    override fun wear() = "오토바이 헬멧"

}