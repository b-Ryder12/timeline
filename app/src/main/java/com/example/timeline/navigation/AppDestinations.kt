package com.example.timeline.navigation

import com.example.timeline.R

enum class AppDestinations(
    val label: String,
    val icon: Int,
) {
    TIMELINE("Timeline", R.drawable.ic_home),
    PLACES("Places", R.drawable.ic_home),
    INSIGHTS("Insights", R.drawable.ic_home),
    ACCOUNT("Account", R.drawable.ic_account_box),
}