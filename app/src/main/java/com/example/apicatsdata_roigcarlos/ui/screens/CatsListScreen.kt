package com.example.apicatsdata_roigcarlos.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apicatsdata_roigcarlos.data.apiservice.model.CatsDto
import com.example.apicatsdata_roigcarlos.ui.model.CatsDetailUIModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun CatsList(catsList: List<CatsDetailUIModel>/*, onMoreDetails: (id: Int) -> Unit*/) {
    // TODO 3. Wrap affirmation card in a lazy column
    LazyColumn{
        items(catsList){cat -> CatsCard(cat/*, onMoreDetails = onMoreDetailsÇ*/)}
    }
}

@Composable
fun CatsCard(cat: CatsDetailUIModel, modifier: Modifier = Modifier,/* onMoreDetails: (id: Int) -> Unit*/) {
    // TODO 1. Your card UI
    val color by animateColorAsState(targetValue = MaterialTheme.colors.surface)
    Card(
        Modifier
            .padding(10.dp)
            .fillMaxSize()
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
            .background(
                color = color
            )
    ) {

        Row {
            Image(
                painter = rememberAsyncImagePainter(cat.url),
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
 CatsList(catsList = List(2){CatsDetailUIModel("1","miau",null,null,"MiauMIauMiau",null,"https://s1.ppllstatics.com/lasprovincias/www/multimedia/202112/12/media/cortadas/gatos-kb2-U160232243326NVC-1248x770@Las%20Provincias.jpg")})
}
