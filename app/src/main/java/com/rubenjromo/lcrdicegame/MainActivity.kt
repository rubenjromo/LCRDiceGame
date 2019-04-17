package com.rubenjromo.lcrdicegame

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener(
            rollDice()
        )
    }

    fun rollDice(){
        val randomInt = Random().nextInt(6) + 1
        result_text.text = "Number: $randomInt !"
    }


}