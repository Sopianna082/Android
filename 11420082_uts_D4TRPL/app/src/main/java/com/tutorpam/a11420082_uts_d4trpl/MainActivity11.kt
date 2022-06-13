package com.tutorpam.a11420082_uts_d4trpl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity11 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val btnLuasBalok: Button = findViewById(R.id.luas_balok)
        btnLuasBalok.setOnClickListener(this)

        val btnVolumeBalok: Button = findViewById(R.id.btn_volume_balok)
        btnVolumeBalok.setOnClickListener(this)

        val btnLuasBola: Button = findViewById(R.id.luas_bola)
        btnLuasBola.setOnClickListener(this)

        val btnVolumeBola: Button = findViewById(R.id.volume_bola)
        btnVolumeBola.setOnClickListener(this)

        val btnLuasKerucut: Button = findViewById(R.id.luas_kerucut)
        btnLuasKerucut.setOnClickListener(this)

        val btnVolumeKerucut: Button = findViewById(R.id.volume_kerucut)
        btnVolumeKerucut.setOnClickListener(this)

        val btnLuasTabung: Button = findViewById(R.id.luas_tabung)
        btnLuasTabung.setOnClickListener(this)

        val btnVolumeTabung: Button = findViewById(R.id.volume_tabung)
        btnVolumeTabung.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.luas_balok -> {
                val pindah = Intent(this@MainActivity11, MainActivity3::class.java)
                startActivity(pindah)
            }

            R.id.btn_volume_balok -> {
                val pindah = Intent(this@MainActivity11, MainActivity4::class.java)
                startActivity(pindah)
            }

            R.id.luas_bola -> {
                val pindah = Intent(this@MainActivity11, MainActivity5::class.java)
                startActivity(pindah)
            }

            R.id.volume_bola -> {
                val pindah = Intent(this@MainActivity11, MainActivity6::class.java)
                startActivity(pindah)
            }

            R.id.luas_kerucut -> {
                val pindah = Intent(this@MainActivity11, MainActivity7::class.java)
                startActivity(pindah)
            }

            R.id.volume_kerucut -> {
                val pindah = Intent(this@MainActivity11, MainActivity8::class.java)
                startActivity(pindah)
            }

            R.id.luas_tabung -> {
                val pindah = Intent(this@MainActivity11, MainActivity9::class.java)
                startActivity(pindah)
            }

            R.id.volume_tabung -> {
                val pindah = Intent(this@MainActivity11, MainActivity10::class.java)
                startActivity(pindah)
            }
        }
    }
}