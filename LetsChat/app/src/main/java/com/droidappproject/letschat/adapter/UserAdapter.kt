package com.droidappproject.letschat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droidappproject.letschat.R
import com.droidappproject.letschat.model.User

class UserAdapter(var context:Context, var userList: ArrayList<User>):
RecyclerView.Adapter<UserAdapter.UserViewHolder>()
{

    inner class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding: ItemProfileBinding = ItemProfileBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var v = LayoutInflater.from(context).inflate(R.layout.)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}