package com.example.kotlinrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentRecycler : Fragment() {
    lateinit var recyclerView:RecyclerView
    lateinit var adapter: Adapter
    lateinit var fragment:FragmentDetails

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragment=FragmentDetails()
        val arr= arrayOf("Pavitra Tripathi","Satyam Tewari","Rajat Pandey","Shubham Tewari","Sagar Tripathi")
        val arr2= arrayOf("Italy","India","Australia","NewZeeland","America")
        val view:View=inflater.inflate(R.layout.fragment_recycler, container, false)

        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this.context)
        adapter=Adapter(arr,arr2, fragment)
        recyclerView.adapter=adapter

        return view
    }
}