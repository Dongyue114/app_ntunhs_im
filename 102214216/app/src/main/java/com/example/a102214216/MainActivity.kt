package com.example.a102214216

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView3)
        val resulttextView = findViewById<TextView>(R.id.textView2)
        val guess_button =findViewById<Button>(R.id.guess_button)
        val reset_button =findViewById<Button>(R.id.reset_button)
        val editText = findViewById<TextView>(R.id.editText)
        var validation_num :Int

        val secret : Int = Random.nextInt(10)+1

        guess_button.setOnClickListener {
           // textView.text = editText.text
            validation_num =editText.text.toString().toInt()-secret
            var ans_str:String="你猜對瞜!"

            if(validation_num>0){
                ans_str="你猜的比較大"
            }else if (validation_num<0){
                ans_str="你猜得太小了"
            }
            textView.text=ans_str
        }
    }
}