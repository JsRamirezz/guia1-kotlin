package com.example.helloworld

import java.util.*

/*

este ejercicio no pude completarlo



*/
fun main(){

    var caso1: Array<Int?> = arrayOf(null)
    var caso2: Array<Int?> = arrayOf(1, 2, 3, 4)
    //var caso3: Array<Int?> = emptyArray()
    println(Arrays.toString(orderArray(caso1)))
    println(Arrays.toString(orderArray(caso2)))
    //println(Arrays.toString(orderArray(caso3)))

}

fun orderArray(colleccion: Array<Int?>): Array<Int?> {
    var arrayVar:Array<Int?> = emptyArray()
    if (colleccion!=null)
        arrayVar=colleccion
    return arrayVar
}




