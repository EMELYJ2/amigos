package com.example.semana15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se configura el tiempo que permanecera activa la pantalla

                object: CountDownTimer(4000,1000){
                    override fun onTick(p0: Long) {
                    }
                    override fun onFinish() {
                        val intent=
                            Intent(applicationContext,MainActivity2::class.java)
                        startActivity(intent)
                    }
                }
                    //se inicia el contador para dar paso al MainActivity
                    .start()
    }
}

