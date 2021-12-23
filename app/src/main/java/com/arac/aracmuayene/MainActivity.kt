package com.arac.aracmuayene

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arac.aracmuayene.view.CarListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buton.setOnClickListener {
            val intent = Intent(this, CarListActivity::class.java)
            startActivity(intent)
        }
    }
}