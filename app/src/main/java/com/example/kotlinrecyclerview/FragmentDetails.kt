package com.example.kotlinrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentDetails : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View=inflater.inflate(R.layout.fragment_details, container, false)
        var textView1:TextView=view.findViewById(R.id.textView1)
        var textView2:TextView=view.findViewById(R.id.textView2)

        val bundle=arguments
        var str1:String?=bundle?.getString("Name")
        var str2:String?=bundle?.getString("Country")

        textView1.text=str1
        textView2.text=str2

        return view
    }
}