package com.ccamacho.kotlinprogrammingstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}

open class Animal(var color: String) {

    fun eat() {

    }
}

class Dog(color: String, var breed: String): Animal(color) {

    fun bark() {

    }
}

class Cat(color: String, var age: Int): Animal(color) {

    fun meow() {

    }
}


