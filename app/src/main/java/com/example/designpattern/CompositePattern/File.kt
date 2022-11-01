package com.example.designpattern.CompositePattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag


class File(private val name: String, private val size: Int) : FileSystem {

    override fun getSize(): Int {
        Log.d(Tag.TAG, "$name 사이즈 $size")
        return size
    }

    override fun remove() {
        TODO("Not yet implemented")
    }
}