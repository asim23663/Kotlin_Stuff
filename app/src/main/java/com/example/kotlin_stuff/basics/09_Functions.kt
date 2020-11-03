package com.example.kotlin_stuff.basics

fun main() {

    //How to create and use functions in koltin
    sayHello()
    sayHello("Asim")
    sum(12,2)
    repeat()
}

// Without parameter
fun sayHello() {
    println("Hey there how are you!")

}

//With parameter
fun sayHello(name: String) {
    println("Hey $name")
}

fun repeat() {
    //built-in functions
    repeat(23) {
        print("=")
    }
}

fun sum(num1: Int, num2: Int) {
    println("Sum of two numbers: ${num1 + num2}")
}