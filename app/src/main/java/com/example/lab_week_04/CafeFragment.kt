package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CafeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // pastikan ini menunjuk ke file layout yang benar
        return inflater.inflate(R.layout.fragment_cafe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // AMBIL VIEW DARI LAYOUT DENGAN EXPLICIT findViewById
        // NOTE: gunakan R.id.view_pager dan R.id.tab_layout sesuai dengan id di fragment_cafe.xml
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)

        // Pasang adapter ke ViewPager2
        val adapter = CafeAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter

        // Sambungkan TabLayout dan ViewPager2
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = resources.getString(TABS_FIXED[position])
        }.attach()
    }
}