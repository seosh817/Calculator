package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input : String = "0"
        var adder : String = "0"
        var operator : String = "+"
        var flag : Boolean = false



        clear.setOnClickListener {
            inputText.setText("0")
            adder = "0"
            input = "0"
        }
        nine.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "9"
                    inputText.setText(input)
                } else {
                    input = input + "9"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "9"
                    inputText.setText(adder)
                } else {
                    adder = adder + "9"
                    inputText.setText(adder)
                }
            }
        }
        eight.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "8"
                    inputText.setText(input)
                } else {
                    input = input + "8"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "8"
                    inputText.setText(adder)
                } else {
                    adder = adder + "8"
                    inputText.setText(adder)
                }
            }
        }
        seven.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "7"
                    inputText.setText(input)
                } else {
                    input = input + "7"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "7"
                    inputText.setText(adder)
                } else {
                    adder = adder + "7"
                    inputText.setText(adder)
                }
            }
        }
        six.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "6"
                    inputText.setText(input)
                } else {
                    input = input + "6"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "6"
                    inputText.setText(adder)
                } else {
                    adder = adder + "6"
                    inputText.setText(adder)
                }
            }
        }
        five.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "5"
                    inputText.setText(input)
                } else {
                    input = input + "5"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "5"
                    inputText.setText(adder)
                } else {
                    adder = adder + "5"
                    inputText.setText(adder)
                }
            }
        }
        four.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "4"
                    inputText.setText(input)
                } else {
                    input = input + "4"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "4"
                    inputText.setText(adder)
                } else {
                    adder = adder + "4"
                    inputText.setText(adder)
                }
            }
        }
        three.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "3"
                    inputText.setText(input)
                } else {
                    input = input + "3"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "3"
                    inputText.setText(adder)
                } else {
                    adder = adder + "3"
                    inputText.setText(adder)
                }
            }
        }
        two.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "2"
                    inputText.setText(input)
                } else {
                    input = input + "2"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "2"
                    inputText.setText(adder)
                } else {
                    adder = adder + "2"
                    inputText.setText(adder)
                }
            }
        }
        one.setOnClickListener {
            if(flag == false)
            {
                if (input.equals("0")) {
                    input = "1"
                    inputText.setText(input)
                } else {
                    input = input + "1"
                    inputText.setText(input)
                }
            }
            else
            {
                if (adder.equals("0")) {
                    adder = "1"
                    inputText.setText(adder)
                } else {
                    adder = adder + "1"
                    inputText.setText(adder)
                }
            }
        }
        plus.setOnClickListener {
            input = (input.toInt() + adder.toInt()).toString()
            inputText.setText(input)
            adder = "0"
            operator = "+"
            flag = true
        }
        minus.setOnClickListener {
            input = (input.toInt() - adder.toInt()).toString()
            inputText.setText(input)
            adder = "0"
            operator = "-"
            flag = true
        }
        multiply.setOnClickListener {
            input = (input.toInt() * adder.toInt()).toString()
            inputText.setText(input)
            adder = "0"
            operator = "*"
            flag = true
        }
        divide.setOnClickListener {
            input = (input.toInt() / adder.toInt()).toString()
            inputText.setText(input)
            adder = "0"
            operator = "/"
            flag = true
        }
        remainder.setOnClickListener {
            input = (input.toInt() % adder.toInt()).toString()
            inputText.setText(input)
            adder = "0"
            operator = "%"
            flag = true
        }
        decimal.setOnClickListener { // 이건 제가 전부 Int로 만들어버려서 계산하면 오류 떠요~
            if(flag == false)
            {
                input = input + "."
                inputText.setText(input)
            }
            else
            {
                adder = adder + "."
                inputText.setText(adder)
            }
        }
        delete.setOnClickListener {
            if(flag == false) {
                input = input.substring(0, input.length - 1)
                inputText.setText(input)
            }
            else {
                adder = adder.substring(0, adder.length - 1)
                inputText.setText(adder)
            }
        }
        negative.setOnClickListener {

        }

        result.setOnClickListener {
            flag = false
            when(operator) {
                "+" ->
                {
                    var res : Int = 0
                    res = input.toInt() + adder.toInt()
                    input = res.toString()
                    inputText.setText(input)
                    adder = "0"
                    input = "0"
                }
                "-" ->
                {
                    var res : Int = 0
                    res = input.toInt() - adder.toInt()
                    input = res.toString()
                    inputText.setText(input)
                    adder = "0"
                    input = "0"
                }
                "*" ->
                {
                    var res : Int = 0
                    res = input.toInt() * adder.toInt()
                    input = res.toString()
                    inputText.setText(input)
                    adder = "0"
                    input = "0"
                }
                    "/" ->
                {
                    var res : Int = 0
                    res = input.toInt() / adder.toInt()
                    input = res.toString()
                    inputText.setText(input)
                    adder = "0"
                    input = "0"
                }
                "%" ->
                {
                    var res : Int = 0
                    res = input.toInt() % adder.toInt()
                    input = res.toString()
                    inputText.setText(input)
                    adder = "0"
                    input = "0"
                }

            }
        }


    }
}
