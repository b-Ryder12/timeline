package com.example.timeline.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccountScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp)) {

        Text(" - 👤 Account - ")

        Spacer(modifier = Modifier.height(8.dp))

        Text("Name: Jean Claude Javert Boisvert")
        Text("Tracking: Enabled")
    }
}