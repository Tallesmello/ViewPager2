package com.example.viewpager2

import android.media.audiofx.AudioEffect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var detailsList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    private val viewPager2 by lazy { findViewById<ViewPager2>(R.id.view_pager2) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        viewPager2.adapter = ViewPagerAdapter(titlesList,detailsList,imagesList)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager2)
    }

    private fun addToList(title: String, description: String, image: Int) {
        titlesList.add(title)
        detailsList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        for (i in 1..5) {
            addToList("title $i", "Descriptor $i", R.mipmap.ic_launcher_round)
        }
    }
}