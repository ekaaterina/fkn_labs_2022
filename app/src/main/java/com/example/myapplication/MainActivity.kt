package com.example.myapplication

import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top


            ) {
                Logotype()
                LazyRow(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    itemsIndexed(
                        listOf(
                            ItemRowModel(R.drawable.deadpool, "Deadpool"),
                            ItemRowModel(R.drawable.ironman, "Iron Man"),
                            ItemRowModel(R.drawable.capitan, "Capitan America"),
                            ItemRowModel(R.drawable.spiderman, "Spider Man"),
                            ItemRowModel(R.drawable.doktor, "Doctor Strange"),
                            ItemRowModel(R.drawable.thor, "Thor"),
                            ItemRowModel(R.drawable.thanos, "Thanos")
                        )
                    ) { _, item ->
                        ItemRow(item = item)
                    }
                }

            }

        }
    }
}
@Composable
fun Logotype(){
    Image(
        painter = painterResource(id = R.drawable.marvel),
        contentDescription = "marvel",
        modifier = Modifier.size(120.dp)
    )
        Text(
            text = "Choose your hero",
            style = TextStyle(fontSize = 35.sp),
            color = Color.White
        )
    }


