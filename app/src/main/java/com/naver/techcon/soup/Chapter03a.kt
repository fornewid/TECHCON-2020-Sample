package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter03a : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_03a)

        findViewById<ImageView>(R.id.thumbnail4).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.view1).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.view2).clipToRoundRect(20f)
    }
}
