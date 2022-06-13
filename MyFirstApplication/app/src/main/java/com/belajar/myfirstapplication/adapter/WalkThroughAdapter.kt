package com.belajar.myfirstapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import com.belajar.myfirstapplication.R

class WalkThroughAdapter(val context: Context): PagerAdapter() {

    val imgArray: IntArray = intArrayOf(R.drawable.youtube, R.drawable.youtube, R.drawable.youtube)
    val titleArray: Array<String> = arrayOf("Camera", "Drink", "Popcorn")

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals("object")
    }

    override fun getCount(): Int {
        return  imgArray.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any { //set adapter
         val view: View = LayoutInflater.from(context).inflate(R.layout.slide_walkthrough, container, false)
        val txtTitle : TextView = view.findViewById(R.id.tv_title)
        val img : ImageView = view.findViewById(R.id.tv_img)

        txtTitle.text = titleArray[position]
        img.setImageDrawable(ContextCompat.getDrawable(context,imgArray[position]))
        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view : View = "object" as View
        container.removeView(view)
    }
}