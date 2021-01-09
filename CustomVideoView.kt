package com.android.my.hw

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class CustomVideoView(context: Context, attributeSet: AttributeSet? = null) : AppCompatImageView(context, attributeSet) {

    fun setEndPadding(value: Float) {
        setPadding(0, 0, value.toInt(), 0)
    }
}