package com.bruce

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    var age : Int = 19
    age = 20
    var weight = 66.5f
    var name : String
    name = "Hank"
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}