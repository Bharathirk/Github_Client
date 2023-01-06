package com.bitflyer.github.ui.users

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bitflyer.github.R
import com.bitflyer.github.data.models.response.UserResponseItem
import com.bitflyer.github.databinding.ItemFollowerBinding

class UserAdapter(
    val context: Context,
    val followerClickManager: FollowerClickManager
) : RecyclerView.Adapter<UserAdapter.FollowerViewHolder>() {
    private val dataItemList = mutableListOf<UserResponseItem?>()

    fun setFollwerList(followerList: List<UserResponseItem?>) {
        dataItemList.clear()
        dataItemList.addAll(followerList)
        notifyDataSetChanged()
    }

    interface FollowerClickManager {
        fun onItemClick(followerItem: UserResponseItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        return FollowerViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_follower, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        val user = dataItemList[position]
        val binding: ItemFollowerBinding = holder.getBinding()
        holder.bind(position)
        binding.dataItem = user
    }

    override fun getItemCount(): Int {
        return dataItemList.size
    }

    inner class FollowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        private var binding: ItemFollowerBinding? = null

        init {
            binding = DataBindingUtil.bind(itemView)
            itemView.setOnClickListener(this)
        }

        fun getBinding(): ItemFollowerBinding {
            return binding!!
        }
        fun bind(position: Int){
            val user = dataItemList[position]
            Glide.with(context).load(user!!.avatarUrl).into(itemView.findViewById(R.id.imageView53))
        }

        override fun onClick(v: View?) {
            followerClickManager.onItemClick(dataItemList[absoluteAdapterPosition]!!)
        }
    }
}