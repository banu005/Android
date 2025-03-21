package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
    fun mooveApp() {
    PageAccueil(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

    @Composable
    fun PageAccueil(modifier: Modifier = Modifier) {
//        Text("hello")
        val imageModifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(16.dp))

        val image = painterResource(R.drawable.logo)
        Column(
            verticalArrangement = Arrangement.Center,
        )
        {
            Image(
                painter = image,
                contentDescription = "logo 93Moove",
                modifier = imageModifier
            )
            Text(
                text = "93 Moove " +
                        "Bienvenue",
                fontSize = 36.sp,
                lineHeight = 116.sp,
            )
            Button(onClick = {}) {
                Text("Consulter les cours")
            }

            Button(onClick = {}) {
                Text("Se connecter")
            }
        }
    }

