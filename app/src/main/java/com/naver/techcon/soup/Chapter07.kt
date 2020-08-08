package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter07 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_07)

        findViewById<ImageView>(R.id.thumbnail).clipToOval(true)
    }
}
