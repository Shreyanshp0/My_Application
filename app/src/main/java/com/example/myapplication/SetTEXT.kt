package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SetTEXT : AppCompatActivity() {
    lateinit var nametext: TextView
    lateinit var nameEdit: EditText
    lateinit var button: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_set_text)
        nameEdit=findViewById(R.id.et1)
        nametext=findViewById(R.id.tv1)
        button=findViewById(R.id.bt5)
        button.setOnClickListener {
            var name=nameEdit.text.toString()
            nametext.text=name
        }


    }
}