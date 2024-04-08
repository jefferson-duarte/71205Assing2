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
fun Screen5(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(text = "MONKEY MAN")
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
                painter = painterResource(id = R.drawable.movie_mkm),
            )

            PartWithDescription(
                classifiedImage = painterResource(id = R.drawable.age_16),
                textTitle = "MONKEY MAN",
                textStarring = "Sharlto Copley, Dev Patel, Sobhita Dhulipala, Ashwini Kalsekar, Adithi Kalkunte, Sikandar Kher, Pitobash, Vipin Sharma, Makarand Deshpande\n" +
                        "Run Time 2hr 1min",
                textDescription = "Oscar® nominee Dev Patel (Lion, Slumdog Millionaire) achieves an astonishing, tour-de-force feature directing debut with an action thriller about one man’s quest."
            )

            SeatSelection()
        }
    }
}