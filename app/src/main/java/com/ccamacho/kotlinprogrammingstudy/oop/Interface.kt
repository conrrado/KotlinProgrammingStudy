package com.ccamacho.kotlinprogrammingstudy.oop

interface MyFirstInterface { // you cannot create instance of interface

    var name: String // Properties in interface are abstract by default

    fun onTouch()   // Methods in interface are abstract by default

    fun onClick() { // Normal methods are public and open by default NOT FINAL
        println("MyFirstInterface: onClick")
    }
}

interface MySecondInterface {

    fun onTouch() { // Normal method
        println("MySecondInterface: onTouch")
    }

    fun onClick() { // Normal method
        println("MySecondInterface: onClick")
    }
}

class CustomButton: MyFirstInterface, MySecondInterface {

    override var name: String = "dummy_name"

    override fun onTouch() {
        super.onTouch()
        println("Button was touched")
    }

    override fun onClick() { // Optional to override
        super<MyFirstInterface>.onClick()
        super<MySecondInterface>.onClick()
        println("Button was clicked")
    }

}

/*
Main Class

val btn = CustomButton()
btn.onTouch()
btn.onClick()

Console:
MySecondInterface: onTouch
Button was touched
MyFirstInterface: onClick
MySecondInterface: onClick
Button was clicked
*/