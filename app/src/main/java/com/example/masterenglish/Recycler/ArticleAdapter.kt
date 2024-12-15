package com.example.masterenglish.Recycler

import android.R
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.masterenglish.databinding.ItemBinding
import java.io.Reader

class ArticleAdapter(private val objects : ArrayList<Model>) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>(){

    inner class  ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(position: Int) = with(binding){

            binding.root.setOnClickListener{
                //startActivity(Intent(context, Reader::class.java).putExtra(“file”, data.link))
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