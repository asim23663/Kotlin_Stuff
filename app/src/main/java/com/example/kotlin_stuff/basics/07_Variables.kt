package com.example.kotlin_stuff.basics

fun main() {

    var name: String? = null
    var number: Int = 12

    name = "null"
    when(name){
        null -> print("hi")
        else -> println(name)
    }
    name = null
    println(name)




}