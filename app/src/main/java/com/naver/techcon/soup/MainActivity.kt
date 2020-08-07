package com.naver.techcon.soup

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        when (view.id) {
            R.id.button_01 -> startActivity(Intent(this, Chapter01::class.java))
            R.id.button_02 -> startActivity(Intent(this, Chapter02::class.java))
            R.id.button_03 -> startActivity(Intent(this, Chapter03a::class.java))
            R.id.button_04 -> startActivity(Intent(this, Chapter03b::class.java))
            R.id.button_05 -> startActivity(Intent(this, Chapter05::class.java))
            R.id.button_06 -> startActivity(Intent(this, Chapter05::class.java))
            R.id.button_07 -> startActivity(Intent(this, Chapter05::class.java))
            R.id.button_08 -> startActivity(Intent(this, Chapter05::class.java))
        }
    }
}