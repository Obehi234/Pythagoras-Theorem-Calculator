package com.example.pythagorastheoremcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var sideAText: EditText
    private lateinit var sideBText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sideAText = findViewById(R.id.sideA)
        sideBText = findViewById(R.id.sideB)
        val resultButton: Button = findViewById(R.id.calculateButton)
        resultButton.setOnClickListener { shareResult() }
    }

    fun calculateResult(sideAText: Double, sideBText: Double): Double {
        val sideA = sideAText.toString().toDouble()
        val sideB = sideBText.toString().toDouble()

        return sqrt(sideA.pow(2.0) + sideB.pow(2.0))
    }

    private fun shareResult() {
        val sideCResult = calculateResult(sideAText.toString().toDouble(), sideBText.toString().toDouble())

        val sideCText = findViewById<TextView>(R.id.result)
        val resultText = String.format("%.2f", sideCResult)

        sideCText.text = resultText
    }
}