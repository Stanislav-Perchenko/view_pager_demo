package com.alperez.samples.vpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by stanislav.perchenko on 11.01.2021 at 15:11.
 */
class DemoPagerAdapter: RecyclerView.Adapter<DemoPagerAdapter.VH>() {

    private val data: List<String> = listOf("1", "2", "3")

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(LayoutInflater.from(parent.context).inflate(R.layout.demo_vpager2_cell, parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) {
        (holder.v as? TextView)?.also {
            it.text = "Page ${data[position]}"
            val colorResId: Int = if (position % 2 == 0) R.color.blue else R.color.orange
            it.setBackgroundColor(ContextCompat.getColor(it.context, colorResId))
        }
    }


    class VH(val v: View): RecyclerView.ViewHolder(v)
}