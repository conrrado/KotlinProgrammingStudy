package com.ccamacho.kotlinprogrammingstudy.lambda

interface ProgramInterface {

    fun execute(sum: Int)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) { // High level function with lampda paramter
        val sum = action(a, b)
        println("Lambda: $sum")
    }

    fun addTwoNumbers(a: Int, b: Int, action: ProgramInterface) { // Using interface / Object Oriented way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) { // Simple way
        val sum = a + b
        println("Normal: $sum")
    }

    fun reverseAndDisplay(str: String, action: (String) -> String) {
        var result = action(str)
        println("reverseAndDisplay: $result")
    }

}

/*
Main Class

        val program = Program()
        program.addTwoNumbers(2, 7) // Simple way

        program.addTwoNumbers(2, 7, object : ProgramInterface { // using interface
            override fun execute(sum: Int) {
                println("Interface: $sum")
            }

        })

//        val programLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b } // Lambada expression
//        program.addTwoNumbers(2, 7, programLambda)
//        program.addTwoNumbers(2, 7, { a: Int, b: Int -> a + b })
        program.addTwoNumbers(2, 7) { a, b -> a + b}

//        program.reverseAndDisplay("hello", { s -> s.reversed() })
//        program.reverseAndDisplay("hello", { it.reversed() })
        program.reverseAndDisplay("hello") { it.reversed() }

Console:

Normal: 9
Interface: 9
Lambda: 9
reverseAndDisplay: olleh
 */