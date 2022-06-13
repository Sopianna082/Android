package com.belajar.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter(private val list: ArrayList<PostResponse>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    inner class PostViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        //buat fungsi bind agar dapat mengirim data ke layout ini
        fun bind(postResponse: PostResponse){
            with(itemView){
                val text = "id : ${postResponse.id}\n" +
                        "title : ${postResponse.title}\n" +
                        "text : ${postResponse.text}"

                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        //bind list atau data sesuai dengan postion
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}