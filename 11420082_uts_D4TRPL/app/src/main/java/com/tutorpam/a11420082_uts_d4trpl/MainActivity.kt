package com.tutorpam.a11420082_uts_d4trpl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFunMath: Button = findViewById(R.id.btn_fun_math)
        btnFunMath.setOnClickListener(this)

        val telefon: Button = findViewById(R.id.telefon)
        telefon.setOnClickListener(this)

        val operasi: Button = findViewById(R.id.btn_operasi_bangun_ruang)
        operasi.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_fun_math -> {
                val pindah = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(pindah)
            }

            R.id.btn_operasi_bangun_ruang -> {
                val pindah2 = Intent(this@MainActivity, MainActivity11::class.java)
                startActivity(pindah2)
            }

            R.id.telefon -> {
                val number = "089089"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
                startActivity(dialPhoneIntent)
            }


        }
    }


}