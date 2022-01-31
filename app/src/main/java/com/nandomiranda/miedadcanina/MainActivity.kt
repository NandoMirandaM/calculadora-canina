package com.nandomiranda.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.nandomiranda.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edadEdit = binding.edadId
        val resultText = binding.resultId
//        val button = binding.boton

        /*val edadEdit :EditText = findViewById(R.id.edad_id)
        val resultText = findViewById<TextView>(R.id.result_id)
        val button :Button = findViewById<Button>(R.id.boton)*/

        Log.d("MainActivity", "Activity Created")

        val button= binding.boton.setOnClickListener {
            val edadString = edadEdit.text.toString()
            if(edadString.isNotEmpty())
            {
                val edadInt = edadString.toInt()
                val result = edadInt * 7
                resultText.text = getString(R.string.text_result, result)
            }else{
                Log.e("MainActivity", "no ingreso datos en el editText")
                Toast.makeText(this, R.string.you_age, Toast.LENGTH_SHORT).show()
            }

        }

    }
}