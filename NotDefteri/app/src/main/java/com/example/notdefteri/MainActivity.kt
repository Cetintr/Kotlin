package com.example.notdefteri

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.notdefteri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
    }
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
       // Şimdi İlk Olarak onBackPressed Komutu yazdım geri tuşna basınca geri sayfaya yönlendiriyordu şimdi olmuyor
        // binding komutunu yazdım'ki xml dosyalarını çekebiliyim.
        setContentView(view)
        var veri = this.getSharedPreferences("com.example.notdefteri", Context.MODE_PRIVATE)
        // veri adında getSharedPreferences oluştudum veri tabanı
        var deger = "hayır"
        // deger adında hayır degişkeni oluşturdum .



        binding.tm.setOnClickListener {
          // id'si tm olan tıklandıgında bu kod bulogu çalışacak
            if (deger=="hayır")
            {
                deger="evet"
                veri.edit().putString("degerler",deger).apply()

            }
            // burda deger eger hayır eşit ise onu evet de ve onu veritabanına kaydet


            var kaydet = binding.goster0.text.toString()
           veri.edit().putString("gostera0",kaydet).apply()
            //burda main sayfadaki id'si goster0 olan kaydet degişkeni at ve veri.edit ile veri tabanına kaydet

            intent = Intent(applicationContext,NotDefteri::class.java)
            startActivity(intent)
            // burda sayfa yönlendirmesi var
        }
        var new = veri.getString("degerler","")
       if (new=="evet")
       {
           intent = Intent(applicationContext,NotDefteri::class.java)
           startActivity(intent)
       }
        binding.button13.setOnClickListener {

        binding.goster0.setText(" ")



        }


        }
    fun btntik(view : View){

        var btnsec = view as Button
        var btntikd:String = binding.goster0.text.toString()
        when(btnsec.id){
            binding.btn0.id->{
                btntikd+="0"
            }
            binding.btn1.id->{
                btntikd+="1"
            }
            binding.btn2.id->{
                btntikd+="2"
            }
            binding.btn3.id->{
                btntikd+="3"
            }
            binding.btn4.id->{
                btntikd+="4"
            }
            binding.btn5.id->{
                btntikd+="5"
            }
            binding.btn6.id->{
                btntikd+="6"
            }
            binding.btn7.id->{
                btntikd+="7"
            }
            binding.btn8.id->{
                btntikd+="8"
            }
            binding.btn9.id->{
                btntikd+="9"
            }


        }
        binding.goster0.setText(btntikd)

    }
}