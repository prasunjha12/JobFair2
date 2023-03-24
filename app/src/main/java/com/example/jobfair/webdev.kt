package com.example.jobfair

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class webdev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webdev)

        val cd1=findViewById<CardView>(R.id.cardView1)

        cd1.setOnClickListener {

            val i= Intent(this,listView::class.java)
            startActivity(i)
        }


    }
}