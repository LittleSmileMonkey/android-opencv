package com.example.androidopencv

import android.app.Application
import org.opencv.android.OpenCVLoader

/**
 * Created by xuzhenhui on 2020/11/25.
 * e-mail: sleepym09@163.com
 */
class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        OpenCVLoader.initDebug()
    }
}