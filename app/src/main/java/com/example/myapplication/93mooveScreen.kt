package com.example.myapplication

import android.R.attr.offset
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.CoursViewModel
import com.example.myapplication.ui.PokeViewModel



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
            val coursViewModel: CoursViewModel= viewModel()
            ListeCours(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                coursViewModel,
                navController = navController
            )
//            ListePokemon(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .wrapContentSize(Alignment.Center),
////pokeViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
//                navController = navController
//            )
        }
    }
}
//            ListeCours(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .wrapContentSize(Alignment.Center),
//                Datasource.retourneListeCours(),
//                navController=navController
//            )
//
//        }




//@Composable
//fun ListePokemon(
//    modifier: Modifier = Modifier,
//    pokeViewModel: PokeViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
//    navController: NavHostController = rememberNavController()
//){
//    val listePokemon by pokeViewModel.pokeUi.collectAsState()
//    Column(
//        modifier = modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text(text = "Liste des Pokémon", modifier = Modifier.align(Alignment.CenterHorizontally))
//        LazyColumn {
//            items(listePokemon.size) { index ->
//                val pokemon = listePokemon[index]
//                Text(text = "${pokemon.name}")
//            }
//        }
//    }
//}



//@Composable
//fun ListeCours(
//    modifier: Modifier,
//    listeCours: List<CoursUiState>, navController: NavHostController) {
//    LazyColumn(modifier = modifier.fillMaxSize()) {
//        items(listeCours.size) { index -> val cours = listeCours[index]
//            Text(text = cours.nom)
//            Text(text = cours.description)
//        }
//    }
//}

    @Composable
    fun ListeCours(
        modifier: Modifier = Modifier,
        coursViewModel: CoursViewModel,
//        coursViewModel: CoursViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
        navController: NavHostController = rememberNavController()
    ){
        val listeCours by coursViewModel.coursUi.collectAsState()
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Liste des cours", modifier = Modifier.align(Alignment.CenterHorizontally),
                lineHeight =30.sp, fontSize = 26.sp)
            LazyColumn {
                items(listeCours.size) { index ->
                    val cours = listeCours[index]
                    Text(text = "${cours.nom}")
                    Text(text = "${cours.description}")
                }
            }
        }
    }

@Composable
fun FormulaireLogin(modifier: Modifier, navController: NavController) {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

//    val backgroundColor = if {
//        login.length >= 10 -> Color.Red
//        else -> Color.White
//    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
          text = "Login",
            fontSize = 36.sp,
            lineHeight = 50.sp,
        )
        Card() {
            TextField(
                label = { Text("Entrez votre login") },
                value = login,
                onValueChange = { login = it },
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
            .size(500.dp)
            .clip(RoundedCornerShape(46.dp))

        val image = painterResource(R.drawable.logo)
        val Blue500 = Color( 0xff2196f3)
        val offset = Offset(5.0f, 10.0f)

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
//                color = Color.Blue,
                style = TextStyle(
                fontSize = 36.sp, lineHeight = 15.sp,
                shadow = Shadow(
                    color = Blue500, offset = offset, blurRadius = 1f))
            )
            Text(
                text = "Bienvenue",
                fontSize = 20.sp,
                lineHeight = 50.sp,
                //mettre en italique
                fontStyle = FontStyle.Italic,
            )
            Button(onClick = {navController.navigate(mooveScreen.AfficherCours.name){
                popUpTo(mooveScreen.Start.name) { inclusive = false }
            }}) {
                Text("Consulter les cours")
            }
            Button(onClick = {navController.navigate(mooveScreen.Login.name) {
                popUpTo(mooveScreen.Start.name) { inclusive = false }
            }}) {
                Text("Se connecter")
            }
        }
    }




