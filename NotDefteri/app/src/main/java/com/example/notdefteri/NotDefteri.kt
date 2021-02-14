package com.example.notdefteri

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.notdefteri.databinding.ActivityNotDefteriBinding

class NotDefteri : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityNotDefteriBinding
        binding = ActivityNotDefteriBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
         preferences  = getSharedPreferences("com.example.notdefteri", Context.MODE_PRIVATE)

        binding.chip5.setOnClickListener {
            var newkayder = preferences.getString("gostera0", "")
          var newas = binding.editTextTextMultiLine.text.toString()
            if (newkayder == newas  )
            {
                intent = Intent(applicationContext,NotDefteriOzel::class.java)
                startActivity(intent)
            }

        }

       /* else {
            binding.editTextTextMultiLine.setText("Hata")

       } */

    }
}