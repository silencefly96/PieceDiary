package com.silencefly96.piecediary.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.silencefly96.piecediary.R
import com.silencefly96.piecediary.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = getString(R.string.test_string)
    }
}