package com.example.tilek_shambetaliev_hw6_3.ui.fragments.button

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.tilek_shambetaliev_hw6_3.ui.activity.MainViewModel
import com.example.tilek_shambetaliev_hw6_3.databinding.FragmentButtonBinding


class ButtonFragment : Fragment() {
    private lateinit var binding: FragmentButtonBinding
    private lateinit var viewmodel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentButtonBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initListeners()
    }

    private fun initViewModel() {
        viewmodel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    private fun initListeners() {
        with(binding) {
            btnPlus.setOnClickListener {
                viewmodel.increment()
            }
            btnMinus.setOnClickListener {
                viewmodel.decrement()
            }
        }
    }
}