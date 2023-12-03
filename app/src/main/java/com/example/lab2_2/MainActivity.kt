package com.example.lab2_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val LOG_TAG = "MainActivity"
    var startTime: Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(LOG_TAG, "onCreate")

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getString(R.string.title)


        startTime = System.currentTimeMillis();

        Log.i(startTime.toString(), "onCreate: " + startTime.toString());
    }

    override fun onStart() {
        super.onStart()
        val end: Long = System.currentTimeMillis() - startTime
        Log.i(LOG_TAG, "onStart: $end")
    }

    override fun onResume() {
        super.onResume()
        val end: Long = System.currentTimeMillis() - startTime
        Log.i(LOG_TAG, "onResume: $end")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LOG_TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        val end: Long = System.currentTimeMillis() - startTime
        Log.i(LOG_TAG, "onStop: $end")
    }

    override fun onPause() {
        super.onPause()
        val end: Long = System.currentTimeMillis() - startTime
        Log.i(LOG_TAG, "onPause: $end")
    }

    override fun onDestroy() {
        super.onDestroy()
        val end: Long = System.currentTimeMillis() - startTime
        Log.i(LOG_TAG, "onDestroy: $end")
    }

    fun buttonClickTest(view: View)
    {
        val toast = Toast.makeText(
            applicationContext,
            "Clicked: buttonClickTest", Toast.LENGTH_SHORT
        )
        toast.show()
        Log.i(LOG_TAG, "Button Click")

        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}