package com.example.designpattern.BuilderPattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class Member {
    private var name: String = ""
    private var gender: String = ""
    private var age: Int = 0
    private var job: String = ""

    class Builder {
        var name = ""
        var gender = ""
        var age = 0
        var job = ""

        fun name(name: String): Builder{
            this.name = name
            return this
        }

        fun gender(gender: String): Builder{
            this.gender = gender
            return this
        }

        fun age(age: Int): Builder {
            this.age = age
            return this
        }

        fun job(job: String): Builder {
            this.job = job
            return this
        }

        fun build(): Member {
            return Member(this)
        }
    }

    constructor(builder: Builder) {
        name = builder.name
        gender = builder.gender
        age = builder.age
        job = builder.job
    }
}