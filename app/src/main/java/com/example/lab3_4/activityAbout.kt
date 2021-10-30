package com.example.lab3_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_4.databinding.ActivityAboutBinding

class activityAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

}