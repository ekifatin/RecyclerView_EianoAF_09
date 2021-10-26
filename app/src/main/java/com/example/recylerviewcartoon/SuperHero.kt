package com.example.recylerviewcartoon

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SuperHero(
    val imgSuperHero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable
