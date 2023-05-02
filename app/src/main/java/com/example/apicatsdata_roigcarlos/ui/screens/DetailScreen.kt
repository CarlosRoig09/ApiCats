package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel

@Composable
fun DetailLayout(cat: CatDetailUIModel)
{
    Column(
        Modifier
            .padding(start = 20.dp)
            .fillMaxSize()
    ) {
        Row(Modifier.padding(top = 50.dp, bottom = 20.dp)) {
            AsyncImage(
                model = cat.url,
                contentDescription = "DetailImage",
                alignment = Alignment.Center
            )
                Text(text = cat.name.toString())
            Row(Modifier.padding(bottom = 15.dp)) {
                Text(
                    text = cat.description.toString(),
                    Modifier.padding(bottom = 15.dp)
                )
            }
        }
    }
}