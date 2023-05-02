package com.example.apicatsdata_roigcarlos.ui
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apicatsdata_roigcarlos.R
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel
import com.example.apicatsdata_roigcarlos.ui.screens.CatsList
import com.example.apicatsdata_roigcarlos.ui.screens.CatsViewModel

@Composable
fun CatsDataApp(modifier: Modifier = Modifier,onMoreDetails: (cat: CatDetailUIModel?) -> Unit) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name)) }) }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colors.background
        ) {
            val catsUIModel: CatsViewModel = viewModel()
            CatsList(catsList = catsUIModel.catsUiState, onMoreDetails = onMoreDetails)
           // HomeScreen(catsUIState = catsUIModel.catsUiState)
        }
    }
}
