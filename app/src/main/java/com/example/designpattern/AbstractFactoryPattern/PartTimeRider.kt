package com.example.designpattern.AbstractFactoryPattern

class PartTimeRider: Rider, Helmet{

    override fun delivery() = "자전거 배달"

    override fun wear() = "자전거 헬멧"
}