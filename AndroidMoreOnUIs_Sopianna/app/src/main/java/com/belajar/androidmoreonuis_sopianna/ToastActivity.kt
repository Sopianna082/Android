package com.belajar.androidmoreonuis_sopianna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        var button_confirm = findViewById(R.id.button_confirm) as Button
        var button_cancel = findViewById(R.id.button_cancel) as Button
        button_confirm.setOnClickListener {
            // Pada saat tombol button ditekan, maka akan terbentuk Toast
            Toast.makeText(this, "Thank You For You Confirmation", Toast.LENGTH_SHORT).show()
        }

        button_cancel.setOnClickListener {
            // Pada saat tombol button ditekan, maka akan terbentuk Toast
            Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()

        }
    }
}