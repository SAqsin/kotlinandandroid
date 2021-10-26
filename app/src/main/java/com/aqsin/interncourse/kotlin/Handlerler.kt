package com.aqsin.interncourse.kotlin

import android.os.*
import androidx.appcompat.app.AppCompatActivity
import com.aqsin.interncourse.R

/**
 * UI Threadin Loperi ve MessageQuequesi olur. Eger siz basqa threadi HaMeR e uygunlasdirmaq isteyirsizse
 * bu obyektleri ozunuz yaratmalisiz. Klassi Thread clasindan extend elemek lazimdi
 * ex : MenimLooperThread
 *
 * ama sizin ucun Looper ve MessageQueue yaradan ThreadHandler helper sinfini istifa elemek daha asantdi
 * ex : ThreadHelperExample
 */

class MenimLooperThread : Thread() {
    lateinit var handler : Handler
    override fun run() {
        /*
          bu thread looper kimi Initialize edir
          bu size: referenasi bu looper olan handler yaratma imkani verir
        */
        Looper.prepare()

        handler = object : Handler() {
            override fun handleMessage(msg: Message) {
                println("ok")
            }
        }

        // Bu thread ucun message queuni run edir.
        //Loopu sonlandirmaq ucun #quit() metodunu cagirin
        Looper.loop()
    }
}


// ThreadHelper numune
class MyActivity : AppCompatActivity(){

    var handlerThread : HandlerThread? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        setContentView(R.layout.activity_main)

        handlerThread = HandlerThread("MenimHandlerim")
        handlerThread?.let {
            // bu thread execution olmaga baslayir. JVM bu threadin run metodunu cagiri
            it.start()
            var looper : Looper = it.looper
            var handler = Handler(looper)

            //burada postun icine atdigim Runnanle kodu sonra ThreadHandler icinde calisacaqdir
            handler.post {
               //ui isleri
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        //is bitdiyinda resourlari serbest buraxmaq ucun quit metodunu cagirmaq lazimdi
        handlerThread?.quit()
    }
}
