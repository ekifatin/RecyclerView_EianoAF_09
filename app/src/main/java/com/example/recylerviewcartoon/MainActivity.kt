package com.example.recylerviewcartoon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE= "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist= listOf<SuperHero>(
            SuperHero(
                R.drawable.marco,
                nameSuperhero = "Marco Diaz",
                descSuperhero = "Karakter utama laki- laki"
            ),
            SuperHero(
                R.drawable.star,
                nameSuperhero = "Star Butterfly",
                descSuperhero = "Karakter heroine perempuan"
            ),
            SuperHero(
                R.drawable.pony,
                nameSuperhero = "Pony Head",
                descSuperhero = "Teman perempuan karakter heroine"
            ),
            SuperHero(
                R.drawable.moon,
                nameSuperhero = "Moon Butterfly",
                descSuperhero = "Ibu dari karakter heroine"
            ),
            SuperHero(
                R.drawable.janna,
                nameSuperhero = "Janna",
                descSuperhero = "Teman perempuan karakter utama"
            ),
            SuperHero(
                R.drawable.glossryck,
                nameSuperhero = "Glossaryck",
                descSuperhero = "Pembantu karakter heroine"
            ),
            SuperHero(
                R.drawable.jackie,
                nameSuperhero = "Jackie Lynn Thomas",
                descSuperhero = "Teman perempuan karakter utama"
            ),
            SuperHero(
                R.drawable.hekapoo,
                nameSuperhero = "Hekapoo",
                descSuperhero = "Teman perempuan karakter utama dari dimensi lain"
            ),
            SuperHero(
                R.drawable.toffee,
                nameSuperhero = "Toffee",
                descSuperhero = "Musuh"
            ),
            SuperHero(
                R.drawable.ludo,
                nameSuperhero = "Ludo",
                descSuperhero = "Musuh bebuyutan karakter heroine"
            )
        )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}