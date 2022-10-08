package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    val fragmentManager:FragmentManager=supportFragmentManager
    val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
    val fragmentRecycler:FragmentRecycler= FragmentRecycler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentTransaction.replace(R.id.mainActivity,fragmentRecycler)
        fragmentTransaction.commit()
    }
}