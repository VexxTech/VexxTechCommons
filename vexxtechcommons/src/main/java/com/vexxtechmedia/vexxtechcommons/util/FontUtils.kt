package com.vexxtechmedia.vexxtechcommons.util

import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.io.File

object FontUtils {

    private const val FONT_AWESOME: String = "fonts/fontawesome-webfont.ttf"

    fun getTypeface(fontFile: File): Typeface = Typeface.createFromFile(fontFile)

    fun renderIconsInView(view: View) {
        if (view is ViewGroup) {
            val viewGroup: ViewGroup = view

            for (i in 0 until viewGroup.childCount) {
                val child = viewGroup.getChildAt(i)

                renderIconsInView(child)
            }
        } else if (view is TextView) {
            view.typeface = createIconTypeFace(view.context)
        }
    }

    private fun createIconTypeFace(context: Context): Typeface {
        return Typeface.createFromAsset(context.assets, FONT_AWESOME)
    }
}