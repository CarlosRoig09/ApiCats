package com.example.apicatsdata_roigcarlos.ui.model.mapper

import com.example.apicatsdata_roigcarlos.data.apiservice.CatsApi
import com.example.apicatsdata_roigcarlos.data.apiservice.model.CatsDto
import com.example.apicatsdata_roigcarlos.data.apiservice.model.ImageDto
import com.example.apicatsdata_roigcarlos.ui.model.CatsUIModel

class CatsDtoUiModelMapper {
    fun map(listCatsdto:List<CatsDto>, listImageDto: List<ImageDto>) : List<CatsUIModel>{
        return  mutableListOf<CatsUIModel>().apply {
            listCatsdto.zip(listImageDto).forEach{
                add(CatsUIModel(it.first.id,it.first.name,it.first.temperament,it.first.countryCode,it.first.description,it.first.wikipediaUrl,it.second.url))
            }
        }
    }
}