package com.abvanpelt.planty.di

import com.abvanpelt.planty.datasource.PlantLocalDataSource
import com.abvanpelt.planty.datasource.PlantLocalDataSourceImpl
import com.abvanpelt.planty.repository.PlantRepository
import com.abvanpelt.planty.repository.PlantRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindPlantLocalDataSource(
        plantLocalDataSourceImpl: PlantLocalDataSourceImpl
    ): PlantLocalDataSource

    @Binds
    abstract fun bindPlantRepository(
        plantRepositoryImpl: PlantRepositoryImpl
    ): PlantRepository
}