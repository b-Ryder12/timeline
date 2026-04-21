package com.example.timeline

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.timeline.navigation.AppDestinations
import com.example.timeline.ui.screens.*

@Composable
fun TimelineApp() {

    var currentDestination by rememberSaveable {
        mutableStateOf(AppDestinations.TIMELINE)
    }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach { destination ->
                item(
                    icon = {
                        Icon(
                            painter = painterResource(destination.icon),
                            contentDescription = destination.label
                        )
                    },
                    label = { Text(destination.label) },
                    selected = destination == currentDestination,
                    onClick = { currentDestination = destination }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { padding ->

            when (currentDestination) {
                AppDestinations.TIMELINE -> TimelineScreen(Modifier.padding(padding))
                AppDestinations.PLACES -> PlacesScreen(Modifier.padding(padding))
                AppDestinations.INSIGHTS -> InsightsScreen(Modifier.padding(padding))
                AppDestinations.ACCOUNT -> AccountScreen(Modifier.padding(padding))
            }
        }
    }
}