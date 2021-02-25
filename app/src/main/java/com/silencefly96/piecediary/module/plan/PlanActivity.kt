package com.silencefly96.piecediary.module.plan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.silencefly96.piecediary.databinding.ActivityPlanBinding
import com.silencefly96.piecediary.module.plan.model.Injection
import com.silencefly96.piecediary.other.extension.replaceFragment

private lateinit var binding: ActivityPlanBinding

class PlanActivity : AppCompatActivity() {

    lateinit var planViewModel: PlanViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        planViewModel = ViewModelProvider(this).get(PlanViewModel::class.java)

        planViewModel.planRepository = Injection.providePlanRepository(this)

        replaceFragment(PlanListFragment.newInstance(planViewModel), binding.listFrame.id)

        replaceFragment(PlanDetailFragment.newInstance(planViewModel), binding.detailFrame.id)

    }


}