package com.improveskills.habitstracker.Ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.improveskills.habitstracker.R
import com.improveskills.habitstracker.databinding.ActivityMainChartBinding

class MainChartActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            barChart.animation.duration = animationDuration
            barChart.animate(barSet)
            barChart.onDataPointClickListener={ index,_,_ ->
                tvChartName.text =
                    barSet.toList()[index]
                        .second
                        .toString()
            }
        }


    }
    companion object {

        private val barSet = listOf(
            "Day 1" to 85F,
            "Day 2" to 47F,
            "Day 3" to 100F,
            "Day 4" to 20.3F,
            "Day 5" to 50F,
            "Day 6" to 40F,
            "Day 7" to 90F,
            "Day 8" to 12F,
            "Day 9" to 60F,
            "Day 10" to 25F,
            "Day 11" to 70F,
            "Day 12" to 33F,
            "Day 13" to 40F,
            "Day 14" to 15F,
            "Day 15" to 55F,
            "Day 16" to 30F,
            "Day 17" to 65F,
            "Day 18" to 22F,
            "Day 19" to 45F,
            "Day 20" to 18F,
            "Day 21" to 35F
        )



        private const val animationDuration = 1000L
    }
}