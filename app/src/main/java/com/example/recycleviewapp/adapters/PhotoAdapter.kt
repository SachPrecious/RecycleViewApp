package com.example.recycleviewapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewapp.PhotoRepository
import com.example.recycleviewapp.R

class PhotoAdapter(private val mList: List<PhotoRepository>) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {


    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        //holder.imageView.setImageResource(ItemsViewModel.thumbnailUrl)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.title

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }









    // Holds the views for adding it to image and text
    //View Holder has the reference for single instance of our application
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

}