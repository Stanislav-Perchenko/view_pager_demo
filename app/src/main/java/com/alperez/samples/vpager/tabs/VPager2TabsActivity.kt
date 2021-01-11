package com.alperez.samples.vpager.tabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.alperez.samples.vpager.DemoPagerAdapter
import com.alperez.samples.vpager.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * Created by stanislav.perchenko on 11.01.2021 at 14:20.
 */
class VPager2TabsActivity : AppCompatActivity() {


    private lateinit var vPager: ViewPager2
    private lateinit var vTabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vpager2_tabs)
        vPager = findViewById<ViewPager2>(R.id.v_pager).let {
            it.adapter = DemoPagerAdapter()
            it
        }
        vTabs = findViewById(R.id.tabs_layout)
        TabLayoutMediator(vTabs, vPager) {
                tab, position -> tab.text = "Tab $position"
        }.attach()
    }

}