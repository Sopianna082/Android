package com.belajar.aplikasisederhanasopiannasiagian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.belajar.aplikasisederhanasopiannasiagian.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding
    private lateinit var  userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //create data
        val imageId = intArrayOf(
            R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6,
            R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10
        )

        val name = arrayOf(
            "Sopianna",
            "Harry",
            "Ron",
            "Harmione",
            "Duek Son",
            "Secret Vase",
            "Huki",
            "Vase",
            "Post-It",
            "Oppa"
        )

        val lastmsgTime = arrayOf(
            "8.00am", "9.00am", "10.10am","11.45am", "13.00am", "15.30am",
            "18.00am", "20.00am", "21.00am", "00.00am"
        )

        var lastMessage = arrayOf(
            "Bagaimana dengan kuliahmu?", "Ayo pergi liburan", "Yuk ngedate", "Tugas", "Hmmm",
            "Kumau dia", "Gotcha", "Hello", "Let's go", "L.O.V.E"
        )

        val phoneNo = arrayOf(
            "23439024", "8327932", "437589", "8934897", "24983240",
            "09870324", "78873205", "7689032", "832950", "09809235"
        )

        val country = arrayOf(
            "United States", "Russia", "India", "Israel", "Germany", "Thailand", "France", "Japan", "Swiss", "Netherland"
        )

        userArrayList = ArrayList()
        for( i in name.indices){
            val user = User(name[i], lastMessage[i], lastmsgTime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener{parent, view, position, id ->
            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("phone", phone)
            i.putExtra("country", country)
            i.putExtra("imageId", imageId)
            startActivity(i)
        }

    }
}