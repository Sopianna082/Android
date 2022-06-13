package com.belajar.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.belajar.myfirstapplication.adapter.WalkThroughAdapter

class WalkThroughActivity : AppCompatActivity() {
    //variabel
    lateinit var wkAdapter : WalkThroughAdapter
    lateinit var walkthrough : ViewPager
    lateinit var li_dots : LinearLayout


    val dots = arrayOfNulls<TextView>(3)
    var currentpage : Int = 0
    val a : Int = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walk_through)

        walkthrough = findViewById(R.id.vp_walkthrough)
        li_dots = findViewById(R.id.li_dots)

        wkAdapter = WalkThroughAdapter(this)
        walkthrough.adapter
        dotIndicator(currentpage) //currentpagenya 0

        initAction()
    }

    //mau geser viewpager
    fun initAction(){
        walkthrough.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                dotIndicator(position)
                currentpage = position
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
    }

    fun dotIndicator(p: Int){
        li_dots.removeAllViews()

        for (i in 0..dots.size-1){
            dots[i] = TextView(this)
            dots[i]?.textSize = 35f //bedanya pemakaian ? dan ! yakni pakai ? lebih aman
            dots[i]?.setTextColor(resources.getColor((R.color.grey)))

        }

        if (dots.size > 0){
            dots[p]?.setTextColor(resources.getColor((R.color.purple_700))) //p didapat dari parameter fun dotIndicator
        }
    }

}