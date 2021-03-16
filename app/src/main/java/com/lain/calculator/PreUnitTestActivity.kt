package com.lain.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lain.calculator.preunittest.CalculatorTest
import kotlinx.android.synthetic.main.activity_pre_unit_test.*

class PreUnitTestActivity : AppCompatActivity() {

    var sunRes: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_unit_test)

        resultTV.text = CalculatorTest.sum(1, 2).toString()
    }
}