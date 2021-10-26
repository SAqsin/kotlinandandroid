package com.aqsin.interncourse.kotlin

import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.system.measureTimeMillis


fun main() {
    /*
    val myScope = CustomScope()
    myScope.launch {

    }
    */
    //launch()
    await()
}
 val score = CoroutineScope(EmptyCoroutineContext)

/**
 * Biz Custom olaraq oz Corotines Scope larizi da yarada bilerik
 * bunun ucun klassi CoroutineScope interface ile implement elemek lazimi
 * bu zaman icindeki coroutineContext i istideyime uygun teyin edirik
 */
class CustomScope : CoroutineScope {
    private  var parentJob : Job = Job()

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Default + parentJob

    fun onStop(){
        parentJob.cancel()
    }
}

fun launch(){
    CoroutineScope(EmptyCoroutineContext).launch(Dispatchers.IO) {
        val userID = "i"
        val getUserData = "id"
        withContext(Dispatchers.Main){

        }
        val cc = measureTimeMillis {
            delay1()
            delay2()
            delay3()
        }
        println(cc)
    }

    Thread.sleep(12000)
}

fun await(){
   score.launch {
//       try {
//           await1().getCompletionExceptionOrNull()
//       }catch (e : Exception){}
      val cs = measureTimeMillis {
          val a1 = async { await1() }
          val a2 = async { await2() }
          val a3 = async { await3() }

          launch {
              delay1()
              a(1,2)
          }
          launch {  delay2() }
          launch {  delay3() }


          a1.await()
          a2.await()
          a3.await()

         // a(a1.await(),a2.await())
      }
       println(cs)
   }
    Thread.sleep(12000)
}

fun a(reqem : Int,reqem2: Int){

}


 suspend fun await1() {
    println("await1 Start")
    delay(2000)
    println("await1 end")
     4
}

 suspend fun await2()  {
    println("await2 Start")
    delay(4000)
    println("await2 end")
}
suspend fun await3(){
    println("await3 Start")
    delay(3000)
    println("await3 end")
}

suspend fun delay1(){
    println("Delay1 Start")
    delay(2000)
    println("Delay1 end")
}

suspend fun delay2(){
    println("Delay2 Start")
    delay(4000)
    println("Delay2 End")
}

suspend fun delay3(){
    println("Delay3 Start")
    delay(3000)
    println("Delay3 End")
}