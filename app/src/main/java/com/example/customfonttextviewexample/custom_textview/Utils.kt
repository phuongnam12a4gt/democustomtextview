package com.example.customfonttextviewexample.custom_textview

import android.content.Context
import android.graphics.Typeface

class Utils {
    companion object {
        private var font1: Typeface? = null
        private var font2: Typeface? = null
        private var font3: Typeface? = null
        private var font4:Typeface?=null
        fun getFont1(context: Context): Typeface? {
            if (font1 == null) {
                font1 = Typeface.createFromAsset(context.assets, "fonts/font1.ttf")
            }
            return font1
        }

        fun getFont2(context: Context): Typeface? {
            if (font2 == null) {
                font2 = Typeface.createFromAsset(context.assets, "fonts/font2.ttf")
            }
            return font2
        }

        fun getFont3(context: Context): Typeface? {
            if (font3 == null) {
                font3 = Typeface.createFromAsset(context.assets, "fonts/font3.ttf")
            }
            return font3
        }
        fun getFont4(context: Context): Typeface? {
            if (font4 == null) {
                font4 = Typeface.createFromAsset(context.assets, "fonts/font4.ttf")
            }
            return font4
        }
    }
}