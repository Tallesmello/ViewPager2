package com.example.viewpager2.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.viewpager2.R
import com.example.viewpager2.view.carrossel.ViewPager2CarrosselActivity
import com.example.viewpager2.view.estrutura.ViewPager2Activity

class MainActivity : AppCompatActivity() {

    private val btnViewPager2Estrutura by lazy { findViewById<Button>(R.id.btnViewPager2Estrutura) }
    private val btnViewPager2Carrossel by lazy { findViewById<Button>(R.id.btnViewPager2Carrossel) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListeners()
    }

    private fun setupListeners(){
        btnViewPager2Estrutura.setOnClickListener {
            switchScreen(ViewPager2Activity())
        }

        btnViewPager2Carrossel.setOnClickListener {
            switchScreen(ViewPager2CarrosselActivity())
        }

    }

    private fun switchScreen(activity: AppCompatActivity) {
        Intent(this, activity::class.java).apply {
            startActivity(this)
        }
    }
}