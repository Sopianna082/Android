package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pyramidvolume.R

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val TerimaHasil = "hasil"
        const val TerimaParcelable = "parcelable"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Mengirimkan data dari activity 1 ke dua
        val MenerimaHasil:TextView = findViewById(R.id.menerima_hasil)
        val MenerimaParcelable:TextView = findViewById(R.id.menerima_parcelable)

        //get
        val hasil_activity1 = intent.getStringExtra(TerimaHasil)
        val text = "Hasil = $hasil_activity1"

        val sensei = intent.getParcelableExtra<Sensei>(TerimaParcelable) as Sensei

        val text2 = "Name: ${sensei.NameSensei}, \n email: ${sensei.email}," +
                " \n Banyak Istri: ${sensei.Banyakistri}"

        MenerimaParcelable.text = text2
        MenerimaHasil.text = text
    }
}