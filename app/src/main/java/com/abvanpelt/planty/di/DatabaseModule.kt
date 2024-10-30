package com.abvanpelt.planty.di

import android.content.Context
import androidx.room.Room
import com.abvanpelt.planty.database.PlantDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun providePlantDatabase(@ApplicationContext applicationContext: Context): PlantDatabase {
        return Room.databaseBuilder(
            applicationContext,
            PlantDatabase::class.java, "plant-database"
        ).build()
    }
}