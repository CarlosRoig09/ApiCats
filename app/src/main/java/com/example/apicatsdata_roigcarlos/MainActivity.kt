package com.example.apicatsdata_roigcarlos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.apicatsdata_roigcarlos.ui.screens.LogInScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent{

            LogInScreen(onClick = {startListActivity(it)})
            }
        }
    private fun startListActivity(username : List<String>){
        var count = 0
        username.forEach {
            if (it.isNotEmpty()) {
                count+=1
            }
        }
        if(count>=2) {
            startActivity(Intent(this, ListAcctivity::class.java))
        }
    }
}