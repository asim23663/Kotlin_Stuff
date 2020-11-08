package com.example.kotlin_stuff.basics

import java.util.*

fun main() {

    // Arrays in Kotlin
    // Collection of similar type of data
    // String, int, custom

    // Fixed set of value

//    val name: Array<Type> = arrayOf(value)
    val array: Array<Any> =
        arrayOf(1, 2, 3, "text", 9.0, 'q')  //Any is keyword means array of type any type

    println(array[0])
    println(array[3])

    // Print all array
    println(array.contentToString())

    //for updating value in array
    array[0] = 8

    println(array[0])

    // Print value using built-in function
    println(array.first())
    println(array.last())

    // update value using built-function
    array.set(3, 9)

    // printing value at certain index
    println(array.indexOf("text"))

    // Array of specific type e-g string, int etc
    val intArray = intArrayOf(1, 2, 3, 4)
    println(intArray.sum())

    // Print max and minimum value from integer arrya
    println(intArray.max())
    println(intArray.min())
    print(intArray.count())
    print(intArray[3])

    // Sorted Array
    val unSortedArray = intArrayOf(1, 5, 7, 5, 33, 12, 44, 77, 98, 2, 4)
    println(unSortedArray.sortedArray())


    // For printing value form integer array which is divisible by 100
    // for certain numb from array
    val num = intArray.find {
        // Logic to find
        it % 100 == 0
    }

    println(num)


}