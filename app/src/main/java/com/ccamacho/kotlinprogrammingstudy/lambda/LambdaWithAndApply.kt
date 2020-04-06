package com.ccamacho.kotlinprogrammingstudy.lambda

class Car {

    var model: String = ""
    var year: Int = 0

    fun show() {
        println("The $model $year")
    }
}

/*
Main class

val palio = Car()
palio.model = "Palio 1.0"
palio.year = 2008
palio.show()

with(palio) {
    model = "Palio 1.0"
    year = 2008
}
palio.show()

palio.apply {
    model = "Palio 1.0"
    year = 2008
}.show()

Console:
The Palio 1.0 2008
The Palio 1.0 2008
The Palio 1.0 2008
 */