package com.example.apicatsdata_roigcarlos

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel
import com.example.apicatsdata_roigcarlos.ui.screens.DetailCatViewModel
import com.example.apicatsdata_roigcarlos.ui.screens.DetailLayout

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cat = intent.getParcelableExtra("cat") as CatDetailUIModel?
        setContent {
            val detailViewModel: DetailCatViewModel = viewModel()
            if(cat!=null) {
                detailViewModel.setCatDescription(cat)
            }
            val detailUiState by detailViewModel.uiState.collectAsState()
            DetailLayout(
                cat  = detailUiState)
        }
    }

}