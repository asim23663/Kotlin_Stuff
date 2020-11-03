package com.example.kotlin_stuff.basics

fun main() {

    //Conditional Expression
    // < > <= >= || &&

    var age = 20;
    var type: String

    type = if (age <= 20) {
        "Kid"
    } else if (age > 20 && age < 50) {
        "Adult"
    } else "OLD"

    print(type);


    // Using when
    type = when (age) {
        1 -> "One"
        2 -> "Two"
        30 -> "Thirty"
        else -> "No valid Age is Found yet!"
    }
    print("using when: $type")
}