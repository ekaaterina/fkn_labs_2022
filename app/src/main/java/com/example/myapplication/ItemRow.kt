package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemRow(item: ItemRowModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(12.dp)
    ){
        Card (
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = 10.dp
        ) {

            Box(modifier = Modifier.height(500.dp).width(300.dp)){
                Image(
                    painter = painterResource(id = item.imageId),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()

                )
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(10.dp),
                    contentAlignment = Alignment.BottomStart

                ) {
                    Text(text = item.title, style = TextStyle(Color.White, fontSize = 30.sp))

                }

            }


        }

    }
}