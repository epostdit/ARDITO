package com.example.appardito

/*
Tanggal Pengerjaan  : 13-05-2020
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import kotlinx.android.synthetic.main.fragment_barang.*


data class Barang(val title: String, val desc: String, val image: Int)

class BarangFragment : Fragment() {

    private val nicCageMusik = listOf(
        Barang("Avenged Sevenfold", "Save me", R.drawable.a7x),
        Barang("Avenged Sevenfold", "Almost Easy",  R.drawable.a7x),
        Barang("Avenged Sevenfold", "So Far Away",  R.drawable.a7x),
        Barang("Avenged Sevenfold", "Beast and The Harlot",  R.drawable.a7x)
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_barang, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_barang.apply {
            list_barang.layoutManager = LinearLayoutManager(activity)
            list_barang.adapter = ListAdapterMusik(nicCageMusik)
        }
    }
}