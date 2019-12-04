package com.hassan.alhajji.titlededittext

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.DrawableRes

class TitleEditText(context: Context, attrs: AttributeSet): View(context,attrs){

     var mIcon:Int
     private var mShowIcon:Boolean
     var mLabelTextTint:Int
     var mEditTextTint:Int
     var mBackgroundTint:Int
     var mLabelTextSize:Float
     var mTextSize:Float
     var mRadius:Int
     var mTypeface:String?


    init {
        context.theme.obtainStyledAttributes(
            attrs, R.styleable.TitleEditText, 0, 0).apply {

            try {
                mIcon = getInteger(R.styleable.TitleEditText_icon, 0)
                mShowIcon = (mIcon > 0)
                mLabelTextTint = getInteger(R.styleable.TitleEditText_labelTextTint,android.R.color.black)
                mEditTextTint = getInteger(R.styleable.TitleEditText_editTextTint,android.R.color.black)
                mBackgroundTint = getInteger(R.styleable.TitleEditText_backgroundTint,android.R.color.white)
                mLabelTextSize = getDimension(R.styleable.TitleEditText_labelTextSize,14f)
                mTextSize = getDimension(R.styleable.TitleEditText_textSize,16f)
                mRadius = getInteger(R.styleable.TitleEditText_radius,0)
                mTypeface = getString(R.styleable.TitleEditText_typeFace)
            } finally {
                recycle()
            }
        }
    }

    fun isIconShown(): Boolean {
        return mShowIcon
    }

    fun setTextIcon(@DrawableRes icon:Int ){
        this.mIcon = icon
        invalidate()
        requestLayout()
    }

    fun setShowIcon(showIcon: Boolean) {
        this.mShowIcon = showIcon
        invalidate()
        requestLayout()
    }

//    fun setRadius()

}