package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.ButtonColors
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PlacementEligibility : AppCompatActivity() {
    lateinit var bt: Button
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var tv1: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_placement_eligibility)
        bt = findViewById(R.id.bt4)
        et1 = findViewById(R.id.et6)
        et2=findViewById(R.id.et7)
        tv1 = findViewById(R.id.tv7)
        bt.setOnClickListener {
            val a = et1.text.toString().toFloat()
            val b = et2.text.toString().toFloat()
            if(a<7 && b<2026){
                tv1.text="Not Eligible"
            }
            else{
                tv1.text="Eligible"
            }

        }
    }
}