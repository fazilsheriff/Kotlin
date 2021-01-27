package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

   private  val TAG = "Kotlins"

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

        var i:(Int)->Int={number-> number*number}
        Log.i(TAG, "Using lambda $i")

        var printName:(String)->Unit={

            Log.i(TAG, "onCreate:$it ")
        }

}



}

