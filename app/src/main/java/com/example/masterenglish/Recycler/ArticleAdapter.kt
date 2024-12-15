package com.example.masterenglish.Recycler

import android.R
import android.content.Context
import android.content.Intent
import android.os.IInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.masterenglish.databinding.ItemBinding
import java.io.Reader
import com.example.masterenglish.ItemClickListener


class ArticleAdapter(private val objects : ArrayList<Model>, val listener : ItemClickListener ) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>(){

    inner class  ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(position: Int) = with(binding){

            binding.root.setOnClickListener{
                listener.clickListen(
                    chapter = objects[position]
                )
            }

            val data = objects[position]
            chapter.text = data.chapter
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleAdapter.ViewHolder {
        return ViewHolder(ItemBinding.inflate((LayoutInflater.from(parent.context)), parent, false))
    }

    override fun onBindViewHolder(holder: ArticleAdapter.ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = objects.size


}
