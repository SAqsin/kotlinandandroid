package com.aqsin.interncourse.kotlin

import java.util.function.Function
public var reqem : Int? = 54
fun infoOut(){
    fun infoIn(){
        println(reqem)
    }
    fun innerInfo() = infoIn()
}
lateinit var lateFun : () -> Int

class Desting{

    fun destA(){
        println("T a")
    }

    fun destB() = destA()
}
//Funcion argument function return type Int
fun argFunRetInt(func : (Int) -> Int) : Int {
    return func(8)
}

//Funcion argument function return type function
fun argFunRetFun(func : (Int) -> Int) : () -> Unit {
    return fun(){
        println("OK")
    }
}

//Funcion argument function return type function
fun returnTypeFunction(func : (Int) -> Int) : (Int) -> Int {
    return func
}

fun intAlan(s :Int) = s * 2

//variable as fun
var intAlanVar = fun (o : Int) = o *2


fun main(args: Array<String>) {

    infoOut()
    var t = Desting()
    t.destA()
    t.destB()
    var zxz = intAlan(8)
    println(argFunRetInt(intAlanVar))
    var ret = returnTypeFunction(intAlanVar)
    println(ret(36))

    //function list // function stored in list
    //argument int return int
    var functionList = arrayListOf<(Int) -> Int>()
    functionList.add(fun (e : Int) = e * e)
    functionList.add(fun (e : Int) = e * e * e)
    functionList.add(ucMisli)
    functionList.add { 8 * 5 }
    println("Fucntion start")
    for (f in functionList){
        println(f(f(f(f(2)))))
    }
    //invoke metodu olmaidi
    //Funksiyani isleetmek ucun invoka metodu islediler. funName.invoka(arg)
    intAlanVar.invoke(9)
    ucMisli(8)
    dortMisli(8)

    //null olan functionu type safe cagirmaq
    null1?.invoke()
    null1?.let { it() }
    //null1()// sehv verecek null olduguna gore

    var list = arrayListOf<(Int) -> Int>()
    list.add(fun (a :Int) = a *2 )
    list.add(fun (a :Int) = a *3 )
    list.forEach {
        println(it(5))
    }

    //null olan functionu type safe cagirmaq
    null1?.invoke()
    null1?.let { it() }
    //null1()// sehv verecek null olduguna gore

    bos?.let {
        println()
        istifade(it)
    }
}

fun istifade(ds  : String){

}

//int alib int returun eden funksiyani argumnt alib int return edir
var nul : (((Int) -> Int) -> Int)? = null

var bos : String? = null

//function nullable
var null1 : (() -> Int)? = null
var null2 : (() -> Int)? = fun() = 7

//params with function
var ucMisli = fun (r : Int) = r * 3

//params with variable
var dortMisli :(Int) -> Int = fun(u) = u * 4

/*
//interface for functions
() -> Unit
Function0<Unit>  zero parameter ret type unit

(Int) -> Unit
Function1<Int,Unit> one param ret type unit

() -> (Int,Int) -> String
Function0<Function2<Int, Int, String>>  zero param ret type 2 param ret rype string

*/

interface KotlinInterface{
    fun info()
}