package com.arm.municipios.ui.dashboard.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arm.municipios.R
import com.arm.municipios.ui.dashboard.DataDashboard

class DashboardAdapter(private val dashboardlist:List<DataDashboard>) : RecyclerView.Adapter<DashboardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DashboardViewHolder(layoutInflater.inflate(R.layout.item_dashboard, parent, false))

    }

    override fun getItemCount(): Int {
        return dashboardlist.size
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val itemD = dashboardlist[position]
        holder.renderD(itemD)

    }
}