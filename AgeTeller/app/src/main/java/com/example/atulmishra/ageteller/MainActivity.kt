package com.example.atulmishra.ageteller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun agereturn(view:View){
        val yearofdob:Int=editText.text.toString().toInt()
        val currentyear=Calendar.getInstance().get(Calendar.YEAR)
        val total=currentyear - yearofdob
        textView.text= "You are $total years old"

    }
}
