package com.tutorpam.a11420082_uts_d4trpl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity9 : AppCompatActivity() , View.OnClickListener{

//    private lateinit var EditPanjang: EditText
//    private lateinit var EditLebar: EditText
//    private lateinit var EditTinggi: EditText
//    private lateinit var ButtonCalculate: Button
//    private lateinit var TextResulty: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

//        EditPanjang = findViewById(R.id.edit_panjang)
//        EditLebar = findViewById(R.id.edit_lebar)
//        EditTinggi = findViewById(R.id.edit_tinggi)
//        ButtonCalculate = findViewById(R.id.button_calculate)
//        TextResulty = findViewById(R.id.Text_result)

//        ButtonCalculate.setOnClickListener(this)

        val telefon: Button = findViewById(R.id.telefon)
        telefon.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
//            if (v.id == R.id.button_calculate) {
//                val MasukkanPanjang = EditPanjang.text.toString().trim()
//                val MasukkanLebar = EditLebar.text.toString().trim()
//                val MasukkanTinggi = EditTinggi.text.toString().trim()
//
//                var KolomKosong = false
//                if (MasukkanPanjang.isEmpty()) {
//                    KolomKosong = true
//                    EditPanjang.error = "Kolom ini tidak boleh kosong"
//                }
//
//                if (MasukkanLebar.isEmpty()){
//                    KolomKosong = true
//                    EditLebar.error = "Kolom ini tidak boleh kosong"
//                }
//                if (MasukkanTinggi.isEmpty()){
//                    KolomKosong = true
//                    EditTinggi.error = "Kolom ini tidak boleh kosong"
//                }
//                if (!KolomKosong){
//                    val LuasBalok = 2*(MasukkanPanjang.toDouble()*MasukkanLebar.toDouble())*2*(MasukkanPanjang.toDouble()*MasukkanLebar.toDouble())*2*(MasukkanPanjang.toDouble()*MasukkanLebar.toDouble())
//                    TextResulty.text = LuasBalok.toString()
//                }
//            }else

            if(v.id == R.id.telefon){
                val number = "089089"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}