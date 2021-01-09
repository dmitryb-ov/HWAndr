package com.android.my.hw

object DataSource {
    val items by lazy {
        mutableListOf<Item>().apply {
                add(Item("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg",
                    R.drawable.beta))
            }
    }
}

data class Item(
    val previewUrl: String,
    val thumbID: Int
)