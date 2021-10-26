package com.example.recylerviewcartoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<SuperHero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperHero= findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero= findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero= findViewById<TextView>(R.id.tv_item_description)

        imgSuperHero.setImageResource(superhero?.imgSuperHero !!)
        nameSuperhero.text= superhero.nameSuperhero
        descSuperhero.text= superhero.descSuperhero
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
