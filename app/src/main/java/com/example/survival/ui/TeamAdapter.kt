package com.example.survival.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.survival.R
import com.example.survival.data.domin.Team
import com.example.survival.databinding.ItemTeamBinding

class TeamAdapter(val list: List<Team>): RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_team, parent, false)
        return  TeamViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team = list[position]
        holder.binding.apply {
            textRang.text = team.rank.toString()
            textTeamName.text = team.teamName
            textGold.text = team.goldMedal.toString()
            textSilver.text = team.silverMedal.toString()
            textBronze.text = team.bronzeMedal.toString()
            textRByTotal.text = team.rByTotal.toString()
        }
    }

    override fun getItemCount() = list.size

    class TeamViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
        val binding = ItemTeamBinding.bind(viewItem)
    }
}