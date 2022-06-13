package com.belajar.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //pertama kali dibuka yang dijalankan apa
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //karna gk ada klik sama sekali, jadi dikasih waktu
        Handler().postDelayed({
            val intent = Intent(this, WalkThroughActivity::class.java)
            startActivity(intent)
        }, 1000)
    }
}