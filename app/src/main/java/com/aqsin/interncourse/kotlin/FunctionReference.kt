package com.aqsin.interncourse.kotlin


class ForInfo{
    companion object {
        fun statucInfo(){
            println("ForInfo Info Static")
        }
    }
    fun info(){
        println("ForInfo Info")
    }
}
//
var iO = fun (i:Int) = i % 2 == 1
fun isOdd(i:Int) = i % 2 == 1
fun add() = false
//implements function type
var predicate : (Int)->Boolean = ::isOdd
var yoxlana : ()->Boolean = ::add

//2
var isStringEmpty : (String) -> Boolean = String::isNotEmpty
var referenceMethod = ForInfo::info

//3
var staticMethod  = ForInfo.Companion::statucInfo

class Wind{
    val speed = 120
}
class Ship{
    fun move(wind: Wind):Boolean = wind.speed > 100
}

val shipTest : (Ship,Wind) -> Boolean =  Ship::move
// ve ya uzun
val shipTest1 : (Ship,Wind) -> Boolean =  { s, w ->
    s.move(w)
}

var ss = ::String


fun nds() = fun() = println("dsdsd")

fun main(args: Array<String>) {
    print(nds()())
    var list = Array(10){it * 1}
    var abc = arrayOf("a","","b","c","")


    //2
    referenceMethod(ForInfo())
    referenceMethod.invoke(ForInfo())
    staticMethod()
   var odList = list.filter { iO(it) }
   var odList1 = list.filter (iO)
   var odList2 = list.filter { isOdd(it) }
   var odList3 = list.filter (::isOdd)
    println(odList3)

    //1 reflection
    var params = ::isOdd.parameters
    var annnos = ::isOdd.annotations

    println(params.size)
    println(annnos.size)
    var nonEmp = abc.filter(isStringEmpty)
    var isEmpt = abc.filter(String::isEmpty)
    println(nonEmp)
    println(isEmpt)
    var s = Ship()
    var wind = Wind()
    println("can move: ${shipTest(s,wind)}")

    for (i in (1..10)){
       // println(vurma(i))
        println(::vurma)
        println("dsds".isEmpty())
    }
    5.let {  }
}

fun vurma(reqem : Int) =  reqem * 2
