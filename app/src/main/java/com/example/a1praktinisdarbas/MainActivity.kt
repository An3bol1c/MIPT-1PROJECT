package com.example.a1praktinisdarbas

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.graphics.Color
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val buttonColor = findViewById<Button>(R.id.buttonTextColor)
        val rootLayout = findViewById<View>(R.id.main)
        val buttonBackgroundColor = findViewById<Button>(R.id.buttonBackgroundColor)

        button.setOnClickListener {
            textView1.text = "Greetings from KK"
        }

        buttonColor.setOnClickListener {
            textView1.setTextColor(Color.RED)
        }

        buttonBackgroundColor.setOnClickListener {
            rootLayout.setBackgroundColor(Color.YELLOW)
        } // revert after merge
    }

}