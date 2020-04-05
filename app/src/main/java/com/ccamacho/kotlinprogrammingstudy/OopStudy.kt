package com.ccamacho.kotlinprogrammingstudy

open class Animal(var color: String) {

    open var eyeColor = "Brown"

    open fun eat() {
        println("eat")
    }

    fun show() {
        println("The eye's color is $eyeColor")
    }
}

class Dog(color: String, var breed: String) : Animal(color) {

    override var eyeColor = "Black"

    fun bark() {
        println("bark")
    }

    override fun eat() {
        println("The dog was eating")
    }
}

class Cat(color: String, var age: Int): Animal(color) {

    fun meow() {
        println("meow")
    }
}

/*
Main Class

val lessy = Dog("Black", "Pinscher")
lessy.bark()
lessy.eat()
lessy.show()

Console:
bark
The dog was eating
The eye's color is Black

 */