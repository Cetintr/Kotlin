package com.example.notdefteri

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notdefteri.databinding.ActivityNotDefteriOzelBinding

class NotDefteriOzel : AppCompatActivity() {
    lateinit var binding: ActivityNotDefteriOzelBinding
    lateinit var preferences: SharedPreferences
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {


    }
    override fun onCreate(savedInstanceState: Bundle?) {
     binding = ActivityNotDefteriOzelBinding.inflate(layoutInflater)
  val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
        preferences = getSharedPreferences("com.example.notdefteri", Context.MODE_PRIVATE)
        var deger = "hayır"
        var veri = this.getSharedPreferences("ozel", Context.MODE_PRIVATE)
        binding.chip6.setOnClickListener {



    preferences.edit().putString("degerler","").clear().apply()

            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)

        }
        binding.chip05.setOnClickListener {
          var kaydet =  binding.editTextTextMultiLin0e.text.toString()
            veri.edit().putString("new",kaydet).apply()


        }
        if (true)
        {
         var newas =   veri.getString("new","")
        binding.editTextTextMultiLin0e.setText(newas)
        }


    }
}
