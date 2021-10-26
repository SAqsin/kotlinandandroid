package com.aqsin.interncourse.kotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

/**
   Channelden ferqli olaraq paralel olmayan sadece threadi bloklamayan guclu bir tooldur
 */
var fl1 = flow {
    (1..10).forEach {
        emit(it)
    }
}

fun main() {
    flow3()
}

fun flow1(){
    myScope.launch {
        fl1.collect{
            println("Data $it")
        }
    }

    Thread.sleep(7000)

}

fun flow2(){
    myScope.launch {
        fl1
            .map { it * 2 }
            .collect{
            println("Data $it")
        }
    }

    Thread.sleep(7000)
}
fun flow3(){
    myScope.launch {
        fl1
            .map { it * 2 }
            .onEach {
                delay(400)
            }
            .collect{
                println("Data $it")
            }
    }

    Thread.sleep(7000)
}