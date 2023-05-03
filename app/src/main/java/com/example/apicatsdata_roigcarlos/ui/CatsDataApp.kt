package com.example.apicatsdata_roigcarlos.ui
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apicatsdata_roigcarlos.R
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel
import com.example.apicatsdata_roigcarlos.ui.screens.CatsList
import com.example.apicatsdata_roigcarlos.ui.screens.CatsViewModel

@Composable
fun CatsDataApp(modifier: Modifier = Modifier,onMoreDetails: (cat: CatDetailUIModel?) -> Unit, catsUIModel: List<CatDetailUIModel>) {
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
            CatsList(catsList = catsUIModel, onMoreDetails = onMoreDetails)
           // HomeScreen(catsUIState = catsUIModel.catsUiState)
        }
    }
}
@Composable
fun Load(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            modifier = Modifier.size(150.dp))
    }
}
