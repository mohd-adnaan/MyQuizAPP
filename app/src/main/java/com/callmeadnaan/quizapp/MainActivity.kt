package com.callmeadnaan.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart:Button=findViewById(R.id.btnStart)
        val etName:EditText=findViewById(R.id.etName)
        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please Enter your Name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent= Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constant.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}