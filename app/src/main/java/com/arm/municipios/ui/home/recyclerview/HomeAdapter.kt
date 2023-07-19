package com.arm.municipios.ui.home.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arm.municipios.R
import com.arm.municipios.ui.home.DataHome

class HomeAdapter(val datahomelist:List<DataHome>) :RecyclerView.Adapter<HomeViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return HomeViewHolder(layoutInflater.inflate(R.layout.item_home, parent, false))

    }

    override fun getItemCount(): Int {
        return datahomelist.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = datahomelist[position]
        holder.render(item)

    }
}