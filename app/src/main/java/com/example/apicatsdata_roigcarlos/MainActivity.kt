package com.example.apicatsdata_roigcarlos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import com.example.apicatsdata_roigcarlos.ui.CatsDataApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent{
            CatsDataApp(modifier = Modifier)
        }
    }
}