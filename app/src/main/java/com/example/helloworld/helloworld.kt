package com.example.helloworld

fun main(){
    var res2 = sumar(-50, 76)
    var res3 = sumar(-50, 76)
    println("Test2 passed ${res2==-1}")
    println("Test3 passed ${res3==-1}")

}

fun sumar(num1: Int?, num2: Int?): Int{
    var res= -1
    if(num1!= null && num2!= null){
        if (num1<= 0 && num2>= 0){
            res = num1 + num2
        }

    }else{
       if (num1==null && num2==null) {
           res=-2
       }else {
           res = if (num1 != null) num1 else num2!!
       }
    }
    return res

}

