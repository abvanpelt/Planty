package com.abvanpelt.planty.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abvanpelt.planty.ui.theme.PlantyTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Your garden awaits.",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PlantyTheme {
        HomeScreen()
    }
}