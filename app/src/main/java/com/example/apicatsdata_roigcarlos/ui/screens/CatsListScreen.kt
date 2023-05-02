package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel

@Composable
fun CatsList(catsList: List<CatDetailUIModel>, onMoreDetails: (id: CatDetailUIModel?) -> Unit) {
    // TODO 3. Wrap affirmation card in a lazy column
    LazyColumn{
        items(catsList){cat -> CatsCard(cat, onMoreDetails = onMoreDetails)}
    }
}

@Composable
fun CatsCard(cat: CatDetailUIModel, modifier: Modifier = Modifier, onMoreDetails: (id: CatDetailUIModel?) -> Unit) {
    // TODO 1. Your card UI
    val color by animateColorAsState(targetValue = MaterialTheme.colors.surface)

    Card(
        Modifier
            .padding(15.dp)
            .fillMaxSize()
            .background(
                color = color
            ).clickable(onClick = {onMoreDetails(cat)})
    ) {

        Row {
            AsyncImage(
                model = cat.url,
                contentDescription = "CatImage",
                modifier = Modifier.padding(top = 10.dp),
            )
            cat.name?.let {
                Text(
                    text = it,
                    modifier = Modifier.padding(top = 25.dp, start = 10.dp)
                )
            }
        }
        Column(horizontalAlignment = Alignment.End, modifier = modifier.padding(top = 50.dp)) {
            cat.description?.let {
                Text(
                    text = it,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
            }
        }
    }
}

@Preview
@Composable
private fun CatListPreview(){
 //CatsList(catsList = List(2){CatsDetailUIModel("1","miau",null,null,"MiauMIauMiau",null,"https://s1.ppllstatics.com/lasprovincias/www/multimedia/202112/12/media/cortadas/gatos-kb2-U160232243326NVC-1248x770@Las%20Provincias.jpg")})
}
