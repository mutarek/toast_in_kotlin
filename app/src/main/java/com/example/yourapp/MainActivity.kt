package com.example.yourapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tv1: TextView
    lateinit var tv2: TextView
    lateinit var btnSave: Button
    lateinit var shwToast :Button
    var msg:String = "I Love Dhaka"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1 = findViewById(R.id.tvName)
        tv2 = findViewById(R.id.tvName2)
        btnSave = findViewById(R.id.btnSave)
        shwToast = findViewById(R.id.showToast)

        var m: Int = 0

        btnSave.setOnClickListener {
            tv1.text = "I Love Natore"
            tv2.text = "I Love Dhaka"
            m += 1
        }

        shwToast.setOnClickListener {
            Toast.makeText(this,"Your msg goes here",Toast.LENGTH_LONG).show()
        }


    }
}