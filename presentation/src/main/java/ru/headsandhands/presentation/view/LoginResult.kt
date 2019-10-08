package ru.headsandhands.presentation.view

import ru.headsandhands.presentation.view.LoggedInUserView

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)
