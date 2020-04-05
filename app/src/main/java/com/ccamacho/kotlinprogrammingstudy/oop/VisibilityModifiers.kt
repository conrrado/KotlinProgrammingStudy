package com.ccamacho.kotlinprogrammingstudy.oop

open class Person {

    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 10 // public by default
}

class Brazilian: Person() {

    // a is not visible
    // b, c, d are visible

    fun show() {
        println("$b, $c, $d")
    }
}

class TestClass {

    // a, b are not visible
    // c, d, are visible

    fun show() {
        val person = Person()
        println("${person.c}, ${person.d}")
    }
}
