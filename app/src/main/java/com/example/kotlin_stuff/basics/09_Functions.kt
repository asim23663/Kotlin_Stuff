package com.example.kotlin_stuff.basics

fun main() {

    //How to create and use functions in koltin
    sayHello()
    sayHello("Asim")
    sum(12, 2)
    repeat()


    println("Enter Two number")
    var (a, b) = readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).
    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
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

//To find max Number
fun maxNum(a: Int, b: Int): Int {
    var max = if (a > b) {
        print("The value of a is $a")
        a
    } else {
        print("The Value of b is $b")
        b
    }

    return max;
}