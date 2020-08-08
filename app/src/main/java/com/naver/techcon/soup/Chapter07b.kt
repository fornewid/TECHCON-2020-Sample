package com.naver.techcon.soup

import android.animation.ValueAnimator
import android.animation.ValueAnimator.REVERSE
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class Chapter07b : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_07b)

        val battery: ImageView = findViewById(R.id.battery)
        val currentLevel: TextView = findViewById(R.id.current_level)
        val seekBar: SeekBar = findViewById(R.id.seek_bar)
        val chargingSwitch: SwitchCompat = findViewById(R.id.charging_switch)
        chargingSwitch.setOnCheckedChangeListener { _, isChecked ->
            battery.isActivated = isChecked
        }

        fun onBatteryLevelChanged(level: Int) {
            battery.setImageLevel(level * 100)
            currentLevel.text = level.toString()
        }
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                onBatteryLevelChanged(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        onBatteryLevelChanged(seekBar.progress)

        findViewById<View>(R.id.animate_button).setOnClickListener {
            ValueAnimator.ofInt(0, 100).apply {
                repeatCount = 1
                repeatMode = REVERSE
                duration = 1000
                addUpdateListener {
                    val level = it.animatedValue as Int
                    onBatteryLevelChanged(level)
                }
            }.start()
        }
    }
}
