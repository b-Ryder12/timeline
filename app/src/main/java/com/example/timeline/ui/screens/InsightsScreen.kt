package com.example.timeline.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InsightsScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp)) {

        Text(" - 📊 Insights - ")

        Spacer(modifier = Modifier.height(8.dp))

        Text("• Most visited: Home")
        Text("• Avg travel time: 42 min")
        Text("• Walking: 65%")

        Spacer(modifier = Modifier.height(16.dp))

        Text("Lorem ipsum dolor sit amet.")
    }
}