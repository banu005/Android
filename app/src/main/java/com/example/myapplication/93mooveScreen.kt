package com.example.myapplication

import android.graphics.Color.blue
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
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
    fun mooveApp() {
//    PageAccueil(
//        modifier = Modifier
//            .fillMaxSize()
//            .wrapContentSize(Alignment.Center)
//    )

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = mooveScreen.Start.name,
        modifier = Modifier
    ) {
        composable(route = mooveScreen.Start.name) {
            PageAccueil(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                navController = navController
            )
        }
        composable(route = mooveScreen.Login.name) {
            FormulaireLogin(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                navController = navController
            )
        }
        composable(route = mooveScreen.AfficherCours.name) {
            ListeCours(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                navController = navController
            )
        }

    }
}

fun ListeCours(modifier: Modifier, navController: NavHostController) {

}

@Composable
fun FormulaireLogin(modifier: Modifier, navController: NavController) {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
//
//    val backgroundColor = if {
//        login.length >= 10 -> Color.Red
//        else -> Color.White
//    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card() {
            TextField(
                label = { Text("Entrez votre login") },
                value = login,
                onValueChange = { login = it },
//              colors = TextFieldDefaults.textFieldColors(containerColor = backgroundColor),
            )
        }
            Card() {
                TextField(
                    label = { Text("Entrez votre mot de passe") },
                    value = password,
                    onValueChange = { password = it }
                )
            }
        }
    }





@Composable
    fun PageAccueil(
        modifier: Modifier = Modifier,
        navController: NavHostController = rememberNavController()
    ) {
        val imageModifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(16.dp))

        val image = painterResource(R.drawable.logo)
        Column(
//            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = image,
                contentDescription = "logo 93Moove",
                modifier = imageModifier,
            )
            Text(
                text = "93 Moove ",
                fontSize = 36.sp,
                lineHeight = 50.sp,
            )
            Text(
                text = "Bienvenue",
                fontSize = 16.sp,
                lineHeight = 36.sp,
            )
            Button(onClick = {navController.navigate(mooveScreen.Login.name){
                popUpTo(mooveScreen.Start.name) { inclusive = false }
            }}) {
                Text("Consulter les cours")
            }

            Button(onClick = {navController.navigate(mooveScreen.Login.name)}) {
                Text("Se connecter")
            }
        }
    }



