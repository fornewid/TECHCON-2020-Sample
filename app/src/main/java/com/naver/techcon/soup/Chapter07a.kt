package com.naver.techcon.soup

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone

class Chapter07a : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_07a)

        findViewById<View>(R.id.ripple).setOnClickListener { it.isGone = true }
    }
}
