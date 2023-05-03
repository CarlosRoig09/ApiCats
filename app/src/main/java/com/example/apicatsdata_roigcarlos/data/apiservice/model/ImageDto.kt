package com.example.apicatsdata_roigcarlos.data.apiservice.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
@Serializable
data class ImageDto(
                      @SerialName("breeds" ) var breeds : List<CatsDto>? = null,
                      @SerialName("id"     ) var id     : String? = null,
                      @SerialName("url"    ) var url    : String? = null,
                      @SerialName("width"  ) var width  : Int?    = null,
                      @SerialName("height" ) var height : Int?    = null,
                    )
