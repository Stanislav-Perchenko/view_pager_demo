package com.alperez.samples.vpager.dots

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.alperez.samples.vpager.DemoPagerAdapter
import com.alperez.samples.vpager.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * Created by stanislav.perchenko on 11.01.2021 at 14:21.
 */
class VPager2DotsActivity: AppCompatActivity() {

    companion object {
        const val ARG_USE_MOVING_DOT = "move_dot"
    }

    private lateinit var vPager: ViewPager2
    private lateinit var vTabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val argMove: Boolean = intent?.getBooleanExtra(ARG_USE_MOVING_DOT, false) ?: false
        setContentView(if (argMove) R.layout.activity_vpager2_dots_moving else R.layout.activity_vpager2_dots_switched)
        vPager = findViewById<ViewPager2>(R.id.v_pager).let {
            it.adapter = DemoPagerAdapter()
            it
        }
        vTabs = findViewById(R.id.tabs_layout)
        TabLayoutMediator(vTabs, vPager) {
                tab, _ -> tab.text = ""
        }.attach()
    }
}