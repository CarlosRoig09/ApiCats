package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel

@Composable
fun HomeScreen(
    catsUIState: List<CatDetailUIModel>,
    modifier: Modifier = Modifier
) {
    ResultScreen(catsUIState, modifier)
}

/**
 * The home screen displaying result of fetching photos.
 */
@Composable
fun ResultScreen(catDetailUIModel: List<CatDetailUIModel>, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text("Success: ${catDetailUIModel.size} Cats photos retrieved")
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
        ResultScreen(listOf(CatDetailUIModel(url = "A.", id = "11233"),CatDetailUIModel(url = "A.", id = "11233")))

}
