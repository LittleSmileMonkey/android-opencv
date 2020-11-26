package com.example.androidopencv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidopencv.adapter.ActivityAdapter
import com.example.androidopencv.core.LearnMatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = ActivityAdapter()
    private val packages = mutableListOf(
        ActivityAdapter.ActivityItem(LearnMatActivity::class.java)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_package.layoutManager = LinearLayoutManager(this)
        rv_package.adapter = adapter
        adapter.setNewInstance(packages)
    }
}