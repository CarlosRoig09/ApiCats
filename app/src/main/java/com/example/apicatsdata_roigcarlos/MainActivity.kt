package com.example.apicatsdata_roigcarlos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import com.example.apicatsdata_roigcarlos.ui.CatsDataApp
import com.example.apicatsdata_roigcarlos.ui.model.CatDetailUIModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent{
            CatsDataApp(modifier = Modifier,onMoreDetails = {startDetailActivity(it)})
        }
    }
    private fun startDetailActivity(cat : CatDetailUIModel?){
        val intent = Intent(this, DetailActivity::class.java)
        //intent.putExtra("cat", cat)
        startActivity(intent)
    }
}