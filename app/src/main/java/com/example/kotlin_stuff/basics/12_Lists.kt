package com.example.kotlin_stuff.basics

fun main() {

    // List in Kotlin
    // List are dynamic Arrays
    // increase or decrease size
    // two type of list  mutable and immutable

    /*in java
    * List<Type> nums = Array.asList(1,2,3,4,5)
    * */

    // Immutable list
    val numsList = listOf(1, 2, 3, 4)
    // numsList.add() // not in
    println("Number at position: ${numsList[0]}")
    for (a in numsList) {
        println(a)
    }


    // Mutable list
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(1)
    mutableList.add(3)
    mutableList.add(5)

    // Removing value from list
    mutableList.remove(6)
    mutableList[0] = 7

    // Finding value in list
    mutableList.contains(5)

    mutableList.first()
    mutableList.last()

    // Find value which is divisible by 2 or some logic
    val number = mutableList.find {
        //Logic
        it % 2 == 0
    }

    // fOr filtering an dprintin all values in array which is divisible by 2
    val numberFilter = mutableList.filter {
        //Logic
        it % 2 == 0
    }

    // For printing square of all in integer list
    val squareMutableList = mutableList.map {
        it * it
    }

    println(squareMutableList)

    // Print even number from list
    val evenList = mutableList.filter {
        it % 2 == 0
    }
    println(evenList)

    // Print Odd list from list
    val oddList = mutableList.filter {
        it % 2 != 0
    }
    println(oddList)

    // fiter not is remove all number which is matching to certain logic in
    val filterNot = mutableList.filterNot {
        it % 2 != 0
    }
    println(filterNot)

    // Breaking list into certain range
    // Slice is a built-in function which breaks the list into certain range
    val breakMutableList = mutableList.slice(0..3)
    println(breakMutableList)

    // sub list is also used to breaks the list but it cannot add last value it breaks list to till certain value
    val subList = mutableList.subList(1, 3) // 3 is not showing in sub list
    println(subList)

    // take function is also used to break the mutable list to a certain index
    val takeList = mutableList.take(4)  // similarly takeLast
    println(takeList)

    // if we print index which is not in current list it through an Exception
    // in kotlin we simply use

    println(mutableList.elementAtOrNull(9))
    println(mutableList[2])

    // Sort list in ascending order
    println(mutableList.sort())


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