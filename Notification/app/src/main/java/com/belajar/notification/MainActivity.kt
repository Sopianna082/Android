package com.belajar.notification

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {

    //variabel penampung
    val Channel_Notification_ID = "Channel_Notification_ID"
    val Channel_Notification_Name = "Channel_Notification_Name"
    val Notification_ID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CreateNotificationChannel()

        var btnNotification : Button = findViewById(R.id.btn_notification)

        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_CANCEL_CURRENT)
        }

        //NotificationCompat akan memabaca semua konsep dalama file ini
        //Channel_Notification_ID yg harus sama dengan
        val notification = NotificationCompat.Builder(this, Channel_Notification_ID)
            .setContentTitle("Ada notifikasi dari Boos")
            .setContentText("Disuruh ke kantor sekarang")
            .setSmallIcon(R.drawable.notification_foreground)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .build()

        val notificationManager = NotificationManagerCompat.from(this)
        
        btnNotification.setOnClickListener{
            notificationManager.notify(Notification_ID, notification)
        }
    }



    
    //untuk memanggil fungsi
    fun CreateNotificationChannel(){
        //version dari os ynag dipakai
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(Channel_Notification_ID, Channel_Notification_Name,
                            NotificationManager.IMPORTANCE_DEFAULT).apply {  }

            //kita harus mengget system utk mendapatkan datanya
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }
}

