package com.example.viewpager2.view.carrossel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2.R
import com.example.viewpager2.model.ModelCarrosselVO

class CarrosselAdapter(private val carrosselList: List<ModelCarrosselVO>) : RecyclerView.Adapter<CarrosselAdapter.CarrosselViewHolder>(){

    inner class CarrosselViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.img_carrossel)
        val title : TextView = itemView.findViewById(R.id.tx_carrossel)
        val progressB : ProgressBar = itemView.findViewById(R.id.pb_carrossel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarrosselViewHolder {
        return CarrosselViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_carrossel, parent, false))
    }

    override fun onBindViewHolder(holder: CarrosselViewHolder, position: Int) {
        holder.image.setImageResource(carrosselList[position].image)
        holder.title.text = carrosselList[position].title
        holder.progressB.progress = carrosselList[position].progressB
    }

    override fun getItemCount(): Int {
        return carrosselList.size
    }
}