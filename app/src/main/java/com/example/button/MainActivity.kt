package com.example.button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter: Int = 0

    private var button_hi: Button? = null
    private var tv1: TextView? = null
    private var button_counter: Button? = null
    private var tv2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_hi = findViewById(R.id.button_hi)
        tv1 = findViewById(R.id.tv1)
        button_counter = findViewById(R.id.button_counter)
        tv2 = findViewById(R.id.tv2)

        button_hi?.setOnClickListener {
            tv1?.setText("Hello Kitty")
            it.setBackgroundColor(Color.RED)

            button_counter?.setOnClickListener{
                tv2?.setText("Я насчитал ${counter++} ворон")
            }
        }
        }
    }
