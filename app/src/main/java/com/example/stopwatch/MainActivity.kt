package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // 1度だけ代入するものはvalを使う
    val handler = Handler()
    // 繰り返し代入するためvarを使う
    var timeValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // View要素を変数に代入
        val timeText = findViewById(R.id.timeText) as TextView
        val startButton = findViewById(R.id.start) as Button
        val stopButton = findViewById(R.id.stop) as Button
        val resetButton = findViewById(R.id.reset) as Button

        // 1秒ごとに処理を実行
        val runnable = object : Runnable {
            override fun run() {
                timeValue++
                handler.postDelayed(this, 1000)
            }
        }
    }
}