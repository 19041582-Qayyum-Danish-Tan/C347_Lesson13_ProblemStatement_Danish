package sg.edu.rp.webservices.c347_lesson13_problemstatement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var newOperator = true
    var dot = false

    fun btnOnClick(view: View) {
        if (newOperator) {
            tvResult.setText("")
        }
        newOperator = false
        val buSelect = view as Button
        var showValue: String = tvResult.text.toString()

        when (buSelect.id) {
            btn0.id -> {
                showValue += "0"
            }
            btn1.id -> {
                showValue += "1"
            }
            btn2.id -> {
                showValue += "2"
            }
            btn3.id -> {
                showValue += "3"
            }
            btn4.id -> {
                showValue += "4"
            }
            btn5.id -> {
                showValue += "5"
            }
            btn6.id -> {
                showValue += "6"
            }
            btn7.id -> {
                showValue += "7"
            }
            btn8.id -> {
                showValue += "8"
            }
            btn9.id -> {
                showValue += "9"
            }
            btnDot.id -> {
                if (dot == false) {
                    showValue += "."
                    dot = true
                }

            }

        }
        tvResult.setText(showValue)
    }

    var operator = "X"
    var oldNum = ""

    fun btnOnClickOperator(view: View) {
        val buSelect = view as Button
        when (buSelect.id) {
            btnTimes.id -> {
                operator = "X"
            }
            btnDivide.id -> {
                operator = "÷"
            }
            btnMinus.id -> {
                operator = "-"
            }
            btnPlus.id -> {
                operator = "+"
            }
        }
        oldNum = tvResult.text.toString()
        newOperator = true
        dot = false
    }

    fun btnOnClickEqual(view: View) {
        val newNum = tvResult.text.toString()
        var theResultValue: Double? = null
        when (operator) {
            "X" -> {
                theResultValue = oldNum.toDouble() * newNum.toDouble()
            }
            "÷" -> {
                theResultValue = oldNum.toDouble() / newNum.toDouble()
            }
            "-" -> {
                theResultValue = oldNum.toDouble() - newNum.toDouble()
            }
            "+" -> {
                theResultValue = oldNum.toDouble() + newNum.toDouble()
            }
        }
        tvResult.setText(theResultValue.toString())
        newOperator = true
    }

    fun btnOnClickAC(view: View) {
        tvResult.setText("")
        newOperator = true
        dot = false
    }
}