package com.example.androidopencv.utils;

import android.util.Log;

import org.opencv.core.Mat;

/**
 * Created by xuzhenhui on 2020/11/26.
 * e-mail: sleepym09@163.com
 */
public class MatUtil {

    private static final String TAG = MatUtil.class.getSimpleName();

    public static void printMat(Mat src) {
        if (src == null) return;
        int channels = src.channels();
        int cols = src.cols();
        int rows = src.rows();
        byte[] data = new byte[cols * rows * channels];
        src.get(0, 0, data);
        StringBuilder tempStr = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            if (tempStr.length() > 0) {
                tempStr.delete(0, tempStr.length() - 1);
            }
            tempStr.append("第").append(i).append("行：");
            for (int j = 0; j < cols; j++) {
                tempStr.append("[");
                for (int channel = 0; channel < channels; channel++) {
                    tempStr.append(data[i * cols * channels + j * channels + channel] & 0xff).append(",");
                }
                tempStr.append("]");
                if (j < cols - 1) tempStr.append(",");
            }
            Log.i(TAG, tempStr.toString());
        }
    }
}
