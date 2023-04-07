package com.callmeadnaan.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView =findViewById(R.id.tv_name)
        val tvScore:TextView=findViewById(R.id.tv_score)
        val btnFinish:TextView=findViewById(R.id.btn_finish)

        tvName.text=intent.getStringExtra(Constant.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constant.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constant.CORRECT_ANSWERS,0)
        tvScore.text="Your score is $correctAnswers out of $totalQuestions."

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

        }





    }
}