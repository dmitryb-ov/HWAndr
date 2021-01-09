package com.android.my.hw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.recyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.apply {
            adapter = Adapter(layoutResId = R.layout.view_item_main,
                callback = { replaceVideoFragment(it) })
            layoutManager = LinearLayoutManager(context)
        }
    }


    private fun replaceVideoFragment(url: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, PlayerFragment.newInstance(url))
            .commit()
    }
}
