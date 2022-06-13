package com.tutorpam.a11420082_uts_d4trpl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity(){

    private lateinit var rcv_BangunRuang: RecyclerView
    private var list: ArrayList<BangunRuang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rcv_BangunRuang = findViewById(R.id.rcv_bangun_ruang)
        rcv_BangunRuang.setHasFixedSize(true)

        list.addAll(DataBangunRuang.listData)
        showRcyclerList()
    }

    private fun showRcyclerList(){
        rcv_BangunRuang.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewBangunRuangAdapter(list)
        rcv_BangunRuang.adapter = cardViewHeroAdapter
    }
}