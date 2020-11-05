package com.example.kotlin_stuff.basics

fun main() {

    //Loops do-while while and for

    // in java
    /*
    * int i = 0
    * while(i<10) ---- Chat no range
    * do---while(i<10)
    * for(int i = 0 ; i<10; i++) ---- Range e-g list
    * enhanced for loop
    * for(int a: nums){---}  foreach
    * */

    //Also used Chat 'A' to 'Z' etc
    var nums = 1..10  //Range same as <=
    for (a in nums) {  //Also user nums.reversed()
        println(a)
    }
    println("Count is ${nums.count()}")

    println("------")
    for (a in nums step 2) {
        println(a)
    }

    //print 16 to 1 using downto method

    println("------")
    var nums2 = 10 downTo 1
    for (a in nums2) {
        println(a)
    }

    //until method
    println("Until method")
    var nums3 = 1 until 10  // same as <
    for (a in nums3) {
        println(a)
    }
}