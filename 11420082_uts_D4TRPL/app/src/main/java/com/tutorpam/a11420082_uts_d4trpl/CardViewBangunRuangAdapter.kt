package com.tutorpam.a11420082_uts_d4trpl

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBangunRuangAdapter(private val listBangunRuang: ArrayList<BangunRuang>): RecyclerView.Adapter<CardViewBangunRuangAdapter.CardViewViewHolder>() {
    class CardViewViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var itemGambar: ImageView = itemView.findViewById(R.id.item_gambar)
        var itemJudul: TextView = itemView.findViewById(R.id.item_judul)
        var itemPenjelasan: TextView = itemView.findViewById(R.id.item_penjelasan)
        var btnLuas: Button = itemView.findViewById(R.id.btn_luas)
        var btnVolume: Button = itemView.findViewById(R.id.btn_volume)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_bangun_ruang,parent,false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val bangun_ruang = listBangunRuang[position]

        Glide.with(holder.itemView.context)
            .load(bangun_ruang.gambar)
            .apply(RequestOptions().override(350, 550))
            .into(holder.itemGambar)
        holder.itemJudul.text = bangun_ruang.judul
        holder.itemPenjelasan.text = bangun_ruang.penjelasan

        holder.btnLuas.setOnClickListener{Toast.makeText(holder.itemView.context,
            "Bangun Ruang " + listBangunRuang[holder.adapterPosition].judul, Toast.LENGTH_SHORT).show()}
        holder.btnVolume.setOnClickListener{Toast.makeText(holder.itemView.context,
            "Bangun Ruang " + listBangunRuang[holder.adapterPosition].judul, Toast.LENGTH_SHORT).show()}


    }

    override fun getItemCount(): Int {
        return listBangunRuang.size
    }

}