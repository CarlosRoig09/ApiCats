package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apicatsdata_roigcarlos.data.apiservice.CatsApi
import com.example.apicatsdata_roigcarlos.ui.model.CatsDetailUIModel
import com.example.apicatsdata_roigcarlos.ui.model.mapper.CatsDtoUiModelMapper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CatsViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(CatsDetailUIModel())
    val uiState : StateFlow<CatsDetailUIModel> get() = _uiState.asStateFlow()
     var catsUiState: List<CatsDetailUIModel> by mutableStateOf(emptyList())
        private set
    private var  mapper = CatsDtoUiModelMapper()

    init {
        getCatsPhotos()
    }

    private fun getCatsPhotos() {

        viewModelScope.launch {
            val cats = CatsApi.retrofitService.getCats(15)
            val photos = cats.map { CatsApi.retrofitService.getCatPhoto(it.id,1) }
           catsUiState = mapper.map(cats, photos)
        }
    }
    fun orderCatsPhotosByAlphabet(){
        val sortedAlphabetCat = catsUiState.sortedBy { it.name}
        catsUiState = sortedAlphabetCat
    }
}