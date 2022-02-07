package com.example.helloworld

import java.util.*
/*
valores de ejemplo:
caso1= 2
caso2= 4
caso3= 9
caso4= 25
caso5= 42
caso6= 12
caso7= 3
caso8= 8
caso9= 15
caso10= 100



*/

fun main(arg:Array<String>) {
    print("Ingrese el valor del arreglo: ")
    val n = readLine()!!.toInt()
    println()
    val identity = Array(n, { n })
    val sumIdentity = identity.sum()




    print(Arrays.toString(identity))

    print("La suma del array es: ${sumIdentity}")

}
