package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentapp.databinding.ActivityMainBinding
import com.example.fragmentapp.ui.fragment.BlankFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frameLayout,BlankFragment())
        ft.commit()
    }
}