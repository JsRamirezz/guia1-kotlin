package com.example.helloworld

fun main(){
    var res1 = sumar(8, 8)
    var res2 = sumar(null, null)
    var res3 = sumar(0, 0)
    var res4 = sumar(2, 2)
    var res5 = sumar(null, 7)
    var res6 = sumar(65, null)
    var res7 = sumar(-5, -14)
    var res8 = sumar(7, 23)
    var res9 = sumar(100, 100)
    var res10 = sumar(-3, null)
    println("Test1 passed ${res1==16}")
    println("Test2 passed ${res2==-2}")
    println("Test3 passed ${res3==0}")
    println("Test4 passed ${res4==4}")
    println("Test5 passed ${res5==7}")
    println("Test6 passed ${res6==65}")
    println("Test7 passed ${res7==-19}")
    println("Test8 passed ${res8==30}")
    println("Test9 passed ${res9==200}")
    println("Test10 passed ${res10==-3}")


}

fun sumar(num1: Int?, num2: Int?):Int{
    var res= -1
    if(num1!= null && num2!= null){
        if (num1>= 0 && num2>= 0){
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

