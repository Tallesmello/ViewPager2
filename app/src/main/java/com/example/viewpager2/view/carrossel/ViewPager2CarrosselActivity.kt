package com.example.viewpager2.view.carrossel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.R
import com.example.viewpager2.model.ModelCarrosselVO

class ViewPager2CarrosselActivity : AppCompatActivity() {

    companion object {
        const val PROGRESS_ONE = 25
        const val PROGRESS_TWO = 50
        const val PROGRESS_THREE = 75
        const val PROGRESS_FOUR = 100
    }

    private val viewPager2Carrossel by lazy { findViewById<ViewPager2>(R.id.vp_carrossel) }

    private var carrosselList = mutableListOf<ModelCarrosselVO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2_carrossel)

        postToList()

        viewPager2Carrossel.adapter = CarrosselAdapter(
            carrosselList
        )
        viewPager2Carrossel.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    private fun addToList(
        image: Int,
        title: String,
        progressBar: Int
    ) {
        val carrosselVO = ModelCarrosselVO(
            image,
            title,
            progressBar
        )
        carrosselList.add(carrosselVO)
    }

    private fun postToList() {
        addToList(
            R.drawable.rick1,
            getString(R.string.teste_one),
            PROGRESS_ONE
        )
        addToList(
            R.drawable.rick2,
            getString(R.string.teste_two),
            PROGRESS_TWO
        )
        addToList(
            R.drawable.rick3,
            getString(R.string.teste_three),
            PROGRESS_THREE
        )
        addToList(
            R.drawable.rick4,
            getString(R.string.teste_four),
            PROGRESS_FOUR
        )

    }

}