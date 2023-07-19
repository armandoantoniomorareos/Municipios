package com.arm.municipios.ui.dashboard.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arm.municipios.R
import com.arm.municipios.ui.dashboard.DataDashboard

class DashboardViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val nombreApoyo = view.findViewById<TextView>(R.id.tvApoyo)
    val informacion = view.findViewById<TextView>(R.id.tvInformacion)

    fun renderD (dataDashboard: DataDashboard){
        nombreApoyo.text = dataDashboard.NombreApoyo
        informacion.text = dataDashboard.Informacion
    }
}