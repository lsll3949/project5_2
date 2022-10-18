package com.example.project5_2

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.view.View

import android.widget.Button

import android.widget.EditText

import android.widget.TextView

import android.widget.Toast



class MainActivity : AppCompatActivity() {



    lateinit var edit1 : EditText

    lateinit var edit2 : EditText

    lateinit var btnAdd : Button

    lateinit var btnSub : Button

    lateinit var btnMul : Button

    lateinit var btnDiv : Button


    lateinit var textResult : TextView

    lateinit var num1 : String

    lateinit var num2 : String

    var result : Double? = null // 실수값으로 계산



    public override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        title = "테이블레이아옷 계산기"



        edit1 = findViewById<EditText>(R.id.Edit1)

        edit2 = findViewById<EditText>(R.id.Edit2)



        btnAdd = findViewById<Button>(R.id.BtnAdd)

        btnSub = findViewById<Button>(R.id.BtnSub)

        btnMul = findViewById<Button>(R.id.BtnMul)

        btnDiv = findViewById<Button>(R.id.BtnDiv)





        textResult = findViewById<TextView>(R.id.TextResult)



        btnAdd.setOnClickListener {

            num1 = edit1.text.toString()

            num2 = edit2.text.toString()

            // num1이나 num2가 비어 있다면

            if (num1.trim() == "" || num2.trim() == "") {

                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)

                    .show()

            } else {

                result = num1.toDouble() + num2.toDouble()

                textResult.text = "계산 결과 : " + result.toString()

            }

        }



        btnSub.setOnClickListener {

            num1 = edit1.text.toString()

            num2 = edit2.text.toString()


            // num1이나 num2가 비어 있다면

            if (num1.trim() == "" || num2.trim() == "") {

                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)

                    .show()

            } else {

                result = num1.toDouble() - num2.toDouble()

                textResult.text = "계산 결과 : " + result.toString()

            }

        }



        btnMul.setOnClickListener {

            num1 = edit1.text.toString()

            num2 = edit2.text.toString()

            // num1이나 num2가 비어 있다면

            if (num1.trim() == "" || num2.trim() == "") {

                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)

                    .show()

            } else {

                result = num1.toDouble() * num2.toDouble()

                textResult.text = "계산 결과 : " + result.toString()

            }

        }



        btnDiv.setOnClickListener {

            num1 = edit1.text.toString()

            num2 = edit2.text.toString()

            // num1이나 num2가 비어 있다면

            if (num1.trim() == "" || num2.trim() == "") {

                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)

                    .show()

            } else {

                // num2가 0이면 나누지 않는다.

                if (num2.trim() == "0") {

                    Toast.makeText(
                        applicationContext,

                        "0으로 나누면 안됩니다!", Toast.LENGTH_SHORT
                    ).show()

                } else {

                    result = num1.toDouble() / num2.toDouble()

                    result =
                        (result!! * 10).toInt() / 10.0 // 소수점 아래 1자리까지만 출력. result!!는 result가 널이 아님을 명시.

                    textResult.text = "계산 결과 : " + result.toString()

                }

            }

        }
    }}