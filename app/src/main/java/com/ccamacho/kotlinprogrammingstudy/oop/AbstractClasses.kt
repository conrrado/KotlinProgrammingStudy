package com.ccamacho.kotlinprogrammingstudy.oop

abstract class Fish { // you cannot create instance of abstract class

    abstract var name: String

    abstract  fun eat() // abstract methods are "open" by default
    open fun getLength() { // A "open" function ready to be overriden

    }
    fun getWeight() { // A "normal" function: public and final by default

    }
}

class Tilapia() : Fish() {

    override var name: String = "tilapia_name"

    override fun eat() {

    }

}