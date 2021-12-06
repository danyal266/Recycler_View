package com.example.recycleview.DataSource

import com.example.recycleview.R
import com.example.recycleview.model.model

class DataSource {
    fun load_image():List<model>{
        return listOf<model>(
            model(R.drawable.image_1,"Burger"),
            model(R.drawable.image_2,"pizza"),
            model(R.drawable.image_3,"Sharma"),
            model(R.drawable.image_4,"Biryani"),
            model(R.drawable.image_5,"BBQ"),
            model(R.drawable.image_6,"Burger"),
            model(R.drawable.image_7,"Burger"),
        )
    }

}
