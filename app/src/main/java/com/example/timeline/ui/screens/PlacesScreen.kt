package com.example.timeline.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlacesScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp)) {

        Text(" - 🏠 Places - ")

        Spacer(modifier = Modifier.height(8.dp))

        Text("• Home")
        Text("• Reutlingen University")
        Text("• Café")
        Text("• Penny")
        Text("• Lidl")
        Text("• Aldi")

        Spacer(modifier = Modifier.height(16.dp))

        Text("🗺️ [Map showing all places]")

        Spacer(modifier = Modifier.height(16.dp))

        Text("Lorem ipsum dolor sit amet.")
    }
}