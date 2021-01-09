package com.android.my.hw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_item_player.view.*

class Adapter(private val callback: ((String) -> Unit)? = null, private val layoutResId: Int)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val items = DataSource.items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(layoutResId, parent, false))


    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        items[position].also { item ->
            holder.bind(item)
            holder.itemView.setOnClickListener {
                callback?.invoke(item.previewUrl)
            }
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: Item) {
            Picasso.get()
                .load(item.previewUrl)
                .into(itemView.imagePreview)
        }
    }
}