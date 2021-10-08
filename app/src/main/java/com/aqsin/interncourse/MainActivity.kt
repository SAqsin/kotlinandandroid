package com.aqsin.interncourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Fragmentim()
        Fragmentim.getFragment("23454")
        //var fr = Fragmentim()

    }
}

class Fragmentim private constructor(): Fragment(){
    var accountNUmver : String = ""
    companion object{
        private val instance : Fragmentim = Fragmentim()
            fun getFragment(accountNUmver : String = "") : Fragmentim{
            instance.arguments = Bundle().apply {
                putString("accNumber",accountNUmver)
            }
            return  instance
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            if (it.containsKey("accNumber")){
                accountNUmver = it.getString("accNumber")!!
            }
        }
    }
}