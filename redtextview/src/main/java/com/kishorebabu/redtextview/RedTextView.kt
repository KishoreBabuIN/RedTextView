package com.kishorebabu.redtextview

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class RedTextView : AppCompatTextView {
  constructor(context: Context) : super(context) {
    init(context)
  }

  constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
    init(context)
  }

  constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs,
      defStyleAttr) {
    init(context)
  }

  private fun init(context: Context) {
    this.setTextColor(Color.RED)
  }

  override fun setTextColor(color: Int) {
    super.setTextColor(Color.RED)
  }
}