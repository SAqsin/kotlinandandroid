package com.aqsin.interncourse.kotlin

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.*
import kotlin.coroutines.EmptyCoroutineContext

/**

Coroutunes -
Asinxron ya da blok (blok ya da non blok) sekilde kodlarin icra olunmasi ucun istifade olunur
Thread dan ferqli olaraq Lightweight dir. Threadlari tekrar istifade ede bilir.
Meselen 10.000 thread yaradanda applcation  OutOfMemoryException vere biler

 * Scopelar (ne qeder yasayacagi, neleri ehate edeceyi ve s kimi demek olar)
- GlobalScope - GlobalScope top-level corotune yaradir
- CoroutineScope - Custom scope ile corotune yaradir CoroutineScope(Dispatchers.IO).launch

launch - 3 param alir
context, start, block

context
Bur cari coroutune ucun konseptual informasiya ola datasetdi
bu ya job ya da Dispatcherler ala biler. ozumuz custum context  duzelde bilrik


 */



var gs = CoroutineScope(EmptyCoroutineContext)
var gl = GlobalScope
//var ls = LifecycleCoroutineScope
//var ms = MainScope()
fun main() {
    createCoroutunes()
  //  var jv = gs.launch {  }
    //var mainCon = SupervisorJob() + Dispatchers.Main
}


private fun createCoroutunes(){
        Thread {
            (1..4).forEach {
                println("$it,${Thread.currentThread().name}")
            }
        }.run()
        (1..100).forEach {

            Thread {
                println("!$it - Th, ${Thread.currentThread().name}")
            }.start()

            //1
            GlobalScope.launch {
                delay(1000)
                println("#$it - Cor, ${Thread.currentThread().name}")
            }
        }
    Thread.sleep(5000)
}
