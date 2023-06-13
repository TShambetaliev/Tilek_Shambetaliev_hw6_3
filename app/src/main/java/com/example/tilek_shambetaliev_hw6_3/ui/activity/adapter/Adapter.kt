package com.example.tilek_shambetaliev_hw6_3.ui.activity.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tilek_shambetaliev_hw6_3.ui.fragments.button.ButtonFragment
import com.example.tilek_shambetaliev_hw6_3.ui.fragments.count.CountFragment
import com.example.tilek_shambetaliev_hw6_3.ui.fragments.history.HistoryFragment

class Adapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonFragment()
            1 -> CountFragment()
            2 -> HistoryFragment()
            else -> ButtonFragment()
        }
    }
}