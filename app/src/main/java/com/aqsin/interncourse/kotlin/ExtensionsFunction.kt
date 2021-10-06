package com.aqsin.interncourse.kotlin

/**
 * Extensions
 * public teyin olunmuslar ucun extension yaratmaq mumkundur
 * Movcud tipe, classa yeni funksiyalar elave edir (deyisdirmir) movcud olani deyisdirmir
 * fun Tip.adi(p:Param) -> ReturnType{
boody
 * }
 * Burada Tip receiver type di. Body icinde this ele istifade etmek olar
 *
 *
 * (No method overrinding) Eger klasin funksiyasi(-1) (ve ya parent klasin -2) ile extension funksiyasi eyni
 * addadirsa her zamn klasin metodu istifae olunur(goturulur)
 */

/**
 * 1 - Extension name same member function
 */
class myClass{
    fun A(){
        println("Class A")
    }
}

fun testMyAccpunt(){

}

/**
 * 1
 */
fun myClass.A(){
    println("Extension A")
}

/**
 * 2 - Extension name same Parent member function
 */
open class AAA{
    fun inf(){
        println("AAA inf")
    }
}


class BBB : AAA()

fun BBB.inf(){
    println("BBB inf")
}
fun AAA.inf(){
    println("AAA extens")
}

/**
 * 2
 */

fun BBB.testUcun(){
    println("Hello BBB")
}


abstract class Parent
class Child : Parent()

fun Parent.inf(){println("Parent inf")}
fun Child.inf(){println("Child inf")}

/**
 * Eger klasin companion obyekti varsa, xompanion obyekte extension yaratmaq olur
 */
class Comp{
    companion object {
        fun ee(){
            println("elf")
        }
    }
}

fun Comp.Companion.ee(){
    println("Comd")
}

operator fun String.plusAssign(s:String){
    println("$this $s")
}

infix fun String.pilyus(s:String){
    println("$this $s")
}

fun Number.info(){
    println("Parent number val = $this")
}

/**
 * Extension property
 * 4 - tek funksiya kimi yox property kimi de extension yaratmaq olar mes
 * backing field olMAmaLIdir
 **/
/*
//(Android)
val Context.preerence : SharedPreferences
    get() = PreferenceManager.getDefaultSharedPreferences(this)
 */
val String.len : Int
    get() = this.length

fun String.enlen() = this.length

val String.uzun : Unit
    get() {
        println(this.length)
    }
/**
 * 4
 */

var ad : () -> Unit = { println("OK")}

/**
 * ----------
 */


/**
 * Generic extension
 */

fun <T> List<T>.getLastElement():T{
    return this[size-1]
}
val <T> List<T>.lastElemet : T
    get() = this[size -1]

fun main(args: Array<String>) {
    /*
    var ss = myClass()
    ss.A()
    BBB().inf()
    println("-----------")
    AAA().inf()
    BBB().testUcun()
    println("-----------")

    var ch = Child()
    ch.inf()
    (ch as Parent).inf()
    var p:Parent = ch
    p.inf()
    Comp.ee()
    "ilk" += "IKI"
    "ilk".pilyus("IKI")
    "ilk" pilyus("IKI")
    "ilk" pilyus "IKI"


    87.info()
    User("dsdsd","dfff").fullName

    // 4
    println("DSdfsfdfd".len)
    "sdsdsds".uzun

    /**
     * Generic extension
     */
    var ar = arrayListOf(1,2,3,4,54,56,6,7,87)
    println(ar.getLastElement())
    println(ar.lastElemet)

    */
    5.salamla()
    BB().tt()
    aaa()

}
open class AA(){
    var i = 7
}

class BB : AA(){

}


fun AA.tt(){
    print(this.i)
}

class User(val name: String, val surname: String) {
    inline val fullName: String
        get() = "$name $surname"
}


fun Int.salamla(){
    println("$this Salam")
}

fun aaa(){
    bbb()
}
  fun bbb(){
    println("BB nin icin")
      //Back().a
 }


class Back(val z : String){
    var list = arrayListOf<Int>()
    var t = ""
    val a
        get() = list.size
    fun  info(){
        z
    }
}
