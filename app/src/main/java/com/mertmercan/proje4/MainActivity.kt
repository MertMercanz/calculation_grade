package com.mertmercan.proje4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertmercan.proje4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val birincivize : Int? = null
    val ikincivize : Int? = null
    val final : Int? = null



    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    //Create Calculation

    }
    fun ortalamaHesaplama(view: View){
        val birincivize = binding.birincisNavtext.text.toString().toIntOrNull()
        val ikincivize = binding.ikincisNavtext.text.toString().toIntOrNull()
        val final = binding.finalText.text.toString().toIntOrNull()

        if (birincivize == null && ikincivize== null && final == null){
            binding.resultText.text = "Error"
        }else{
            val vizeler = ((birincivize!! + ikincivize!!)*30)/100
            val finall = (final!!*40)/100
            val result = vizeler+finall
            if (result>=50){
                binding.resultText.text = "Ortalamanız ${result} , geçtiniz ."
            }else{
                binding.resultText.text = "Ortalamanız ${result} , kaldınız ."
            }
        }

    }
}