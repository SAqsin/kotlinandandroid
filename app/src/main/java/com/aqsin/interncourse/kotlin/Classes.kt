package com.aqsin.interncourse.kotlin


class  Y : A()
fun main(args: Array<String>) {

    var nd =  NonData()
    var d = Data("D",2002)
    InterfaceAlan {

    }

    KInterfaceAlan(object : KotlinInterface {
        override fun info() {

        }

    })
//    println(nd)
//    println(d)

    //Copy method
    var n = d.copy(year = 500)
    println(n)



    /*
    Data class equals, hashcode copy method based on primary constructor paramentrs
    */
    //zati()

    Insan.comMet()
    Insan.A
    val r = INN("a",12,"Baki")
    var (b,_,c) = r


}
open class Humann(name : String)

class Insan(ad : String = "dsds") : Humann(ad){

    init {
        println("INIt")
    }

    companion object AA{
        init {
            println("COmpanion  ini")
        }

        fun comMet(){
            println("In Com meto")
        }
    }

    object A{
        init {
            println("A Ini")
        }
    }
}

data class INN(val ad : String,val yas : Int, val seher : String){

}

fun zati(){
    axex()
}

inline fun axex(){
    println("salam")
}

open class Base1{}
open class Base2{}

class NonData{
    lateinit var name:String
    var age = 8
    val year = 1992
    fun getNN() = 8



}
data class Data(var name:String, val year:Int){
    var age:Int = 8
}