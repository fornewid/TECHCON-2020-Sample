package com.naver.techcon.soup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter03b : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_03b)

        findViewById<ImageView>(R.id.thumbnail5).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.thumbnail6).clipToRoundRect(20f)
        findViewById<ImageView>(R.id.thumbnail7).clipToRoundRect(20f)

        findViewById<ImageView>(R.id.thumbnail6).setOnClickListener {
            it.isActivated = it.isActivated.not()
        }
    }
}
