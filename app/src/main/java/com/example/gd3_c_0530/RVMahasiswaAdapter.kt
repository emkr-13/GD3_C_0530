package com.example.gd3_c_0530

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0530.entity.Mahasiswa

class RVMahasiswaAdapter (private  val data: Array<Mahasiswa>) : RecyclerView.Adapter<RVMahasiswaAdapter.viewHolder>() {

    class viewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val tvnama: TextView = itemView.findViewById(R.id.tv_nama)
        val tvDetails: TextView = itemView.findViewById(R.id.tv_details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_mahasiswa,parent,false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = data[position]
        holder.tvnama.text = currentItem.name
        holder.tvDetails.text = "${currentItem.tahunMasuk} - ${currentItem.IPK}"
    }

    override fun getItemCount(): Int {
        return data.size
    }
}