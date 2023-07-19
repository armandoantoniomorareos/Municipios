package com.arm.municipios.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arm.municipios.R
import com.arm.municipios.databinding.FragmentHomeBinding
import com.arm.municipios.ui.home.recyclerview.HomeAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root





            initRecyclerViewHome()


        return root
    }

    private fun initRecyclerViewHome() {
        val recyclerView = binding.root.findViewById<RecyclerView>(R.id.recyclerViewHome)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = HomeAdapter(HomeProvider.homeList)}

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
