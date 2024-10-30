package com.abvanpelt.planty.repository

import com.abvanpelt.planty.datasource.PlantLocalDataSource
import javax.inject.Inject

class PlantRepositoryImpl @Inject constructor(
    private val localDataSource: PlantLocalDataSource
): PlantRepository {
}