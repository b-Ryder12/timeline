package com.example.timeline.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TimelineScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp)) {

        Text(" - 📍 Timeline - ")

        Spacer(modifier = Modifier.height(24.dp))

        Text("🗺️ [Map]")
        Text("Route: Home → Uni → Café → Home")

        Spacer(modifier = Modifier.height(32.dp))

        Text("🕒 Timeline")
        Text("08:30 — Left home")
        Text("Bus - 10 minutes")
        Text("09:10 — Arrived at Reutlingen University")
        Text("Walking - 2 minutes")
        Text("12:45 — Lunch at café")
        Text("Walking - 2 minutes")
        Text("14:00 — Went to Lidl")
        Text("Bus - 12 minutes")
        Text("17:30 — Back home")
    }
}