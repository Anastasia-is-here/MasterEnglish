package com.example.masterenglish.Recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.masterenglish.databinding.ItemBinding
import com.example.masterenglish.ItemClickListener
import com.example.masterenglish.margin


class ArticleAdapter(private val objects : ArrayList<Model>, val listener : ItemClickListener ) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>(){

    inner class  ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(position: Int) = with(binding){

            binding.root.margin(top = if(position == 0) 0f else 7f)

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
    ): ViewHolder {
        return ViewHolder(ItemBinding.inflate((LayoutInflater.from(parent.context)), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = objects.size


}
