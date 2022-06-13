package com.tutorpam.memeify_11420082

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

/***
 * Nama : Sopianna Siagian
 * NIM  : 11420082
 * Kelas: 42 TRPL 2
 */

object Toaster {
    fun show(context: Context, @StringRes message: Int){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}