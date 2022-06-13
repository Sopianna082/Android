package com.belajar.tugas_storage_11420082

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.*

class MainActivity : AppCompatActivity() {

    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext,
            android.R.string.yes, Toast.LENGTH_SHORT).show()
    }

    private lateinit var editProdi : EditText
    private lateinit var editGoldar : EditText
    private lateinit var editNim : EditText
    private lateinit var editNama : EditText
    private lateinit var editTtl : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editProdi = findViewById(R.id.edit_prodi)
        editGoldar = findViewById(R.id.edit_goldar)
        editNim = findViewById(R.id.edit_nim)
        editNama = findViewById(R.id.edit_nama)
        editTtl = findViewById(R.id.edit_ttl)

        val editProdi1 = findViewById<EditText>(R.id.edit_prodi)
        val editGoldar1 = findViewById<EditText>(R.id.edit_goldar)
        val editNim1 = findViewById<EditText>(R.id.edit_nim)
        val editNama1 = findViewById<EditText>(R.id.edit_nama)
        val editTtl1 = findViewById<EditText>(R.id.edit_ttl)

        val fileName = findViewById<EditText>(R.id.editFile)
        val fileData = findViewById<EditText>(R.id.editData)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnView = findViewById<Button>(R.id.btnView)

        btnSave.setOnClickListener(View.OnClickListener {
            val prodi:String = editProdi1.text.toString()
            val goldar:String = editGoldar1.text.toString()
            val nim:String = editNim1.text.toString()
            val nama:String = editNama1.text.toString()
            val ttl:String = editTtl1.text.toString()
            val file:String = fileName.text.toString()
            val fileOutputStream: FileOutputStream
            try {
                fileOutputStream = openFileOutput(file,
                    Context.MODE_PRIVATE)
                fileOutputStream.write(nim.toByteArray())
                fileOutputStream.write(nama.toByteArray())
                fileOutputStream.write(prodi.toByteArray())
                fileOutputStream.write(ttl.toByteArray())
                fileOutputStream.write(goldar.toByteArray())
            } catch (e: FileNotFoundException){
                e.printStackTrace()
            }catch (e: NumberFormatException){
                e.printStackTrace()
            }catch (e: IOException){
                e.printStackTrace()
            }catch (e: Exception){
                e.printStackTrace()
            }
            Toast.makeText(applicationContext,"Data Saved",
                Toast.LENGTH_LONG).show()
            fileName.text.clear()
            editNim1.text.clear()
            editNama1.text.clear()
            editProdi1.text.clear()
            editTtl1.text.clear()
            editGoldar1.text.clear()
        })
        btnView.setOnClickListener(View.OnClickListener {
            val filename = fileName.text.toString()
            if(filename.toString()!=null &&
                filename.toString().trim()!=""){
                var fileInputStream: FileInputStream? = null
                fileInputStream = openFileInput(filename)
                var inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
                val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
                val stringBuilder: StringBuilder = StringBuilder()
                var text: String? = null
                while ({ text = bufferedReader.readLine(); text }()
                    != null) {
                    stringBuilder.append(text + "\n")
                }
                //Displaying data on EditText
                fileData.setText(stringBuilder.toString()).toString()
//                editNim1.setText(stringBuilder.toString()).toString()
//                editNama1.setText(stringBuilder.toString()).toString()
//                editProdi1.setText(stringBuilder.toString()).toString()
//                editTtl1.setText(stringBuilder.toString()).toString()
//                editGoldar1.setText(stringBuilder.toString()).toString()
            }else{
                Toast.makeText(applicationContext,"EditText tidak boleh kosong",Toast.LENGTH_LONG).show()
            }
        })
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
            Toast.makeText(applicationContext, "NIM : ${editText.text}", Toast.LENGTH_SHORT).show()
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
            Toast.makeText(applicationContext, "Nama : ${editText.text}", Toast.LENGTH_SHORT).show()
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
            Toast.makeText(applicationContext, "Tanggal Lahir : ${editText.text}", Toast.LENGTH_SHORT).show()
            editTtl.setText(editText.text)
        }
        builder.show()
    }
}