package com.aqsin.interncourse.kotlin


import java.lang.ArithmeticException
import java.lang.Error
import java.lang.Exception
import kotlin.reflect.typeOf

fun main(args:Array<String>){
    var s = dubl("g")
    print(s)




    println(sum(1,2,3,4,5))
    println(sum())
    var y = intArrayOf(1,2,3,4,5)
    var ia = IntArray(3){it * 1+1}
    var arra = arrayOf("A","v","sd")
    //var tt  = *arra
    // * spread operator (arrrayi ayirir paramin icine)
    varArgAny("A","1",*arra,"c")


    /*
    /*
    Single expression function
    */
    kva(2)
    print(tekCut(8))
    */

    var r = rec("",7)
    print(r)


    formatter("salam ",false,false)
    formatter("OKK",isTrim = true)

    listOf(12,34)
    Math.PI
    println()
    try {
        bol(7,0)
    }catch (e:Exception){
        print(e.message)
    }
    //var lest = string(1,2,3,4)
    var t = Array(1){"12"}
    ttr(*t)
    var array = arrayOf("dsds","sdsds","sdsds")
    varArgAny("s","sd","sdsds", *array)
    println(t())
}

fun ttr(vararg ee : String){

}

var t = {

}

fun hecne() : Nothing {
    throw Exception("")
    //return "7"
    //return 0/5
}

fun a() = 9
fun t() = fun(){
    println("here")
}


fun ho(f : (Int) -> Unit){
    f(7)
    f.invoke(8)
}

/*
    recr
*/
fun rec(son:String,n:Int) : String{
    if (n == 0) return son.removeSuffix(",")
    return rec("$son $n,".trim(),n-1)
}

/*
Nothing (Fun)
 */

fun no():Nothing{
    throw Error("err")
}

@Throws(ArithmeticException::class)
fun bol(a:Int,b:Int):Int{
    if(b == 0) throw ArithmeticException("Sifira bolme")
    return a/b
}


/*
  Single Function
*/

// default value and naming in fuction
fun formatter(s:String, isUpper:Boolean = true,isTrim:Boolean = false):String{
    var sd = s
    if (isUpper) sd.toUpperCase()
    if (isTrim) sd.trim()
    return sd
}

fun kva(i:Int):Int = i * i

fun tekCut(x:Int):Boolean = when(x % 2){
    0 -> true
    else -> false
}

fun formatText(t:String)  = t.trim().capitalize().toUpperCase()

fun void (){
    return
}
fun void1 (){
    return Unit
}

fun dubl(a:String):String{
    return a.toUpperCase()
}

fun varArgAny(vararg s :String){
    var ss = s.joinToString(",")
    println(ss)
}

fun add(a: Any?, b:Int) : Int{
    //if (a > 0 && b > 0){
    //    return a + b
    //}
    return 0
}

fun sum(vararg s:Int):Int{
    println(s::class.simpleName)
    return s.sum()
}

fun fun1(){

}

fun fun2(a : String){

}

fun fun3(a : String) : String{
 return ""
}