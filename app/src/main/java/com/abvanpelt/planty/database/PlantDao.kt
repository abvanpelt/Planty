package com.abvanpelt.planty.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PlantDao {

    @Query("SELECT * FROM plant")
    fun getAll(): List<PlantEntity>

    @Insert
    fun insert(plant: PlantEntity)
}