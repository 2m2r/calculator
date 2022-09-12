package com.ghabiomar.calculatorapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        var text : String

        btn1.setOnClickListener {
            text= inputNumber.text.toString()+"1"
            inputNumber.setText(text)

        }
        btn2.setOnClickListener {
            text= inputNumber.text.toString()+"2"
            inputNumber.setText(text)

        }
        btn3.setOnClickListener {
            text= inputNumber.text.toString()+"3"
            inputNumber.setText(text)
        }
        btn4.setOnClickListener {
            text= inputNumber.text.toString()+"4"
            inputNumber.setText(text)
        }
        btn5.setOnClickListener {
            text= inputNumber.text.toString()+"5"
            inputNumber.setText(text)
        }
        btn6.setOnClickListener {
            text= inputNumber.text.toString()+"6"
            inputNumber.setText(text)
        }
        btn7.setOnClickListener {
            text= inputNumber.text.toString()+"7"
            inputNumber.setText(text)
        }
        btn8.setOnClickListener {
            text= inputNumber.text.toString()+"8"
            inputNumber.setText(text)
        }
        btn9.setOnClickListener {
            text= inputNumber.text.toString()+"9"
            inputNumber.setText(text)
        }
        btnZr.setOnClickListener {
            text= inputNumber.text.toString()+"0"
            inputNumber.setText(text)
        }
        btnPt.setOnClickListener {

        }
        btnPerCe.setOnClickListener {

        }
        btnBrace1.setOnClickListener {

        }
        btnBrace2.setOnClickListener {

        }
        btnClear.setOnClickListener {
            inputNumber.setText(null)
            output.setText(null)
        }
        btnDelete.setOnClickListener {

        }
        btnCos.setOnClickListener {

        }
        btnSin.setOnClickListener {

        }
        btnAdd.setOnClickListener {


        }
        btnMin.setOnClickListener {

        }
        btnMul.setOnClickListener {

        }
        btnDiv.setOnClickListener {

        }
        btnEq.setOnClickListener {

        }



    }

}