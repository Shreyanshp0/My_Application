package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Practise : AppCompatActivity() {
    lateinit var b: Button
    lateinit var e1: EditText
    lateinit var e2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practise)
        b=findViewById(R.id.bt1)
        e1=findViewById(R.id.et1)
        e2=findViewById(R.id.et2)
        b.setOnClickListener {
            val a=e1.text.toString().toFloat()
            val b=e2.text.toString().toFloat()
            Toast.makeText(this, "The sum is "+(a+b), Toast.LENGTH_SHORT).show()
        }

    }
}