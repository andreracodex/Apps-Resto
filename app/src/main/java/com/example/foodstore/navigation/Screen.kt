package com.example.foodstore.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object LoginScreen : Screen("login_screen")
    object RegisterScreen : Screen("register_screen")
    object HomeScreen : Screen("home_screen")
    object SearchScreen : Screen("search_screen")
    object PopularListScreen : Screen("popular_list_screen")
    object NearMeScreen : Screen("near_me_screen")
    object DetailsScreen : Screen("details_screen")
    object AddToCartScreen : Screen("add_to_cart_screen")
    object ProfileScreen : Screen("profile_screen")
    object ProfileEditScreen : Screen("profile_edit_screen")
    object AddReviewScreen : Screen("add_review_screen")
    object ReviewsScreen : Screen("reviews_screen")
    object RestoDetailsScreen : Screen("resto_details_screen")
    object RestoReviewScreen : Screen("resto_review_screen")
    object MyRestoReviewScreen : Screen("my_resto_review_screen")

}
