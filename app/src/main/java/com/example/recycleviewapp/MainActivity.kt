package com.example.recycleviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewapp.adapters.PhotoAdapter
import com.example.recycleviewapp.api.UserAPIService

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<PhotoRepository>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(PhotoRepository(R.drawable.ozil.toString(), "Item " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = PhotoAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter



    }
}