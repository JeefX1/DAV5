
package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    private lateinit var nameEditText: EditText
    private lateinit var nextButton: Button




    @SuppressLint("MissingInflatedId", "UnspecifiedRegisterReceiverFlag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.editTextText)
        nextButton = findViewById(R.id.button)

        nextButton.setOnClickListener {

            val name = nameEditText.text.toString()

            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)

        }
    }


}