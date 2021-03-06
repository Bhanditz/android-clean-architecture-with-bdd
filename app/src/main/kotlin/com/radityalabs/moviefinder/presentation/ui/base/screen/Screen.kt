package com.radityalabs.moviefinder.presentation.ui.base.screen

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

abstract class Screen(context: Context,
                      attributeSet: AttributeSet? = null,
                      defStyle: Int = 0) : LinearLayout(context, attributeSet, defStyle) {

    abstract fun getClassName(): String
}