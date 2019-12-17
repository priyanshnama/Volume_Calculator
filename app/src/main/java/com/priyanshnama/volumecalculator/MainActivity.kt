package com.priyanshnama.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun reset(view: View){
        bi.setText("")
        bf.setText("")
        hi.setText("")
        hf.setText("")
        li.setText("")
        lf.setText("")
    }

    fun calculate(view: View){
        try {

            val val_bi :Int
            val s_bi = bi.text.toString()
            if(s_bi.matches("-?\\d+(\\.\\d+)?".toRegex())){
                val_bi = s_bi.toInt()
            }
            else{
                val_bi = 0
            }

            val val_bf :Int
            val s_bf = bf.text.toString()
            if(s_bf.matches("-?\\d+(\\.\\d+)?".toRegex())){
                val_bf = s_bf.toInt()
            }
            else{
                val_bf = 0
            }

            val val_li :Int
            val s_li = li.text.toString()
            if(s_li.matches("-?\\d+(\\.\\d+)?".toRegex())){
                val_li = s_li.toInt()
            }
            else{
                val_li = 0
            }

            val val_lf :Int
            val s_lf = lf.text.toString()
            if(s_lf.matches("-?\\d+(\\.\\d+)?".toRegex())){
                val_lf = s_lf.toInt()
            }
            else{
                val_lf = 0
            }

            val val_hi :Int
            val s_hi = hi.text.toString()
            if(s_hi.matches("-?\\d+(\\.\\d+)?".toRegex())){
                val_hi = s_hi.toInt()
            }
            else{
                val_hi = 0
            }

            val val_hf :Int
            val s_hf = hf.text.toString()
            if(s_hf.matches("-?\\d+(\\.\\d+)?".toRegex())){
                val_hf = s_hf.toInt()
            }
            else{
                val_hf = 0
            }

            val h = 12 * (val_hf) + val_hi
            val l = 12 * (val_lf) + val_li
            val b = 12 * (val_bf) + val_bi

            val v = l * b * h
            val vol: Double
            vol = v / 1728.00

            answer.text = "$vol cu.ft"
        }
        catch(ex:Exception){

        }
    }
}
