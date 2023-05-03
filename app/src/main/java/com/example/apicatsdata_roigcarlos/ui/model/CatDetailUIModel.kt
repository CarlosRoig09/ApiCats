package com.example.apicatsdata_roigcarlos.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CatDetailUIModel (
    val id : String? = null,
    val name: String? = null,
    val temperament : String? = null,
    val countryCode : String? = null,
    val description : String? = null,
    val wikipedia_url : String? = null,
    val url : String? = null
) : Parcelable