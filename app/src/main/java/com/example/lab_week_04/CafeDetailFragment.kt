package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val index = arguments?.getInt("tab_index") ?: 0
        val textView = view.findViewById<TextView>(R.id.cafeText)

        textView.text = when (index) {
            0 -> "Ini halaman Starbucks"
            1 -> "Ini halaman Janji Jiwa"
            2 -> "Ini halaman Kopi Kenangan"
            else -> "Cafe Detail"
        }
    }
}