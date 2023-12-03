package com.example.lab2_2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class AboutActivity : AppCompatActivity() {
    private val LOG_TAG = "MainActivity_About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.i(LOG_TAG, "onCreate")

    }

    override fun onStart(){
        super.onStart()
        Log.i(LOG_TAG, "onRestart")

    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LOG_TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG, "onDestroy")
    }

    fun buttonClickTest(view: View)
    {
        val toast = Toast.makeText(
            applicationContext,
            "Clicked: buttonClickTest", Toast.LENGTH_SHORT
        )
        toast.show()

        finish()
    }
}