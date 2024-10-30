package com.abvanpelt.planty.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "plant")
data class PlantEntity(
    @PrimaryKey val id: String,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("wateringSchedule") val wateringSchedule: String,
    @ColumnInfo("fertilizingSchedule") val fertilizingSchedule: String
)