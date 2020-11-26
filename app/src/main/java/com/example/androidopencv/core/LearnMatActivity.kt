package com.example.androidopencv.core

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidopencv.R
import com.example.androidopencv.utils.MatUtil
import kotlinx.android.synthetic.main.activity_learn_mat.*
import org.opencv.android.Utils

class LearnMatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_mat)
        val originMat = Utils.loadResource(this, R.drawable.test_origin)
        val originBitmap = Bitmap.createBitmap(originMat.cols(), originMat.rows(), Bitmap.Config.RGB_565)
        Log.e("test", originMat.toString())
        MatUtil.printMat(originMat)
        Utils.matToBitmap(originMat, originBitmap)
        iv_origin.setImageBitmap(originBitmap)
    }
}