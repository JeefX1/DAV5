package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Identity
import android.widget.Button
import android.widget.EditText

class FourthActivity : AppCompatActivity() {


    private lateinit var editText: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)


        val bundle = intent.extras

        editText = findViewById(R.id.edittextView3)
        button = findViewById(R.id.button3)

        val name = bundle?.getString("NAME")
        val lastName = bundle?.getString("LASTNAME")

        button.setOnClickListener {

            val identityNumber = editText.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            intent.putExtra("IDENTITY_NUMBER", identityNumber)
            startActivity(intent)

        }




    }



}