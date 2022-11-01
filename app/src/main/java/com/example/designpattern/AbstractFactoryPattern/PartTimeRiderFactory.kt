package com.example.designpattern.AbstractFactoryPattern

class PartTimeRiderFactory: RiderFactory {

    override fun getRider() = PartTimeRider()

    override fun getHelmet() = PartTimeRider()

}