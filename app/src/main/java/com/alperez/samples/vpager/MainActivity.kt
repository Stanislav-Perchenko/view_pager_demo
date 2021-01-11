package com.alperez.samples.vpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alperez.samples.vpager.dots.VPager2DotsActivity
import com.alperez.samples.vpager.tabs.VPager2TabsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn_option_1).setOnClickListener { v -> startOption(v.id) }
        findViewById<View>(R.id.btn_option_2).setOnClickListener { v -> startOption(v.id) }
        findViewById<View>(R.id.btn_option_3).setOnClickListener { v -> startOption(v.id) }

    }

    private fun startOption(actionId: Int) {
        when(actionId) {
            R.id.btn_option_1 -> Intent(this, VPager2TabsActivity::class.java)
            R.id.btn_option_2 -> Intent(this, VPager2DotsActivity::class.java).putExtra(VPager2DotsActivity.ARG_USE_MOVING_DOT, false)
            R.id.btn_option_3 -> Intent(this, VPager2DotsActivity::class.java).putExtra(VPager2DotsActivity.ARG_USE_MOVING_DOT, true)
            else -> null
        }?.also {
            startActivity(it)
        }
    }
}