package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter06b : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_06b)

        findViewById<ImageView>(R.id.thumbnail5).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.thumbnail6).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.thumbnail7).clipToRoundRect(20f)
    }
}
