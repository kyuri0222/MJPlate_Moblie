package com.example.mjplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener {
            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        items.add(
            ContentsModel(
            "https://www.mangoplate.com/restaurants/eI6DHlOLb6",
        "https://mp-seoul-image-production-s3.mangoplate.com/1946053_1629786743918702.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
        "가타쯔무리"
            )
        )
        items.add(
            ContentsModel(
            "https://www.mangoplate.com/restaurants/kPpgdk2OszjV",
        "https://mp-seoul-image-production-s3.mangoplate.com/364648/2198865_1646895697705_30026?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
        "주인백파스타"
            )
        )
        items.add(
            ContentsModel(
            "https://www.mangoplate.com/restaurants/sFcUSLf1qz",
        "https://mp-seoul-image-production-s3.mangoplate.com/1515134_1625475926950198.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
        "모래내곱창"
            )
        )
        items.add(
            ContentsModel(
            "https://www.mangoplate.com/restaurants/qx42lUyMsi",
        "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/341060_1447387527419.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
        "엄마손떡볶이"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/qOMxQ7IvyKdK",
                "https://mp-seoul-image-production-s3.mangoplate.com/617296_1589629896758137.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "베가보쌈"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/fGSDkciC_k8a",
                "https://mp-seoul-image-production-s3.mangoplate.com/59540_1598064273341521.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "런드린즈"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/eI6DHlOLb6",
                "https://mp-seoul-image-production-s3.mangoplate.com/1946053_1629786743918702.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "가타쯔무리"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/kPpgdk2OszjV",
                "https://mp-seoul-image-production-s3.mangoplate.com/364648/2198865_1646895697705_30026?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "주인백파스타"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/sFcUSLf1qz",
                "https://mp-seoul-image-production-s3.mangoplate.com/1515134_1625475926950198.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "모래내곱창"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/qx42lUyMsi",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/341060_1447387527419.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "엄마손떡볶이"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/qOMxQ7IvyKdK",
                "https://mp-seoul-image-production-s3.mangoplate.com/617296_1589629896758137.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "베가보쌈"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/fGSDkciC_k8a",
                "https://mp-seoul-image-production-s3.mangoplate.com/59540_1598064273341521.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "런드린즈"
            )
        )


        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        // Recyclerview item Click Event
        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, postion: Int) {
                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[postion].url)
                intent.putExtra("title", items[postion].titleText)
                intent.putExtra("imageUrl", items[postion].imageUrl)
                startActivity(intent)
            }
        }
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}

















