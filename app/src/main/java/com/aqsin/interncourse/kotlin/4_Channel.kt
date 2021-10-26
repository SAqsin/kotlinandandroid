package com.aqsin.interncourse.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlin.coroutines.EmptyCoroutineContext

/**
 *
 *
 */
 val myScope = CoroutineScope(EmptyCoroutineContext)

fun main() {
    channel1()
}

fun channel1(){
    val meyveler = arrayOf("alma","armud","heyva","nar","uzum","saftali","erik")
    val ch1 = Channel<String>()
        myScope.launch {
            for (m in meyveler){
              if(!ch1.isClosedForSend)  ch1.send(m)
                if(m == "nar") ch1.close()
                delay(900)
            }
        }



    GlobalScope.launch {
        for (i in ch1){
            if(!ch1.isClosedForReceive){
                println("Chan : $i")
            }

        }

//        repeat(meyveler.size){
//            println("Chan : $it -> ${ch1.receive()}")
//        }
//
//
//        ch1.consumeEach {
//            println("Ch -> $it")
//        }

    }




    Thread.sleep(12000)


}