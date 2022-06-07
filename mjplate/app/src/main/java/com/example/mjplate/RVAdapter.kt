package com.example.mjplate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//이미지 텍스트 링크 세개의 데이터를 받을거야

class RVAdapter(val List : MutableList<ContentsModel>) : RecyclerView.Adapter<RVAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(List[position])
    }

    override fun getItemCount(): Int {
        return List.size
    }

    // ViewHolder 만들기

    //리사이클러 뷰에 데이터 넣어서 연결
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item:ContentsModel) {
            val rv_text = itemView.findViewById<TextView>(R.id.rvTextArea)
            val rv_img = itemView.findViewById<ImageView>(R.id.rvImageArea)

            rv_text.text = item.titleText
        }
    }

}