package com.acuns.appardito

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
import kotlinx.android.synthetic.main.fragment_barang.*


data class Barang(val title: String, val desc: String, val image: Int)

class BarangFragment : Fragment() {


    private val nicCageMusik = listOf(
        Barang("Rp. 55.000 /kg", "Bawang goreng", R.drawable.bawang),
        Barang("Rp. 35.000 /pack", "Bumbu baso",  R.drawable.bumbu_baso),
        Barang("Rp. 50.000 /pack", "Minyak bawang",  R.drawable.minyak_bawang),
        Barang("Rp. 60.000 /kg", "Cengek kering",  R.drawable.cengek_kering)
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