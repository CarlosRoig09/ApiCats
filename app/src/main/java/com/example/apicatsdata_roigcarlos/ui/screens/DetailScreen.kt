package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel

@Composable
fun DetailLayout(cat: CatDetailUIModel)
{
    Column(
        Modifier
            .padding(5.dp)
            .fillMaxSize()
    ) {
        Row(Modifier.padding(top = 50.dp, bottom = 20.dp)) {
            AsyncImage(
                model = cat.url,
                contentDescription = "DetailImage",
                alignment = Alignment.Center
            )
        }
        Row(Modifier.padding(bottom = 10.dp, start = 150.dp)) {
            cat.name?.let {
                Text(
                text = it,
            ) }
        }
        Row(Modifier.padding(bottom = 15.dp)) {
            cat.description?.let {
                Text(
                    text = it,
                    Modifier.padding(bottom = 15.dp)
                )
            }
        }
        Row(Modifier.padding(bottom = 15.dp)) {
            cat.temperament?.let { Text(text = "temperament: $it") }
        }
        Row(Modifier.padding(bottom = 15.dp)) {
            cat.countryCode?.let { Text(text = "country_code: $it") }
        }
        Row(Modifier.padding(bottom = 15.dp)) {
            cat.wikipedia_url?.let {
                Text(
                    text = it,
                    Modifier.padding(bottom = 15.dp)
                )
            }
        }
    }
}