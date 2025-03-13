package sundori.asif.singleactivitycompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import sundori.asif.singleactivitycompose.models.User
import sundori.asif.singleactivitycompose.ui.screens.CreateUserScreen
import sundori.asif.singleactivitycompose.ui.screens.UserDetailsScreen
import sundori.asif.singleactivitycompose.ui.screens.UserListScreen

@Composable
fun AppNavHost(
    users: List<User>,
    navController: NavHostController,
    modifier: Modifier = Modifier,
    onUserCreated: (User) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = UserList.route,
        modifier = modifier
    ) {
        composable(route = UserList.route) {
            UserListScreen(
                users = users,
                showDetails = { user ->
                    navController.navigate("${UserDetails.route}/${user.id}")
                },
                createNewUser = {
                    navController.navigate(NewUser.route)
                }
            )
        }
        composable(
            route = UserDetails.routeWithArgs,
            arguments = UserDetails.arguments
        ) { backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userId")
            val user = users.find { it.id == userId }
            if (user != null) {
                UserDetailsScreen(
                    user = user,
                    onClickBackStack = {
                        navController.popBackStack()
                    }
                )
            }
        }
        composable(route = NewUser.route) {
            CreateUserScreen(
                onUserCreated = { newUser ->
                    onUserCreated(newUser)
                    navController.popBackStack()
                },
                onClickBackStack = {
                    navController.popBackStack()
                }
            )
        }
    }
}