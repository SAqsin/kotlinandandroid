package com.aqsin.interncourse.kotlin

import kotlinx.coroutines.*
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Corotunie launch olan kimi Job Yaradilir ne hemise NEW state de olur
    ve default olaraq ACTIVE state e dusur
    Hemcinin NEW stateden ACTIVE e stateine start() ve ya join() istifade ederek kecire bilirik



 */

fun main() {

    //withIle()
    Thread.sleep(6000)

    //var i : Int = CoroutineScope(EmptyCoroutineContext).launch {  }


}

/**
 * Dependent job (joblarin asliligi)
 * bir jobun bitenden sonra digerini islemesini isteyirikse join() metodundan istidade olunur
 */


var sur = CoroutineScope(Job()).launch{
    println("Yol gedir")
    delay(2000)
}

var sss = CoroutineScope(Job()).launch {
    println("Muherrik ise salindi")
    delay(2000)
    //sur.join()
    println("Unvana catdi")
}



/**
 * burda with() ile her defe CoroutineScope(EmptyCoroutineContext) yazmaqdan azad oluruq
 * asagida 1 i launch edende ona context kimi parent jobu verdik cunku launch ozu job return edir
 */
fun withIle(){
    with(gs){

    var parent = launch {

        println("i Am Parent")
        delay(200)
    }
    //1
    launch(parent) {
        delay(200)
        println("i Am child")
        delay(200)
        }
    }
    Thread.sleep(6000)
}
