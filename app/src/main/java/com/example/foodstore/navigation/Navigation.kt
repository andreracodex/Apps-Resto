package com.example.foodstore.navigation

import AddReviewScreen
import ReviewsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodstore.models.ReviewViewModel
import com.example.foodstore.view.*

@Composable
fun Navigation() {
    val reviewViewModel = ReviewViewModel()
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }

        composable(Screen.HomeScreen.route) {
            Dashboard(navController = navController)
        }
        composable(Screen.NearMeScreen.route) {
            NearMeScreen(navController = navController)
        }
        composable(Screen.PopularListScreen.route) {
            PopularListScreen(navController = navController)
        }
        composable(Screen.DetailsScreen.route) {
            FoodDetailsScreen(navController = navController)
        }
        composable(Screen.AddToCartScreen.route) {
            CheckoutScreen()
        }
        composable(Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }

        composable(Screen.SearchScreen.route) {
            SearchingScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.ProfileEditScreen.route) {
            ProfileEditScreen(navController = navController)
        }

        // REVIEW
        composable(Screen.AddReviewScreen.route) {
            AddReviewScreen(viewModel = reviewViewModel, navController = navController)
        }
        composable(Screen.ReviewsScreen.route) {
            ReviewsScreen(navController = navController)
        }
        composable(Screen.RestoDetailsScreen.route) {
            RestoDetailsScreen(navController = navController)
        }

        composable(Screen.RestoReviewScreen.route) {
            RestoReviewsScreen(navController = navController)
        }

        composable(Screen.MyRestoReviewScreen.route) {
            FoodReviewScreen(navController = navController)
        }

    }
}