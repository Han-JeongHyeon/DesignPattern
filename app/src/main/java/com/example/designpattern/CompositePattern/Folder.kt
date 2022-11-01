package com.example.designpattern.CompositePattern

import android.util.Log
import com.example.designpattern.SingletonPattern.Tag

class Folder(private val name: String) : FileSystem {
    private val includeds: MutableList<FileSystem> = mutableListOf()

    fun add(name: String, fileSystem: FileSystem){
        Log.d(Tag.TAG, "${name}이 생성되었습니다.")
        includeds.add(fileSystem)
    }

    override fun getSize(): Int {
        var total = 0
        for (included in includeds) {
            total += included.getSize()
        }
        Log.d(Tag.TAG, "총 $name 사이즈는 ${total}입니다")
        return total
    }

    override fun remove() {
        for (included in includeds) {
            included.remove()
        }
    }

}