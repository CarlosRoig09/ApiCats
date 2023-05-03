package com.example.apicatsdata_roigcarlos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apicatsdata_roigcarlos.ui.CatsDataApp
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel
import com.example.apicatsdata_roigcarlos.ui.screens.CatsViewModel
import com.example.apicatsdata_roigcarlos.ui.screens.LogInScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent{
            LogInScreen(onClick = {startListActivity()})
            }
        }
    private fun startListActivity(){
        startActivity(Intent(this, ListAcctivity::class.java))
    }
}