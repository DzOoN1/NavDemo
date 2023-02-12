package com.example.navtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.navtask.databinding.FragmentNameBinding

class NameFragment : Fragment() {

    private lateinit var binding: FragmentNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNameBinding.inflate(inflater,container,false)
        binding.btnFNSubmit.setOnClickListener {
            if(binding.etFNName.text.toString() != ""){
                val bundle = bundleOf("NAME" to binding.etFNName.text.toString())
                it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment,bundle)
            }else{
                Toast.makeText(activity,"Invalid input",Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}