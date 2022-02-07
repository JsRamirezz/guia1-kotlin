package com.example.helloworld

import java.util.*


fun main(args: Array<String>) {
    print("Ingrese el valor del arreglo: ")
    val n = readLine()!!.toInt()
    println()
    val identity = Array(n, { n })
    val sumIdentity = identity.sum()

    print(Arrays.toString(identity))
    print("La suma del array es: ${sumIdentity}")

}