package com.arm.municipios.ui.home.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arm.municipios.R
import com.arm.municipios.ui.home.DataHome

class HomeViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val titulo = view.findViewById<TextView>(R.id.tvTitulo)
    val noticia = view.findViewById<TextView>(R.id.tvNoticia)

    fun render (dataHomeModel: DataHome){
        titulo.text = dataHomeModel.titulo
        noticia.text = dataHomeModel.noticia

    }

}