package com.belajar.latihan_toastdialog_11420082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_login = findViewById(R.id.btn_login) as Button
        var button_data_diri = findViewById(R.id.btn_data_diri) as Button

        button_login.setOnClickListener{
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        button_data_diri.setOnClickListener{
            var intent = Intent(this, DataDiriActivity::class.java)
            startActivity(intent)
        }
    }
}