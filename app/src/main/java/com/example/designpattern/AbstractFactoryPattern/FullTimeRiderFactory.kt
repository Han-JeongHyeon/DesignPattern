package com.example.designpattern.AbstractFactoryPattern

class FullTimeRiderFactory: RiderFactory {

    override fun getRider() = FullTimeRider()

    override fun getHelmet() = FullTimeRider()

}