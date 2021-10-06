package com.aqsin.interncourse.kotlin

fun main(){
    data class city(var name:String)
    data class cus(var name:String,var city:city)
    var a = 5
    a.topla(5)
//    a topla(5)
//    a topla 7
    5 + 6
    a.plus(4)
    var list = listOf(
        cus("a",city("baki")),
        cus("a",city("ankara")),
        cus("b",city("istanbul")),
        cus("c",city("peru")),
        cus("c",city("paris"))
    )
    list.filter { it.city.name  == "baku" }
    /*
var p = Person("DDSdsds",22)
    p.age.plus(1)
    p.age++
    --p.age
    */


    var avengers = Movie("avengers",115)
    println(avengers.isLongMovie)
    avengers.len = 0
    println(avengers.isLongMovie)
    println(avengers.len)

    var iron = Movie1("iron",15)
    iron.len = -4
    println(iron.len)
    println("---------------")
    var cs = Car()
    //c.crash = true
    cs.usable = false
    cs.goodState = false
    println(cs.crash)
    print(cs.usable)


    var h = Human("a")
    var v = Vehicle("s",false,8)


    var t = Tree()
    t.grow(1)
    println(t.height)
    t.height = 5
    println(t.height)
    println("---------------")
    t.sup()
    println(t.height)
    t.own()
    println(t.height)
    println("Comps")
    var hp = Hp(name = "Hp",ram = 8, vga = 128)
    println(hp.getPrice())
    //var comp = Computer() cannot create instacne abstract
    var plant = Plant()
    println( plant.height)
    var dsf = 8

    /*
    Data class split variable
    */
    var audi = Auto("R8", "black",2012)
    var bwm = Auto("M3", "red",2012)
    var toyoya = Auto("Toyota", "white",2012)
    var (aa,_,cc) = audi
    println("----desc---")
//    println(model)
//    println(color)
//    println(year)
    var (m, c,y) = audi
    println("----name---")
    println(m)
    println(c)
    println(y)
    println("----some---")

    // istemediyimiz deyisikliyi buraxmaq ucun
    var (mod,_,yea) = audi
    println("----name---")
    println(mod)
    println(yea)

    //data class primary constructordaki parametrleri componenetN adi ile geri gondrurur
    var rr = audi.component1()
    var rt = audi.component2()
    //Destructive declarations in loop
    println("----for---")
    var carss  = arrayOf(audi,bwm,toyoya)
    var crs  = arrayListOf(audi,bwm,toyoya)
    for ((mod,color,year) in crs){
        println("$mod : $year - $color")
    }
    println("----forrr---")
    for((md,_,yr) in carss){
        println("$mod : $yr")
    }
    /*
   Operator overload
    */
    val v1 =  Vektor(4,5)
    val v2 =  Vektor(1,9)
    var v3 = v1.plus(v2)
    println(v3)


    /*
    //cannot inherit form singleton( object static)
    //var obj = object : Singleton {}
    //singleton cannot iherion. function invoke() not found
    //var datas = Singleton()
    //Interface does not have construcor
    //var d = Dest()
    */

    var objectInstan = object : Dest {
        override fun info() {
            println("This is info method of interface")
        }
    }
    objectInstan.info()

    var clObject = object : Co() {
        override fun info() {
            println("This is info method of Co onject")
        }
    }
    clObject.info()
   //  var s = object : Singleton(){}


    //Cannot inheritance of an abstract class
    //var comp = Computer()
    /*
    var tr = Tree()
    tr.sup()
    */

}

fun Int.topla(a : Int) = this + a

/*
   Operator overload
    */
data class Vektor(var x:Int, var y:Int){
    operator fun plus(v: Vektor) = Vektor(this.x + v.x, this.y + v.y)
}


/*
Data class split variable
 */
data class Auto(var model:String, var color:String, var year:Int)


/*
Constructor
 */

class Vehicle(val brand:String){
    var isNew:Boolean? = null
    var doors:Int = 0
    constructor(brand: String,isNews:Boolean,doors:Int):this(brand,isNews){
        this.doors = doors
    }
    constructor(brand: String,isNews:Boolean):this(brand){
        this.isNew = isNews
    }
}

class Car{
    var usable = true
    var goodState = true

    var crash:Boolean
        get() = !usable && !goodState
        set(value) {
            usable = !value
            goodState = !value
        }
}


class Movie(var name:String,len:Int){
    var len:Int = 1
        set(value){
            field = if(value < 1) 1 else value
        }
    val isLongMovie:Boolean
        get() = len > 120

//    init {
//        this.len = len
//    }
}

class Movie1(var name:String, var len:Int){
    init {
        if (len < 1){
            len = 1
        }
    }
}


class Person constructor(var name:String,var age:Int){
//class Person{
    //var name:String //= name
    //var age:Int     //= age

    //    constructor(name:String,age:Int){
//        println("Cons")
//        this.name = name
//        this.age = age
//    }
    init {
        println("Init")
//        this.name = name
//        this.age = age
    }
}

class Human (n:String){
    inline val name:String
        get()  = "|"
}

open class Plant{
    var height = 0
    open fun grow(h:Int){}
}
class Tree : Plant(){
    fun sup(){
        super.height = 10
    }
    fun own(){
        this.height = 5
    }
    override fun grow(h: Int) {
        super.height += h
    }
}

class Hp(
    override val name: String,
    override val ram: Int,
    override val vga: Int
):Computer(){
    override inline fun getPrice() = ( ram + vga ) * 25
}

abstract class Computer{
    abstract val name:String
    abstract val ram:Int
    abstract val vga:Int
    abstract fun getPrice():Int
    fun info(){
        println("Abstrach info method")
    }


}
/*
   Object (Java Static)
*/

interface Dest{
    fun info()
}
open class Co{
    open fun info(){
        println("Co info method")
    }
}

object Singleton {
     var instance : Hp? = null
    fun newInstance() : Hp{
        if(instance == null){
            instance = Hp("dsds",8,2)
        }
        return instance!!
    }
}
