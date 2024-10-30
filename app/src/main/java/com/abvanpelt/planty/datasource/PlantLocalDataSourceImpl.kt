package com.abvanpelt.planty.datasource

import com.abvanpelt.planty.database.PlantDatabase
import javax.inject.Inject

class PlantLocalDataSourceImpl @Inject constructor(
    private val database: PlantDatabase
): PlantLocalDataSource {


}