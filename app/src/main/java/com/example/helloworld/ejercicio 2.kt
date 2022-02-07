package com.example.helloworld

fun main(){
    var caso1: Array<Int> = arrayOf(1, 2, 5, 9)
    var caso2: Array<Int> = arrayOf(1, 2, 5, 9)
    var caso3: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso4: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso5: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso6: Array<Int> = arrayOf(3, 12, 0, 9, 100, 200, 30, 40, 19, 38, 77, 999)
    var caso7: Array<Int> = arrayOf(-1, -2, -5, -9,-15, -50, -100, -50)
    var caso8: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso9: Array<Int> = arrayOf(45, 77, 98, 32, 0, 94, -35)
    var caso10: Array<Int> = arrayOf(-1, 0, -43, 90, 200)
    var res1 = searchData(caso1, 1) //0
    var res2 = searchData(caso2, 9) //3
    var res3 = searchData(caso3, 100) //6
    var res4= searchData(caso4, 50) // 7
    var res5 = searchData(caso5, 5) //2
    var res6 = searchData(caso6, 999) //11
    var res7 = searchData(caso7, -9) //3
    var res8 = searchData(caso8, 2) //1
    var res9 = searchData(caso9, 0) //4
    var res10 = searchData(caso10, -1) //0
    println("searchData(caso1, n=1) Test passed ${res1==0}")
    println("searchData(caso2, n=9) Test passed ${res2==3}")
    println("searchData(caso3, n=100) Test passed ${res3==6}")
    println("searchData(caso4, n=100) Test passed ${res4==7}")
    println("searchData(caso5, n=100) Test passed ${res5==2}")
    println("searchData(caso6, n=100) Test passed ${res6==11}")
    println("searchData(caso7, n=100) Test passed ${res7==3}")
    println("searchData(caso8, n=100) Test passed ${res8==1}")
    println("searchData(caso9, n=100) Test passed ${res9==4}")
    println("searchData(caso10, n=100) Test passed ${res10==0}")
}
fun searchData(colleccion:Array<Int>, number: Int):Int{
    colleccion.forEachIndexed({p, i -> if(i==number) return p})
    return -1
}