package com.arm.municipios

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arm.municipios.databinding.ActivityMainBinding
import com.arm.municipios.ui.dashboard.DashboardProvider
import com.arm.municipios.ui.dashboard.recyclerview.DashboardAdapter
import com.arm.municipios.ui.home.HomeFragment
import com.arm.municipios.ui.home.HomeProvider
import com.arm.municipios.ui.home.recyclerview.HomeAdapter

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val navView: BottomNavigationView = binding.navView

            val navController = findNavController(R.id.nav_host_fragment_activity_main)
            // Passing each menu ID as a set of Ids because each
            // menu should be considered as top level destinations.
            val appBarConfiguration = AppBarConfiguration(
                setOf(
                    R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
                )
            )
          //  setupActionBarWithNavController(navController, appBarConfiguration)
            navView.setupWithNavController(navController)



    }

    }

    /*private fun initRecyclerViewDashboard(){
        val recyclerViewD = findViewById<RecyclerView>(R.id.recyclerViewDashboard)
        recyclerViewD.layoutManager = LinearLayoutManager(this)
        recyclerViewD.adapter = DashboardAdapter(DashboardProvider.dashboardlist)*/


