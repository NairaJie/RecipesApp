package com.example.recipesapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 data class Recipe (
     var name : String,
     var description: String,
     var ingradients: String,
     var steps : String,
     var rating: Int,
     var photo: String

 ): Parcelable

