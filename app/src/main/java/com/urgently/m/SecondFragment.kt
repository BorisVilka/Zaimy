package com.urgently.m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.urgently.m.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var pol = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        binding.checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            pol = isChecked
        }
        binding.button.setOnClickListener {
            if(pol) {
                val navController = Navigation.findNavController(requireActivity(),R.id.fragmentContainerView)
                navController.popBackStack()
                navController.popBackStack()
                navController.navigate(R.id.endFragment)
            }
        }
        return binding.root
    }


}