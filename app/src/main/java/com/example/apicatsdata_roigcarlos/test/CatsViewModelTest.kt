package com.example.apicatsdata_roigcarlos.test
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apicatsdata_roigcarlos.ui.screens.CatsViewModel
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test
class CatsViewModelTest {
    private val viewModel = CatsViewModel()
    @Test
    fun detailViewModelTest_IfDefaultListIsEmpty(){
        assertTrue(viewModel.catsUiState.isEmpty())
    }
    @Test
    fun detailViewModelTest_IfisOrderebByAlphabet(){
        viewModel.getCatsPhotos()
        viewModel.orderCatsPhotosByAlphabet()
    }
}