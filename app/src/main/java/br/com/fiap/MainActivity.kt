package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        androidButton()
        iosButton()
    }

    fun androidButton(){
        binding.androidButton.setOnClickListener{
            binding.choose.text = "Android"
        }
    }

    fun iosButton(){
        binding.iosButton.setOnClickListener{
            binding.choose.text = "IOS"
        }
    }
}