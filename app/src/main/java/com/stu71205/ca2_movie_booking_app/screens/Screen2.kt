package com.stu71205.ca2_movie_booking_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.stu71205.ca2_movie_booking_app.R
import com.stu71205.ca2_movie_booking_app.content_parts.PartBottomBar
import com.stu71205.ca2_movie_booking_app.content_parts.PartWithDescription
import com.stu71205.ca2_movie_booking_app.content_parts.PartWithImage
import com.stu71205.ca2_movie_booking_app.content_parts.SeatSelection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen2(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(text = "DUNE: PART TWO")
                }
            )
        },
        bottomBar = {
            BottomAppBar (
                containerColor = Color.Gray,
                contentColor = Color.White,
            ){
                PartBottomBar(navController)
            }
        },
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            PartWithImage(
                painter = painterResource(id = R.drawable.movie_dunetrailer),
            )

            PartWithDescription(
                textDescription = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against the conspirators who destroyed his family.",
                textStarring = "Timothée Chalamet, Florence Pugh, Zendaya , Souheila Yacoub, Austin Butler\n" +
                "Run Time 2hr 46mins",
                textTitle = "DUNE: PART TWO",
                classifiedImage = painterResource(id = R.drawable.age_12)
            )

            SeatSelection()
        }
    }
}
