package com.example.fragmentapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentapp.R
import com.example.fragmentapp.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener { it->
            Toast.makeText(context, "Button is clicked!", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

    companion object {

    }
}