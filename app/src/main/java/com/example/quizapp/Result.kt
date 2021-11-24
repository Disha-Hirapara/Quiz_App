package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score = intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size ")

        var finish = findViewById<Button>(R.id.btnfinish)

        congo.text="Congratulation ${userName}!!"
        var s ="${score} /${totalQuestion}"
        var tv = findViewById<TextView>(R.id.score)
        tv.setText(s)


        finish.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}