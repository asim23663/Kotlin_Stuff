package com.example.kotlin_stuff.basics

fun main() {

    //How to create and use functions in koltin
    /* fun name() : ReturnType{
         //task

         return the value

     }*/

    sayHello()
    sayHello("Asim")
    sum(12, 2)
    repeat()


    println("Enter Two number")
    var (a, b) = readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).
    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
}


/*in java we have
* public void sayHi(){ //task }*/

// Without parameter
fun sayHello() {
    println("Hey there how are you!")

}

// With parameter
fun sayHello(name: String) {
    println("Hey $name")
}

// With return Type
fun sayHi(name: String): String {
    return name
}


// Default parameter
fun greeting(greet: String, name: String = "Asim"): String {
    return "$greet $name"
}


// named parameter
fun greet(greet: String = "hi", name: String = "Asim"): String {
    return "$greet $name"
}

/*
* println(greet(name = "Asim",greet = "Hi")
* */

// Repeat function
fun repeat() {
    //built-in functions
    repeat(23) {
        print("=")
    }
}

// Sum function
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

// Single Expression function
// directly return by an equal symbol
fun xyz(name: String, email: String) = "$name $email"

fun add(num1: Int, num2: Int) = num1.plus(num2)



















