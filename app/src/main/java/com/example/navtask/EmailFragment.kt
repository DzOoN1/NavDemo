package com.example.navtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.navtask.databinding.FragmentEmailBinding


class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmailBinding.inflate(inflater,container,false)
        val name = requireArguments().getString("NAME")
        binding.btnFESubmit.setOnClickListener {
            if(binding.etFEEmail.text.toString() != ""){
                val bundle = bundleOf("NAME1" to name,"EMAIL" to binding.etFEEmail.text.toString())
                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment,bundle)
            }else{
                Toast.makeText(activity,"Invalid input",Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}