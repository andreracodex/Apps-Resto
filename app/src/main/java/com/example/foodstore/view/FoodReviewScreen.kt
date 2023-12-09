package com.example.foodstore.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.foodstore.component.TopAppBarWithBack
import com.example.foodstore.navigation.Screen
import com.example.foodstore.ui.theme.*
import com.example.foodstore.R

@Composable
fun FoodReviewScreen(navController: NavController) {
    val pageCount by remember { mutableStateOf(0) }
    Scaffold(topBar = {

        TopAppBarWithBack(
            onBackClick = {
                navController.popBackStack()
                navController.navigate(Screen.HomeScreen.route)
            },
        )
        Column {
            Row() {
                Text(
                    text = "My Food Reviews",
                    fontSize = 20.sp,
                    color = black,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(70.dp,25.dp)
                )
            }
        }


    }, backgroundColor = bgwhitelight,
        content = { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
            ) {

                ConstraintLayout {

                    val (addtocartref) = createRefs()

                    Surface(color = ghost_white,
                        shape = RoundedCornerShape(40.dp)
                            .copy(
                                bottomStart = ZeroCornerSize,
                                bottomEnd = ZeroCornerSize
                            ), modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp)
                            .constrainAs(addtocartref) {
                                bottom.linkTo(parent.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp)
                        ) {
                            MinumanReviews()
                            Spacer(modifier = Modifier.padding(20.dp))
                            MakananReviews()
                            Spacer(modifier = Modifier.padding(20.dp))
//                            RestoAddToCartButton(navController)
                        }

                    }

                }
            }
        }
    )
}

@Preview
@Composable
fun FoodReviewScreenPreview() = FoodReviewScreen(NavController(LocalContext.current))

@Preview
@Composable
fun MakananReviews() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Makanan Reviews :",
            fontSize = 20.sp,
            color = black,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Divider()
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp))
                    .background(white)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {

                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(R.drawable.roasted),
                            contentDescription = "",
                        )
                        Column {
                            Row(){
                                Text(
                                    text = "Ayam Keprabon",
                                    fontSize = 20.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                            Row(){
                                Text(
                                    text = "Resto : Ayam Keprabon - GWALK",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                            Row(){
                                Text(
                                    text = "Rp 50.000,00",
                                    fontSize = 14.sp,
                                    color = colorPrimary,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                    }

                    Row(){
                        Column() {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Rating : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = dark_gray,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                            }
                            Row(){
                                Text(
                                    text = "Comment : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Ayam yang dimasak dengan smokey charcoal, enak bikin nagih guys",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp))
                    .background(white)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {

                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(R.drawable.keprabon),
                            contentDescription = "",
                        )
                        Column {
                            Row(){
                                Text(
                                    text = "Ayam Lunak",
                                    fontSize = 20.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                            Row(){
                                Text(
                                    text = "Resto : Ayam Lunak - GWALK",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                            Row(){
                                Text(
                                    text = "Rp 55.000,00",
                                    fontSize = 14.sp,
                                    color = colorPrimary,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                    }

                    Row(){
                        Column() {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Rating : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                            }
                            Row(){
                                Text(
                                    text = "Comment : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Ayam yang dimasak dengan smokey charcoal, enak bikin nagih guys",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                    }
                }

            }
        }

    }
}

@Preview
@Composable
fun MinumanReviews() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Minuman Reviews :",
            fontSize = 20.sp,
            color = black,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Divider()
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp))
                    .background(white)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {

                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(R.drawable.blue_ocean),
                            contentDescription = "",
                        )
                        Column {
                            Row(){
                                Text(
                                    text = "Blue Ocean",
                                    fontSize = 20.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                            Row(){
                                Text(
                                    text = "Resto : Ayam Keprabon - GWALK",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                            Row(){
                                Text(
                                    text = "Rp 25.000,00",
                                    fontSize = 14.sp,
                                    color = colorPrimary,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                    }

                    Row(){
                        Column() {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Rating : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = dark_gray,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                            }
                            Row(){
                                Text(
                                    text = "Comment : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Blue Ocean minuman enak dengan warna biru muda, enak bikin nagih guys",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(16.dp))
                    .background(white)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {

                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(R.drawable.orange_ocean),
                            contentDescription = "",
                        )
                        Column {
                            Row(){
                                Text(
                                    text = "Orange Squash",
                                    fontSize = 20.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                            Row(){
                                Text(
                                    text = "Resto : Ayam Lunak - GWALK",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                            Row(){
                                Text(
                                    text = "Rp 22.000,00",
                                    fontSize = 14.sp,
                                    color = colorPrimary,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                    }

                    Row(){
                        Column() {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Rating : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = colorPrimary,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                                Icon(imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = dark_gray,
                                    modifier = Modifier
                                        .size(20.dp, 20.dp))
                            }
                            Row(){
                                Text(
                                    text = "Comment : ",
                                    fontSize = 16.sp,
                                    color = black,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Orange squash dengan rasa jeruk segar, enak bikin nagih guys",
                                    fontSize = 14.sp,
                                    color = black,
                                    fontWeight = FontWeight.Light
                                )
                            }
                        }
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(10.dp))

    }
}