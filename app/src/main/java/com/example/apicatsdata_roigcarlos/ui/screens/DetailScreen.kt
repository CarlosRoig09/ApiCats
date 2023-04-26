package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.apicatsdata_roigcarlos.ui.model.CatsDetailUIModel

@Composable
fun DetailLayout(cat: CatsDetailUIModel)
{
    Column(
        Modifier
            .padding(start = 20.dp)
            .fillMaxSize()
    ) {
        Row(Modifier.padding(top = 50.dp, bottom = 20.dp)) {
            Image(
                painter = rememberAsyncImagePainter(cat.url),
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