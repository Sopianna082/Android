package com.belajar.aplikasisederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var  rvBeach: RecyclerView
    private var list: ArrayList<Beach> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBeach = findViewById(R.id.rv_beach)
        rvBeach.setHasFixedSize(true)

        list.addAll(BeachData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBeach.layoutManager = LinearLayoutManager(this)
        val listBeachAdapter = ListBeachAdapter(list)
        rvBeach.adapter = listBeachAdapter
    }

}