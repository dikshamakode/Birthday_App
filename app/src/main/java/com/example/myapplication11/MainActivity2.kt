package com.example.myapplication11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var input = findViewById<EditText>(R.id.edtinput)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            var intent = Intent(this , MainActivity3::class.java)
            intent.putExtra("Key" , input.text.toString())
            startActivity(intent)
        }
    }
}