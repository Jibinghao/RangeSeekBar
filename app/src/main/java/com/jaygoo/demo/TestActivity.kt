package com.jaygoo.demo

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jaygoo.widget.OnRangeChangedListener
import com.jaygoo.widget.RangeSeekBar
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        rsb_test.setRange(0f, 12f)
        rsb_test.steps = 12
        rsb_test?.setTypeface(Typeface.SANS_SERIF)
        rsb_test?.setOnRangeChangedListener(object : OnRangeChangedListener {
            override fun onRangeChanged(rangeSeekBar: RangeSeekBar, leftValue: Float, rightValue: Float, isFromUser: Boolean) {
                rangeSeekBar.leftSeekBar.setIndicatorText((leftValue.toInt() + 1).toString() + "人")
//                when {
//                    leftValue < 33.33 -> rangeSeekBar.leftSeekBar.setIndicatorText("赶往店中")
//                    leftValue < 66.66 -> rangeSeekBar.leftSeekBar.setIndicatorText("制作中")
//                    else -> rangeSeekBar.leftSeekBar.setIndicatorText("配送中")
//                }
//
//                if (rangeSeekBar.rangeSeekBarState[0].isMin) {
//                    rangeSeekBar.leftSeekBar.setIndicatorText("商家接单")
//                } else if (rangeSeekBar.rangeSeekBarState[0].isMax) {
//                    rangeSeekBar.leftSeekBar.setIndicatorText("已送达")
//                }
            }

            override fun onStartTrackingTouch(view: RangeSeekBar?, isLeft: Boolean) {

            }

            override fun onStopTrackingTouch(view: RangeSeekBar?, isLeft: Boolean) {

            }

        })
        rsb_test.setIndicatorText("1人")
    }
}
