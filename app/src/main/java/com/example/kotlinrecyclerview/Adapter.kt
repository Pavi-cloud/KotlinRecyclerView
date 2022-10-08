package com.example.kotlinrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView

class Adapter(val array: Array<String>, val array2: Array<String>, private val fragment: FragmentDetails):RecyclerView.Adapter<Adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_i_want,parent,false)
        return ViewHolder(itemView,fragment)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentName=array[position]
        var currentCountry=array2[position]

        holder.textView.text=currentName
        holder.textView2.text=currentCountry
    }

    override fun getItemCount(): Int {
        return array.size
    }

    class ViewHolder(itemView: View, fragment:FragmentDetails): RecyclerView.ViewHolder(itemView){
        var textView:TextView=itemView.findViewById(R.id.textView)
        var textView2:TextView=itemView.findViewById(R.id.textView2)

        lateinit var  fragmentManager:FragmentManager
        lateinit var fragmentTransaction: FragmentTransaction
        init {
            itemView.setOnClickListener{
                val bundle=Bundle()
                bundle.putString("Name",textView.toString())
                bundle.putString("Country",textView2.toString())
                fragment.arguments=bundle
                fragmentManager= fragment.requireActivity().supportFragmentManager
                fragmentTransaction=fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.mainActivity,fragment)
                fragmentTransaction.commit()
            }
        }
    }
}