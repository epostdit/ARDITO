package com.example.appardito

/*
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class   ListAdapterMusik(private val list: List<Barang>)
    : RecyclerView.Adapter<MusikViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusikViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MusikViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MusikViewHolder, position: Int) {
        val barang: Barang = list[position]
        holder.bind(barang)
    }

    override fun getItemCount(): Int = list.size

}

class MusikViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item_barang, parent, false)) {
    private var mTitleView: TextView? = null
    private var mDescView: TextView? = null
    private var mImageView: ImageView? = null


    init {
        mTitleView = itemView.findViewById(R.id.judul)
        mDescView = itemView.findViewById(R.id.desc)
        mImageView = itemView.findViewById(R.id.image)
    }

    fun bind(musik: Barang){
        mTitleView?.text = musik.title
        mDescView?.text = musik.desc.toString()
        mImageView?.setImageResource(musik.image)
    }

}