package com.example.apicatsdata_roigcarlos.ui.model.mapper

import com.example.apicatsdata_roigcarlos.data.apiservice.model.CatsDto
import com.example.apicatsdata_roigcarlos.data.apiservice.model.ImageDto
import com.example.apicatsdata_roigcarlos.ui.model.CatsDetailUIModel

class CatsDtoUiModelMapper {
    fun map(listCatsdto:List<CatsDto>, listImageDto: List<List<ImageDto>>) : List<CatsDetailUIModel>{
        return  mutableListOf<CatsDetailUIModel>().apply {
            listCatsdto.zip(listImageDto).forEach{
                add(CatsDetailUIModel(it.first.id,it.first.name,it.first.temperament,it.first.countryCode,it.first.description,it.first.wikipediaUrl,it.second[0].url))
            }
        }
    }
}