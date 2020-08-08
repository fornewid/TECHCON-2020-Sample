package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter08 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_08)

        findViewById<ImageView>(R.id.thumbnail).clipToOval(true)
    }
}
