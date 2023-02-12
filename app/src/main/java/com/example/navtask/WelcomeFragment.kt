package com.example.navtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navtask.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)
        val inputName = requireArguments().getString("NAME1")
        val inputEmail = requireArguments().getString("EMAIL")
        binding.apply {
            tvFWDisplay.text = inputName
            tvFWDisplay2.text = inputEmail
            btnTerms.setOnClickListener {
                it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
            }
        }
        return binding.root
    }
}