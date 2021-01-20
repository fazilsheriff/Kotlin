package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {




   private  val TAG = "Kotlins"
//    companion object {
//        private const val VENDOR_NAME = "Kifayat Pashteen"  // Assignment done at compile-time
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Student.ID=1
    Student.name="Perfect"
    Log.i(TAG, "${Student.ID}${Student.name}")
}
object Student
{
    var name:String="nsmm"
    var ID:Int = 0

    fun getIDNumber():Int
    {
        return ID
    }
    fun getNames():String{
        return name
    }
    }


}

