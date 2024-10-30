package com.abvanpelt.planty.ui.add

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abvanpelt.planty.ui.theme.PlantyTheme

@Composable
fun AddPlantScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp)
    ) {
        Text(
            text = "Add a plant.",
            modifier = Modifier.padding(vertical = 16.dp)
        )

        var plantName by remember { mutableStateOf("") }
        TextField(
            value = plantName,
            onValueChange = { plantName = it },
            modifier = Modifier.padding(vertical = 16.dp).fillMaxWidth(),
            label = { Text("Plant Name") }
        )

        var plantWatering by remember { mutableStateOf("") }
        TextField(
            value = plantWatering,
            onValueChange = { plantWatering = it },
            modifier = Modifier.padding(vertical = 16.dp).fillMaxWidth(),
            label = { Text("Watering Schedule") }
        )

        var plantFertilizing by remember { mutableStateOf("") }
        TextField(
            value = plantFertilizing,
            onValueChange = { plantFertilizing = it },
            modifier = Modifier.padding(vertical = 16.dp).fillMaxWidth(),
            label = { Text("Fertilizing Schedule") }
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            Text(text = "Save",)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddPlantScreenPreview() {
    PlantyTheme {
        AddPlantScreen()
    }
}