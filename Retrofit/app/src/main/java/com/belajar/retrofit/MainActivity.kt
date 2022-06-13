package com.belajar.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    //list kosong
    private val list = ArrayList<PostResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi recylerviewnya
        rvPost.setHasFixedSize(true)
        rvPost.layoutManager = LinearLayoutManager(this)

        //panggil retrofit client
        RetrofitClient.instance.getPosts().enqueue(object : Callback<ArrayList<PostResponse>>{
            override fun onResponse(
                call: Call<ArrayList<PostResponse>>,
                response: Response<ArrayList<PostResponse>>
            ) {
                val responseCode = response.code().toString()
                tvResponseCode.text = responseCode
                response.body()?.let { list.addAll(it)}
                val adapter = PostAdapter(list)
                //set adapter dari recyler dgn adapter yg dibuat
                rvPost.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<PostResponse>>, t: Throwable) {

            }

        })
    }
}