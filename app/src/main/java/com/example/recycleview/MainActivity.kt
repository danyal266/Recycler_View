package com.example.recycleview

import android.icu.text.Transliterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager


import com.example.recycleview.Adapter.adapter
import com.example.recycleview.Adapter.foodItemClicked


import com.example.recycleview.DataSource.DataSource
import com.example.recycleview.model.model

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),foodItemClicked{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = DataSource().load_image()
        recycle.adapter = adapter(this, myDataset,this)
        recycle.setHasFixedSize(true)
//        recycle.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        // recycle.layoutManager = GridLayoutManager(this,2)
        recycle.layoutManager = LinearLayoutManager(this)

        //        recycle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)



    }


    override fun onItemClicked(item: model) {

        Toast.makeText(this, "Clicked item is $item", Toast.LENGTH_SHORT).show()
    }




}