package com.example.masterenglish

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup

fun View.margin(
    start: Float? = null,
    top: Float? = null,
    end: Float? = null,
    bottom: Float? = null
) {
    layoutParams<ViewGroup.MarginLayoutParams> {
        start?.run { leftMargin = dpToPx(this) }
        top?.run { topMargin = dpToPx(this) }
        end?.run { rightMargin = dpToPx(this) }
        bottom?.run { bottomMargin = dpToPx(this) }
    }
}

inline fun <reified T : ViewGroup.LayoutParams> View.layoutParams(block: T.() -> Unit) {
    if (layoutParams is T) block(layoutParams as T)
}

fun View.dpToPx(dp: Float): Int = context.dpToPx(dp)
fun Context.dpToPx(dp: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()