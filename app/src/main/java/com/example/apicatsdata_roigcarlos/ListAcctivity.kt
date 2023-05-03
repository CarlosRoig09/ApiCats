package com.example.apicatsdata_roigcarlos

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apicatsdata_roigcarlos.ui.CatsDataApp
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel
import com.example.apicatsdata_roigcarlos.ui.screens.CatsViewModel
import com.example.apicatsdata_roigcarlos.ui.screens.DetailCatViewModel
import com.example.apicatsdata_roigcarlos.ui.screens.DetailLayout

class ListAcctivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val catsViewModel: CatsViewModel = viewModel()
            catsViewModel.orderCatsPhotosByAlphabet()
            CatsDataApp(modifier = Modifier,onMoreDetails = {startDetailActivity(it)},catsViewModel.catsUiState)
        }
    }
    private fun startDetailActivity(cat : CatDetailUIModel?){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("cat", cat)
        startActivity(intent)
    }
}