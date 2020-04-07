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

// Immutable, Fixed Size, READ ONLY
//val personMap = mapOf<String, String>("firstName" to "Louis", "lastName" to "Mordor", "hotDrink" to "coffee")

val personMap = mutableMapOf<String, String>() // Mutable, No Fixed Size, Can Add or Remove Elements
//val personMap = hashMapOf<String, String>() // Mutable, No Fixed Size, Can Add or Remove Elements
//val personMap = HashMap<String, String>() // Mutable, No Fixed Size, Can Add or Remove Elements
//personMap.put("firstName", "Louis")
//personMap.put("lastName", "Mordor")
//personMap.put("hotDrink", "Coffee")
personMap["firstName"] = "Louis"
personMap["lastName"] = "Mordor"
personMap["hotDrink"] = "Coffee"

for (item in personMap) {
    println("${item.key}: ${item.value}")
}

Console:
firstName: Louis
lastName: Mordor
hotDrink: coffee

 */