package com.aqsin.interncourse.kotlin

fun main(args: Array<String>) {

//    var reng1 = Clr.GOY
//    var reng2 = Clr.valueOf("AG")
//    //enumlarin valueso
//    println("$reng1 -> $reng2 -> ${Clr.QARA.name}")
//    println(reng2 == Clr.AG)
//    var reng3 = enumValueOf<Clr>("SARI")
//    println(reng3)
//
//    //iterate elemek
//    for (c in Clr.values()){
//        println("${c.name} - ${c.ordinal}")
//    }
////    for(c in enumValues<Clr>()){
////        println("${c.name} - ${c.ordinal}")
////    }
//
//
//    var wC = Kolor.White
//    var wCode = wC.b
//    println(wCode)
//    println(wC.rgb())
//    println(wC.temp.name)
//    var ag = Reng.Red
//    ag.temp = Temp.WARM private sete gore olmur

   //var ag = Reng.Red
  //ag.temp = Temp.WARM private sete gore olmur
    var r = Kolor.Blue.r
    println(BIZ.AQSIN)
    println(BIZ.AQSIN.name)
    println(BIZ.AQSIN.ordinal)
    for(d  in BIZ.values()){
        println(d)
    }
}

/**
 * enum class Adi {
 *  DEYER1,DEYER2
 * }
 */

enum class BIZ {
    //0,  1     2
    ATES,AQSIN, KERIM

}

enum class Clr {
    AG,QARA,GOY,SARI,YASIL
}

enum class Temp {
    WARM,
    COOL,
    COLD
}
/**
 * Member with default value or initialize in init block
 */
enum class Reng(val r: Int,val b : Int, val g : Int){
    White(255,0,0),
    Blue(125,44,231),
    Red(65,83,3),
    //Tund(251,26,600), //if argument  is not range 0..255 Illegal argumetn Exception
    Yellow(2,135,123);
    var temp : Temp //= Temp.WARM
        private set


    init {
        require(r in 0..255)
        require(b in 0..255)
        require(g in 0..255)

        temp = when(r){
            in 0..100 -> Temp.COLD
            in 150..180 -> Temp.WARM
            else -> Temp.COLD
        }
    }



    fun rgb() = r shl 16 + b shl 8 + g
}

enum class Kolor(val r: Int,val b : Int, val g : Int){
    White(255,0,0){
        override var temp = Temp.WARM
    },
    Blue(125,44,2){
        override var temp = Temp.COOL
    },
    Red(65,83,3){
        override var temp = Temp.COLD
    },
    //Tund(251,26,600), //if argument  is not range 0..255 Illegal argumetn Exception
    Yellow(2,135,65){
        override var temp = Temp.COOL
    };

    abstract var temp : Temp


    init {
        require(r in 0..255)
        require(b in 0..255)
        require(g in 0..255)
    }

    fun rgb() = r shl 16 + b shl 8 + g


}