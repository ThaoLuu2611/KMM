package com.thao.kmm.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thao.kmm.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

fun country(): String {
    return Greeting().countryName()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
        findViewById<TextView>(R.id.tvCountry).text = country()
    }
}
