package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // Map
        var maps=TreeMap<String,Int>()
        maps["Ram"]=34
        maps["sam"]=43

        for ((name,age) in maps)
        {
            printLog("Name    of $name and its age is $age")
        }


        //List
        var numbs= listOf(11,21,31,41)
        for (i in numbs)
        {
            printLog(i.toString())
        }
        // Trying to print with index
        for ((i,e) in numbs.withIndex())
        {
            printLog("Index of $i and its values is $e")
        }



        //For
        var nums =0 until 50
        for(i in nums.reversed() step 5)
        {
            printLog(i.toString())
        }
        printLog("Count is ${nums.count()}")
    }

    private fun printLog(text: String) {
        Log.i(TAG, "printLog: $text")
    }
}