package com.imyyq.indicatorview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onMinus(view: View) {
        indicatorView.mItemCount--
    }

    fun onAdd(view: View) {
        indicatorView.mItemCount++
    }

    fun onSwitch(view: View) {
        indicatorView.mCurSelect++
    }

    fun onLeftSwitch(view: View) {
        indicatorView.mCurSelect--
    }
}
