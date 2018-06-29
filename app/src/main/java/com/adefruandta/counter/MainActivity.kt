package com.adefruandta.counter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val tvCounter: TextView by lazy {
        findViewById<TextView>(R.id.tv_counter)
    }

    private val btnCounter: Button by lazy {
        findViewById<Button>(R.id.btn_counter)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCounter.setOnClickListener { tvCounter.text = count().toString() }
    }

    private external fun count(): Int

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
