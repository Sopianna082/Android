package com.belajar.latihan_toastdialog_11420082

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var textUsername : TextView
    private lateinit var textPassword : TextView
    private lateinit var buttonLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textUsername = findViewById(R.id.edit_username)
        textPassword = findViewById(R.id.edit_password)
        buttonLogin = findViewById(R.id.login)

        buttonLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.login -> {
                    val Username = textUsername.text.toString().trim()
                    val Password = textUsername.text.toString().trim()

                    if (Username.equals("Sopianna") && Password.equals("Sopianna")){
                        Toast.makeText(applicationContext, "LOGIN BERHASIL", Toast.LENGTH_SHORT).show()
                        var intent = Intent(this, AfterLogin::class.java)
                        startActivity(intent)
                    }else{
                        val builder = AlertDialog.Builder(this)
                        with(builder){
                            setTitle("Warning")
                            setMessage("Username atau Password Anda Salah!")
                            setNegativeButton("Retry", null)
                            show()
                        }
                    }
                }
            }
        }
    }
}