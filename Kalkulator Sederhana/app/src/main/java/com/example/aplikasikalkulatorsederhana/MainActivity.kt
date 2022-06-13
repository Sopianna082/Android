package com.example.aplikasikalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //Karena ada variabel, maka didahulukan dideklarasikan
    private lateinit var EditBilangan1: EditText
    private lateinit var EditBilangan2: EditText
    private lateinit var ViewHasil: TextView
    private lateinit var ButtonPindah:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditBilangan1 = findViewById(R.id.edit_bilangan_pertama)
        EditBilangan2 = findViewById(R.id.edit_bilangan_kedua)
        ViewHasil = findViewById(R.id.text_hasil_kalkulator)

        val ButtonTambah: Button = findViewById(R.id.btn_tambah)
        val ButtonKurang: Button = findViewById(R.id.btn_kurang)
        val ButtonKali: Button = findViewById(R.id.btn_kali)
        val ButtonBagi : Button = findViewById(R.id.btn_bagi)
        val ButtonAkar : Button = findViewById(R.id.btn_akar)

        ButtonTambah.setOnClickListener(this)
        ButtonKurang.setOnClickListener(this)
        ButtonKali.setOnClickListener(this)
        ButtonBagi.setOnClickListener(this)
        ButtonAkar.setOnClickListener(this)
        ButtonPindah.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id) {
                R.id.btn_tambah -> {
                    val HasilTambah = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().trim().toDouble()
                    ViewHasil.text = HasilTambah.toString()
                }

                R.id.btn_kurang -> {
                    val HasilKurang = EditBilangan1.text.toString().trim()
                        .toDouble() - EditBilangan2.text.toString().trim().toDouble()
                    ViewHasil.text = HasilKurang.toString()
                }

                R.id.btn_kali -> {
                    val HasilKali = EditBilangan1.text.toString().trim()
                        .toDouble() * EditBilangan2.text.toString().trim().toDouble()
                    ViewHasil.text = HasilKali.toString()
                }

                R.id.btn_bagi -> {
                    val HasilBagi = EditBilangan1.text.toString().trim()
                        .toDouble() / EditBilangan2.text.toString().trim().toDouble()
                    ViewHasil.text = HasilBagi.toString()
                }

                R.id.btn_akar -> {
                    val akarPertama = Math.sqrt(EditBilangan1.text.toString().trim().toDouble())
                    val akarKedua = Math.sqrt(EditBilangan2.text.toString().trim().toDouble())

                    val HasilAkar = akarPertama + akarKedua
                    ViewHasil.text = HasilAkar.toString()
                }
            }

        }
    }
}