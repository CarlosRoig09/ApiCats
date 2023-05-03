package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailCatViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(CatDetailUIModel())
    val uiState : StateFlow<CatDetailUIModel> get() = _uiState.asStateFlow()
    fun setCatDescription(cat : CatDetailUIModel){
        _uiState.value = cat
    }
}