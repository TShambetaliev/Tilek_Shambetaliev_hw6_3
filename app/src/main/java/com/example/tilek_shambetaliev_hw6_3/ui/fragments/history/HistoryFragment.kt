package com.example.tilek_shambetaliev_hw6_3.ui.fragments.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.tilek_shambetaliev_hw6_3.databinding.FragmentHistoryBinding
import com.example.tilek_shambetaliev_hw6_3.ui.activity.MainViewModel


class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private var viewModel = MainViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHistoryBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initViews()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    private fun initViews() {
        viewModel.operation.observe(viewLifecycleOwner) {
            binding.tvHistory.text = it.toString()
        }
    }
}