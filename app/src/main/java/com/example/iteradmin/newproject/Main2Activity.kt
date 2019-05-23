package com.example.iteradmin.newproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text = findViewById<TextView>(R.id.textView)

        val b1 = findViewById<Button>(R.id.button2)

        val i = intent
        text.setText(i.getStringExtra("name"))
        b1.setOnClickListener(){
            finish()
        }
    }
}
