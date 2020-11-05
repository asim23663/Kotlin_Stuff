package com.example.kotlin_stuff.basics

fun main() {

    //List in Kotlin
    /*in java
    * List<Type> nums = Array.asList(1,2,3,4,5)
    * */

    var numsList = listOf(1, 2, 3, 4)


    println("Number at position: ${numsList[0]}")
    for (a in numsList) {
        println(a)
    }

    println("-----------")

    // Print each number with index
    for ((index, element) in numsList.withIndex()) {
        println("$index : $element")
    }

    // Map key value paire
    /*
    * in java
    * Map<String, String> map = new HashMap<>()
    * map.put("name", "Asim")
    * map.put("Age", "12")*/

//    var map
}