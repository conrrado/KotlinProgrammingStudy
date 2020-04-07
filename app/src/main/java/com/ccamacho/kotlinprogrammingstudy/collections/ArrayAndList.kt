package com.ccamacho.kotlinprogrammingstudy.collections

/*
Array: Mutable but has Fixed Size
Collections
    Immutable Collections: Read Only Operations
        Immutable List: listOf
        Immutable Map: mapOf
        Immutable Set: setOf

    Mutable Collections: Read and Write Both
        Mutable List: arrayList, arrayListOf, mutableListOf
        Mutable Map: hashMap, hashMapOf, mutableMapOf
        Mutable Set: mutableSetOf, hashSetOf
 */

/*
Main Class

val numberArray = Array<Int>(5) { 0 } // Mutable, Fixed Size.

val cityList = listOf<String>("Serra Negra", "Araras", "Rio Claro") // Immutable, Fixed Size, READ ONLY.

val animalList = mutableListOf<String>("Dog", "Cat") // Mutable, No Fixed Size, Can Add or Remove Elements
//val animalList = arrayListOf<String>("Dog", "Cat") // Mutable, No Fixed Size, Can Add or Remove Elements
//val animalList = ArrayList<String>() // Mutable, No Fixed Size, Can Add or Remove Elements
animalList.add("Horse")

for (item in animalList) {
    println(item)
}

println("\n--------------\n")

animalList.remove("Cat")
animalList[1] = "Duck"

for (item in animalList) {
    println(item)
}

Console:
Dog
Cat
Horse
--------------
Dog
Duck

 */