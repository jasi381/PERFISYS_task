package com.jasmeet.perfisystask.utils

import android.graphics.Bitmap
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.palette.graphics.Palette

object Utils {

    fun getDominantColorFromBitmap(bitmap: Bitmap): Color {
        val palette = Palette.from(bitmap).generate()
        return Color(palette.dominantSwatch?.rgb ?: Color.White.toArgb())
    }

}