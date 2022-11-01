package com.example.designpattern.AbstractFactoryPattern

interface RiderFactory {

    fun getRider(): Rider
    fun getHelmet(): Helmet

}