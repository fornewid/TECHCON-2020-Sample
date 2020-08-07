package com.naver.techcon.soup

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Chapter05 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_05)

        findViewById<ImageView>(R.id.thumbnail).clipToOval(true)

        Log.d("SOUP", "test1=" + LayoutInflater.from(this).toString())
        Log.d("SOUP", "test2=" + LayoutInflater.from(this).factory.toString())
        Log.d("SOUP", "test3=" + LayoutInflater.from(this).factory2.toString())
    }
}
