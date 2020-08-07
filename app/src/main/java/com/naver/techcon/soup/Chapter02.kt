package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_02)

        findViewById<ImageView>(R.id.thumbnail1).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.thumbnail2).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.thumbnail3).clipToRoundRect(20f)
    }
}
