package com.example.chapter1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = 0;

        plus_Button.setOnClickListener {
            result++;
            textView.text = result.toString()
        }

        minus_Button.setOnClickListener {
            result--;
            textView.text = "$result"
        }


    }
}
