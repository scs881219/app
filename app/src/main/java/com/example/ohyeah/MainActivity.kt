package com.example.ohyeah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)
    }

    private fun rollDice(){
        //Toast.makeText(context:this, text:"button clicked", Toast.LENGHT_SHORT).show()
        // chaining roll
        val diceImage: ImageView = findViewById(R.id.dice_image)

        val randomInt = (1..6).random()

        val drawableResourse = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResourse)
    }
}