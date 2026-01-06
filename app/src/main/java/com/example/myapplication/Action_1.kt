package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id.*

class Action_1 : AppCompatActivity() {
    lateinit var b: Button
    lateinit var e: EditText
    lateinit var e2: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action1)
        b=findViewById( button3)
        e=findViewById(editTextText3)
        e2=findViewById(editTextText4)
        b.setOnClickListener {
            var Tgpa1=e.text.toString().toFloat()
            var TGPA2=e2.text.toString().toFloat()


            var tgpa1=Tgpa1.toFloat()
            var tgpa2=TGPA2.toFloat()
            var cgpa=(tgpa1+tgpa2)/2
            Toast.makeText(this, "Your CGPA is "+cgpa, Toast.LENGTH_LONG).show()
        }

//        e.setOnClickListener {
//            var s=e.text.toString()
//            Toast.makeText(this, "Hello "+s, Toast.LENGTH_LONG).show()
//        }
//        e2.setOnClickListener {
//
//            var s2=e2.text.toString()
//            Toast.makeText(this,"Hello "+s2, Toast.LENGTH_LONG).show()
//        }

    }
}