package com.example.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val l = findViewById<TextView>(R.id.text)
        val loh = findViewById<Button>(R.id.but)
        val loh1 = findViewById<Button>(R.id.ear)
        val da = findViewById<Button>(R.id.egor)
        val pi = findViewById<Button>(R.id.button4)
        val van = findViewById<Button>(R.id.oleg)
        var polniy = 0


        loh.setOnClickListener {
            polniy++
            l.text = polniy.toString()
        }
        loh1.setOnClickListener {
            polniy -= 1
            l.text = polniy.toString()
        }
        da.setOnClickListener {
        if (polniy>= 100) {   polniy += 10
            l.text = polniy.toString()
        } else polniy += 0
           l.text = polniy.toString()}
        pi.setOnClickListener {
        if (polniy >= 10000) {   polniy += 100
            l.text = polniy.toString()
        } else polniy += 0
            l.text = polniy.toString()}
        van.setOnClickListener {
         if (polniy >= 100000) {   polniy += 1000
            l.text = polniy.toString()
        } else polniy += 0
        l.text = polniy.toString()}

    }
}