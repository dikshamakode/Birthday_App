package com.example.myapplication11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        var name = intent.getStringExtra("Key")
        var inputText = findViewById<TextView>(R.id.nameString)
        inputText.setText("$name 🎈🎈")

    }
}