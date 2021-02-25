package com.silencefly96.piecediary.module.diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.silencefly96.piecediary.R
import com.silencefly96.piecediary.databinding.ActivityDiaryBinding
import com.silencefly96.piecediary.module.plan.PlanActivity

private lateinit var binding: ActivityDiaryBinding

class DiaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = getString(R.string.test_string)
        startActivity(Intent(this, PlanActivity::class.java))
    }
}