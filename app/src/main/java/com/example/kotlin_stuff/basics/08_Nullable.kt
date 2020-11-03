package com.example.kotlin_stuff.basics

fun main() {

    //Nullable in Kotlin
    var name = "Asim"

    //?
    var fName: String? = "Asim"

    println(fName)
    fName = null
    println(fName)

    //Second case length
    var fullName: String? = "Muhammad Asim"
    println(fullName?.length)

//    fullName = null

    if (fullName != null) {
        println("Not null")
    } else print("Null")
    println(fullName?.length)


    fullName = null

    // elvis operator  ?:
    val length = fullName?.length ?: "Null"  //just like if else statement
    println(length)


}