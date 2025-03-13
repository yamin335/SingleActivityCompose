package sundori.asif.singleactivitycompose

import androidx.compose.runtime.mutableStateListOf
import sundori.asif.singleactivitycompose.models.User
import java.util.UUID

object UserData {
    val userList = mutableStateListOf(
        User(
            UUID.randomUUID().toString(),
            "John Doe",
            "john@example.com",
            "123 Main St"
        ),
        User(
            UUID.randomUUID().toString(),
            "Jane Smith",
            "jane@example.com",
            "456 Oak Ave"
        ),
        User(
            UUID.randomUUID().toString(),
            "Alice Johnson",
            "alice@example.com",
            "789 Pine Rd"
        ),
        User(
            UUID.randomUUID().toString(),
            "Bob Brown",
            "bob@example.com",
            "321 Maple Dr"
        ),
        User(
            UUID.randomUUID().toString(),
            "Charlie White",
            "charlie@example.com",
            "654 Cedar St"
        ),
        User(
            UUID.randomUUID().toString(),
            "Daisy Blue",
            "daisy@example.com",
            "987 Elm St"
        ),
        User(
            UUID.randomUUID().toString(),
            "Eve Black",
            "eve@example.com",
            "159 Spruce Ln"
        ),
        User(
            UUID.randomUUID().toString(),
            "Frank Green",
            "frank@example.com",
            "753 Birch Rd"
        ),
        User(
            UUID.randomUUID().toString(),
            "Grace Red",
            "grace@example.com",
            "852 Walnut St"
        ),
        User(
            UUID.randomUUID().toString(),
            "Hank Yellow",
            "hank@example.com",
            "951 Chestnut St"
        )
    )
}