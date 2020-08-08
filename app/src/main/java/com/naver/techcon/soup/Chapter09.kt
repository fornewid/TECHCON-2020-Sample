package com.naver.techcon.soup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class Chapter09 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter_09)

        val items = listOf(
            Item(R.drawable.img_01, "I am debugging.  🤯‍💻👾"),
            Item(R.drawable.img_02, "My foldable phone.  💸💸💸"),
            Item(R.drawable.img_03, "NAVER TECHCON 2020  🅽🎙")
        )
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = Adapter().apply { submitList(items) }
    }

    data class Item(
        @DrawableRes
        val thumbnailResId: Int,
        val label: String
    )

    class Adapter : ListAdapter<Item, ViewHolder>(NoDiffCallback()) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.chapter_09_item, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(getItem(position))
        }
    }

    class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {

        private val thumbnail: ImageView = root.findViewById(R.id.thumbnail)
        private val text: TextView = root.findViewById(R.id.label)

        fun bind(item: Item) {
            thumbnail.setImageResource(item.thumbnailResId)
            text.text = item.label
        }
    }

    class NoDiffCallback<T> : DiffUtil.ItemCallback<T>() {
        override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = false
        override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = false
    }
}
