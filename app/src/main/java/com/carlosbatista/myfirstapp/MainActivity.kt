package com.carlosbatista.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import  android.widget.Button


const val EXTRA_MESSAGE = "com.carlosbatista.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.button)

        sendButton.setOnClickListener {
            sendMessage(it)
        }

    }

    fun sendMessage(view: View) {
        val editText  = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }

        startActivity(intent)
    }
}