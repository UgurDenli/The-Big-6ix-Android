package com.thebig6ix.app.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel(),
    onSignInClicked: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.login_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        // Foreground Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Big 6 Predictions",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontFamily = IronManFontFamily
                )
            )
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = { onSignInClicked() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google Icon"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Sign in with Google")
            }
        }
    }
}
