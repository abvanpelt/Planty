package com.abvanpelt.planty.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.abvanpelt.planty.ui.theme.PlantyTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    onFabClick: () -> Unit
) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(
            text = "Your garden awaits.",
            modifier = modifier.align(Alignment.Center)
        )

        FloatingActionButton(
            onClick = onFabClick,
            modifier = Modifier.align(Alignment.BottomEnd).padding(32.dp)
        ) {
            Icon(Icons.Filled.Add, "Add Plant")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PlantyTheme {
        HomeScreen {}
    }
}