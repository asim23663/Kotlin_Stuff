package com.example.kotlin_stuff.basics

fun main() {

    // Conditional statement
    // If certain condition is true, do 'this' or do 'that'

    // in kotlin we have if-else or when

    // Traditional way or generic way of different programming language
    var age = 30;
    if (age % 2 == 0) {
        println("Age is event")
    } else if (age == 30) {
        println("Age is 30")
    } else if (age == 40) {
        println("Age is 40")
    }

    //In Kotlin when state is the replacement of if-else
    when (age) {
        1 -> print("Age is 1")
        2 -> print("Age is 2")
        else -> print("Age is undefined")
    }

    // use case
    /*
    * 10-20 -> Teenager
    * 20-50 -> Adult
    * 30+ -> Old*/





























    when (age) {
        in 10..20 -> print("Teenager")
        in 21..30 -> print("Adult")
        else -> print("Old")
    }


}