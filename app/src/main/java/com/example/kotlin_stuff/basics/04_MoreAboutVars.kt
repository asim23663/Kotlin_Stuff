package com.example.kotlin_stuff.basics

fun main() {
    var number = 10

    val numToDouble = number.toDouble()

    print(numToDouble)

    // Kotlin functions

    val num1 = 10
    val num2 = 6
    val sum = num1 + num2 // Generic way or Traditional way

    //int Kotlin
    val sumInKotlin = num1.plus(num2)
    print(sumInKotlin)

    //Cancatination in kotlin
    var firstName = "Muhammad"
    var lastName = "Asim"

    val fullName = firstName + lastName; // Generic way or Traditional way in java or other language
    print(fullName);
    val fullNameInKotlin = "$firstName + $lastName"
    print(fullNameInKotlin)

    //Print lenght

    print(fullNameInKotlin.length)

    //Printing first character
    print(fullNameInKotlin[0])

    //In Lower case
    print(fullNameInKotlin.toLowerCase())

    //Printing large text
    var largeText = "Hello my name is Asim, \n Working as a Android Developer"
    print(largeText)

    // in Kotlinn way
    var bigText: String = """lkdjalsd
        |laksdjlkas
        |lksjdlkas
        |kadslaj
        |asdn
    """.trimMargin()

    print(bigText)
}