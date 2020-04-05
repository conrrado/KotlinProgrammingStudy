package com.ccamacho.kotlinprogrammingstudy.oop

data class User(var name: String, var id: Int) {

}

/*
Main Class

val user1 = User("Louis", 10)
val user2 = User("Louis", 10)

println("$user1 and $user2")

val result = if (user1 == user2) "equal" else "not equal"
println(result)

val newUser = user1.copy(name = "Maria")
println(newUser)

Console:
User(name=Louis, id=10) and User(name=Louis, id=10)
equal
User(name=Maria, id=10)
 */