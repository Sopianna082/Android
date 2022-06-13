package com.belajar.latihan_toastdialog_11420082

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class DataDiriActivity : AppCompatActivity() {
    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
    }
    val negativeButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.no, Toast.LENGTH_SHORT).show()
    }
    val neutralButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            "Maybe", Toast.LENGTH_SHORT).show()
    }

    private lateinit var editProdi : EditText
    private lateinit var editGoldar : EditText
    private lateinit var editNim : EditText
    private lateinit var editNama : EditText
    private lateinit var editTtl : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_diri)

        editProdi = findViewById(R.id.edit_prodi)
        editGoldar = findViewById(R.id.edit_goldar)
        editNim = findViewById(R.id.edit_nim)
        editNama = findViewById(R.id.edit_nama)
        editTtl = findViewById(R.id.edit_ttl)
    }

    fun ListProdi(view : View){
        val items = arrayOf("D4-TRPL", "D3-TI", "D3-TK", "S1-IF")
        val builder = AlertDialog.Builder(this)
        with(builder){
            setTitle("Pilih prodi")
            setItems(items){ dialog, which ->
                Toast.makeText(applicationContext, items[which] + " telah dipilih", Toast.LENGTH_SHORT).show()
                with(editProdi) { setText(items[which]) }
            }
            setPositiveButton("Oke", positiveButtonClick)
            show()
        }
    }

    fun ListGoldar(view : View){
        val items = arrayOf("A", "B", "AB", "O")
        val builder = AlertDialog.Builder(this)
        with(builder){
            setTitle("Pilih Golongan Darah")
            setItems(items){ dialog, which ->
                Toast.makeText(applicationContext, items[which] + " telah dipilih", Toast.LENGTH_SHORT).show()
                with(editGoldar) { setText(items[which]) }
            }
            setPositiveButton("Oke", positiveButtonClick)
            show()
        }
    }

    fun Nim(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        builder.setTitle("Tuliskan NIM")
        val dialogLayout = inflater.inflate(R.layout.alertdialogedittext, null)
        val editText = dialogLayout.findViewById<EditText>(R.id.editText)
        builder.setView(dialogLayout)
        builder.setPositiveButton("OK") { dialogInterface, i ->
            Toast.makeText(applicationContext, "EditText is ${editText.text}", Toast.LENGTH_SHORT).show()
            editNim.setText(editText.text)
        }
        builder.show()
    }

    fun Nama(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        builder.setTitle("Tuliskan Nama")
        val dialogLayout = inflater.inflate(R.layout.alertdialogedittext, null)
        val editText = dialogLayout.findViewById<EditText>(R.id.editText)
        builder.setView(dialogLayout)
        builder.setPositiveButton("OK") { dialogInterface, i ->
            Toast.makeText(applicationContext, "EditText is ${editText.text}", Toast.LENGTH_SHORT).show()
            editNama.setText(editText.text)
        }
        builder.show()
    }

    fun TTL(view: View) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        builder.setTitle("Tuliskan Tanggal Lahir")
        val dialogLayout = inflater.inflate(R.layout.alertdialogedittext, null)
        val editText = dialogLayout.findViewById<EditText>(R.id.editText)
        builder.setView(dialogLayout)
        builder.setPositiveButton("OK") { dialogInterface, i ->
            Toast.makeText(applicationContext, "EditText is ${editText.text}", Toast.LENGTH_SHORT).show()
            editTtl.setText(editText.text)
        }
        builder.show()
    }
}