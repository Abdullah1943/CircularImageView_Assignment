package com.android.circularimageviewassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.realmadridcf.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val price = intent.getDoubleExtra("price",0.0)
        val number = intent.getIntExtra("quantity",0)
        val img = intent.getIntExtra("image",0)
        val desc = intent.getStringExtra("desc")

        binding.apply {
            PlayerName.text = name
            PlayerPrice.text = price.toString()
            PlayerNum.text = number.toString()
            PlayerImg.setImageResource(img)
            PlayerDesc.text = desc




        }

    }
}