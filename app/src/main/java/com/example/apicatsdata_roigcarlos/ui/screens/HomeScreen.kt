package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel


/**
 * The home screen displaying result of fetching photos.
 */
@Composable
fun LogInScreen(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Button(onClick = onClick){
            Text(text = "Log In")
        }
    }
}
