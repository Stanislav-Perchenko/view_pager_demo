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
        findViewById<View>(R.id.btn_option_1).setOnClickListener { _ -> startActivity(Intent(this, VPager2TabsActivity::class.java)) }
        findViewById<View>(R.id.btn_option_2).setOnClickListener { _ -> startActivity(Intent(this, VPager2DotsActivity::class.java)) }
    }
}