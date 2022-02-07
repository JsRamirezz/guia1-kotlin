package com.example.helloworld

fun main(){
    var caso1: Array<Int> = arrayOf(1, 3, 5, 10, 7, 90, 44)
    var item = 7

    println(findIndex(caso1,item))

}

fun findIndex(caso1: Array<Int>, item: Int): Int {
    return caso1.indexOf(item)
}