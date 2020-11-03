package com.example.kotlin_stuff.basics

fun main() {

    // keyword name : type = xyz
    var name = "Asim"
    val number: Int = 2;

    // Represents a number in kotlin
    var byte: Byte = 0  // 8-bit
    var short: Short = 0    // 16-bit
    var int: Int = 0    // 32-bit
    var long: Long = 0L     // 64-bit

    var float: Float = 0f   // 32-bit
    var double: Double = 0.0    // 64-bit

    // Represents Strings in Kotlin
    var string: String = "Hello Kotlin"
    var char: Char = 'A'

    //Boolean
    var boolean: Boolean = false
    var booleanTrue: Boolean = true


    //Types conversion
    print("Enter a number: ")
    val num = readLine()!!.toInt() //Converting String into Integer
    print("Enter second number: ")
    val num2 = readLine()!!.toInt()

    print("$num + $num2 = ${num + num2}") //${Expression}

}