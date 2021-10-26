package com.example.recylerviewcartoon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(private val context: Context, private val superhero: List <SuperHero>, val listener:(SuperHero)-> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.SuperHeroViewHolder>()
{
    class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSuperHero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: SuperHero, listener: (SuperHero) -> Unit) {
            imgSuperHero.setImageResource(superhero.imgSuperHero)
            nameSuperhero.text= superhero.nameSuperhero
            descSuperhero.text= superhero.descSuperhero
            itemView.setOnClickListener {
                listener(superhero)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroAdapter.SuperHeroViewHolder {
        return SuperheroAdapter.SuperHeroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroAdapter.SuperHeroViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size

}