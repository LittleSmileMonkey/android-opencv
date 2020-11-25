package com.example.androidopencv

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.opencv.android.Utils
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.imgproc.Imgproc

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val open = assets.open("test_origin.jpg")
        val streamBitmap = BitmapFactory.decodeStream(open)
        iv_pic.setImageBitmap(streamBitmap)
        iv_pic.postDelayed({
            val originMat = Mat()
            val grayMat = Mat()
            Utils.bitmapToMat(streamBitmap, originMat)
            Imgproc.cvtColor(originMat, grayMat, Imgproc.COLOR_RGB2GRAY)
            Utils.matToBitmap(grayMat, streamBitmap)
            iv_pic.setImageBitmap(streamBitmap)
            originMat.release()
            grayMat.release()
        }, 2000)
    }
}