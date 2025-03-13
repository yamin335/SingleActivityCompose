package sundori.asif.singleactivitycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import sundori.asif.singleactivitycompose.models.User
import sundori.asif.singleactivitycompose.navigation.AppNavHost
import sundori.asif.singleactivitycompose.ui.theme.SingleActivityComposeTheme
import java.util.UUID

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SingleActivityComposeTheme {
                UserApp()
            }
        }
    }
}

@Composable
fun UserApp() {
    val navController = rememberNavController()
    val users = remember {
        UserData.userList
    }

    AppNavHost(
        users = users,
        navController = navController,
        modifier = Modifier.fillMaxSize(),
        onUserCreated = { user ->
            users.add(user)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SingleActivityComposeTheme {
        UserApp()
    }
}