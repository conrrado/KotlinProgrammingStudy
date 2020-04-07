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

// "Set" contains unique elements
// "HashSet" also contains unique elements but Sequence is not guaranteed in output

val passSet = setOf<Int>( 6, 7, 8, 0, 0, 0, 54, 45, 0 ) // Immutable. READ ONLY

for (item in passSet) {
    println(item)
}

Console:
6
7
8
0
54
45


//val passSet = mutableSetOf<Int>( 6, 7, 8, 0, 0, 0, 54, 45, 0 ) // Mutable. READ and WRITE both
val passSet = hashSetOf<Int>( 6, 7, 8, 0, 0, 0, 54, 45, 0 ) // Mutable. READ and WRITE both
passSet.add(7)
passSet.add(45)

for (item in passSet) {
    println(item)
}

Console:
0
6
54
7
8
45
 */
