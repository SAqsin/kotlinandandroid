package com.aqsin.interncourse.kotlin

/**
 * var/val deyiseninAdi : DeyiseninTip = deyer
 * fun funksiyaAdi(paramlari) : DondureceyiTipi {
 *  body
 * }
 *
 */

fun main() {
    println(lamdam())
    lamdam()
    lamdamFun()
    deyerDondurem()
    paramAlan(6)
    paramAlan.invoke(5)
    println(paramAlan(6))
    println(paramAlan2(7))
    println(paramAlan(19))
    println(deyerDondurenLamda())
    reqemleEmeliyyat(10, reqeminKvadrati)
    deyerDondurem3(4)
    var neticem = reqemleEmeliyyatRetunle(6, reqeminKvadratiReturn)
    println(neticem)
    reqemleEmeliyyat(5){
        var s = it + 1
        println("Salam $it")
    }
    reqemleEmeliyyat1(5,{
        var s = it + 1
        println("Salam $it")
    },"")

    reqemleEmeliyyat(5, ::toplaFun)
    var list  = arrayListOf(1,2,34,5,67,7)
    var net = yoxlaa(list)
    println(net)
}


fun yoxlaa(list : ArrayList<Int>) : Boolean {
    //ama forEachg inline funksiya olanda local return olur cunki kodu bura kopyalayir lambda olmur
    itereteEden(list){
        //not allowed here
        //return false
        when (it % 2){
            1 -> return false  //inline oland aisleyir
            0 -> return true  //inline oland aisleyir
            else -> return false
        }
    }
    return false
}

inline fun itereteEden(list: List<Int>, body : (Int)->Int) {
    for(i in list) body(i)
}



var add = "Aqsin"
fun getYas(): Int {
    return 28
}

fun adim(): Int {
    "Kerim"
    println("Dsdf")
    return 43
}

var lamdamFun = fun() {
    println("Lamda fun")
}

var lamdam2: () -> Unit = fun() {

}

var yeniyas: Int = 5

var lamdam: () -> Unit = {
    "4"
    println("Lamda fun 2")
}

var deyerDondurem = {
    println("dsds")
    5
}
var deyerDondurem2: () -> Int = {
    println("Sdsds")
    4
}

var deyerDondurem3: (Int) -> Int = {
    println("Sdsds")
    4
}

var paramAlan = { i: Int ->
    i + 10
    println(i + 8)
    //i + 10
}

var paramAlan2 : (Int) -> String = { gelenParam: Number ->
    "nomre $gelenParam"
}

var paramAlan3 : (Int) -> String = {
    "nomre $it"
}

var paramalan4 : (Int) -> String = fun(a) : String{
    return ""
}

var deyerDondurenLamda = donder@{
    println("Deyer")
    return@donder 4
}

var deyerDondurenLamda1 : (Int) -> String = bu@{
    return@bu "nomre $it"
}

fun reqemleEmeliyyat(reqem : Int, ikincideyer : (Int) -> Unit){
    ikincideyer.invoke(reqem)
}

fun reqemleEmeliyyat1(reqem : Int, ikincideyer : (Int) -> Unit, ad : String){
    ikincideyer.invoke(reqem)
}

fun reqemleEmeliyyatRetunle(reqem : Int, ikincideyer : (Int) -> Int) : String{
    var n = ikincideyer(reqem)
    return "Neticem : $n"
}

fun toplma(reqem1 : Int, reqem2 : Int){

}


var reqeminKvadrati : (Int) -> Unit = { gelenReqem : Int ->
    println(gelenReqem * gelenReqem)
}

var reqeminKvadratiReturn: (Int) -> Int = { gelenReqem : Int ->
    val netice = gelenReqem * gelenReqem
    println(netice)
    netice

}

fun toplaFun(a : Int) : Int {
    println(a + 7)
    return  5
}


fun doner(tekralanacaqDeyer: Int, vur: (Int) -> Int) : Int{
    return vur(tekralanacaqDeyer)
}




/**
 * function
 * classlar
 * interface
 * lamda
 * obyekt
 * inline
 * infix
 * sealed
 * extention
 * genericler
 * abstact
 * expressionlar
 * enum
 */


