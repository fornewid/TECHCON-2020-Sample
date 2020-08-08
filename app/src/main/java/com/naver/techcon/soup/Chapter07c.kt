package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter07c : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_07c)

        val android: ImageView = findViewById(R.id.android)
        android.setOnClickListener {
            it.isSelected = false
            it.isSelected = true
        }
    }
}
