package com.ccamacho.kotlinprogrammingstudy

/*
    Singleton: When we have just ONE INSTANCE of a class in the whole application
    - Meaning: If class Student is declared Singleton then we cannot create objects for this class.
        - There exists only one object for this class by default
        - And we cannot create objects like student 1, student 2 etc
 */

object Customer: CustomClass() {

    var id: Int = -1 // Behaving as Static Variable

    init {
        println("id: $id")
    }

    fun registerCustomer() { // Behaving as Static Method

    }

    override fun show() { // Currently, behaving like STATIC method
        super.show()
        println("Customer: show and id: $id")
    }
}

open class CustomClass() {

    open fun show() {
        println("CustomClass: show")
    }
}

class Country {

    companion object {

        var name = "country"

        fun getArea(): Int {
            return -1
        }

    }
}

/*
Main Class
Customer.id = 27 // Calling without creating instance
Customer.registerCustomer()
Customer.show()

Console:
id: -1
CustomClass: show
Customer: show and id: 27
 */