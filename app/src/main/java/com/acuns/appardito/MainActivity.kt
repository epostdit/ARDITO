package com.acuns.appardito

/*
Nim                 : 10117141
Nama                : Aditya
Kelas               : IF4

 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ic_home = HomeFragment()
        val ic_belanja = BarangFragment()
        val ic_beli = BeliBarang()

        makeCurrentFragment(ic_home)

        bottom_nav.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(ic_home)
                R.id.ic_belanja -> makeCurrentFragment(ic_belanja)
                R.id.ic_beli -> makeCurrentFragment(ic_beli)
            }
            true
        }

    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}

