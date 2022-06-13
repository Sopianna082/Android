package com.belajar.androidmoreonuis_sopianna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_toast = findViewById(R.id.btn_toast) as Button
        var button_dialog = findViewById(R.id.btn_dialog) as Button
        button_toast.setOnClickListener {
            var intent = Intent(this, ToastActivity::class.java)
            startActivity(intent)
        }
        button_dialog.setOnClickListener {
            var intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
    }
}