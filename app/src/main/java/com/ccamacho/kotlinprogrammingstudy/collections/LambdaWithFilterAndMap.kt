package com.ccamacho.kotlinprogrammingstudy.collections

/*
Main class

        val numberList = listOf<Int>( 6, 9, 0, 23, 78, 60 )

//        for (item in numberList) {
//            println(item)
//        }
//
//        6
//        9
//        0
//        23
//        78
//        60

//        val smallNumberList = numberList.filter { item -> item < 10 }
        val smallNumberList = numberList.filter { it < 10 }

//        for (item in smallNumberList) {
//            println(item)
//        }
//
//        6
//        9
//        0

//        val squaredNumberList = numberList.map { item -> item * item }
        val squaredNumberList = numberList.map { it * it }

//        for (item in squaredNumberList) {
//            println(item)
//        }

//        36
//        81
//        0
//        529
//        6084
//        3600

        val smallSquaredNumberList = numberList.filter { it < 10 }.map { it * it }

//        for (item in smallSquaredNumberList) {
//            println(item)
//        }

//        36
//        81
//        0

        val people = listOf<Person>(Person(10, "Maria"), Person(23, "Lee"), Person(45, "Louis"))
//        val names = people.map { item -> item.name }
        val names = people.filter { it.name.startsWith("L") } .map { it.name }

        for (item in names) {
            println(item)
        }

//        Lee
//        Louis

        class Person (var age: Int, var name: String) {}
 */