package sundori.asif.singleactivitycompose.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

/**
 * Contract for information needed on every navigation destination
 */
sealed interface NavDestination {
    val route: String
}

/**
 * Navigation destinations
 */
data object UserList : NavDestination {
    override val route = "user_list"
}

data object UserDetails : NavDestination {
    override val route = "user_details"
    const val argUserId = "userId"
    val routeWithArgs = "$route/{$argUserId}"
    val arguments = listOf(
        navArgument(argUserId) { type = NavType.StringType }
    )
}

data object NewUser : NavDestination {
    override val route = "new_user"
}