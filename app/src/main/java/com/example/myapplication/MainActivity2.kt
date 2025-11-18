package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Activity life cycle","On Create is Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity life cycle","On Start is Called")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity life cycle","On pause is Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity life cycle","On resume is Called")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity life cycle","On Stop is Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity life cycle","On Destroy is Called")
    }
}
