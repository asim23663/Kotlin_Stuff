package com.example.kotlin_stuff.basics

import com.example.kotlin_stuff.model.User

fun main() {

    var user1 = User() //Object creation or instantiation in kotlin in java we use new key word

    user1.name = "Asim"
    println("User name is ${user1.name}")

    var user2 = User()

    user2.name = null

    println("Second user name is: ${user2.name}")
}