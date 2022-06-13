package com.example.pyramidvolume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.MainActivity2
import com.example.Sensei

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var EditPanjang:EditText
    private lateinit var EditLebar:EditText
    private lateinit var EditTinggi:EditText
    private lateinit var ButtonCalculate:Button
    private lateinit var TextResulty:TextView
    private lateinit var ButtonPindah: Button
    private lateinit var ButtonParceable: Button
    private lateinit var ButtonTelephone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditPanjang = findViewById(R.id.edit_panjang)
        EditLebar = findViewById(R.id.edit_lebar)
        EditTinggi = findViewById(R.id.edit_tinggi)
        ButtonCalculate = findViewById(R.id.button_calculate)
        TextResulty = findViewById(R.id.Text_result)
        ButtonPindah = findViewById(R.id.button_pindah_activity)
        ButtonParceable = findViewById(R.id.button_parceable)
        ButtonTelephone = findViewById(R.id.button_telephone)

        ButtonCalculate.setOnClickListener(this)
        ButtonPindah.setOnClickListener(this)
        ButtonParceable.setOnClickListener(this)
        ButtonTelephone.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_calculate -> {
                val MasukkanPanjang = EditPanjang.text.toString().trim()
                val MasukkanLebar = EditLebar.text.toString().trim()
                val MasukkanTinggi = EditTinggi.text.toString().trim()

                var KolomKosong = false
                if (MasukkanPanjang.isEmpty()) {
                    KolomKosong = true
                    EditPanjang.error = "Kolom ini tidak boleh kosong"
                }

                if (MasukkanLebar.isEmpty()){
                    KolomKosong = true
                    EditLebar.error = "Kolom ini tidak boleh kosong"
                }
                if (MasukkanTinggi.isEmpty()){
                    KolomKosong = true
                    EditTinggi.error = "Kolom ini tidak boleh kosong"
                }
                if (!KolomKosong){
                    val VolumeLimas = (MasukkanPanjang.toDouble()*MasukkanLebar.toDouble()*MasukkanTinggi.toDouble())/3
                    TextResulty.text = VolumeLimas.toString()
                }
            }

            R.id.button_pindah_activity -> {
                val PindahActivity = Intent(this@MainActivity, MainActivity2::class.java)
                //Mengirimkan data ke activity kedua
                PindahActivity.putExtra(MainActivity2.TerimaHasil, TextResulty.text)
                startActivity(PindahActivity)
            }

            R.id.button_parceable -> {
                //Mengirimkan data ke mainactivity2
                //kita harus buat terima datanya
                val sensei = Sensei(
                    "Gojo Satoru",
                    "gojo@juju.com",
                    13
                )

                val PindahParcelable = Intent(this@MainActivity, MainActivity2::class.java)
                PindahParcelable.putExtra(MainActivity2.TerimaParcelable,sensei)
                startActivity(PindahParcelable)
            }
            R.id.button_telephone -> {
                val NumberTelephone = "98032489023"
                //intent implisit
                //akan menjalankan request aksi yng bisa mengaksi telephone
                val Telephone = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $NumberTelephone"))
                startActivity(Telephone)
            }
        }

    }
}