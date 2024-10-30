package com.abvanpelt.planty.ui.home

import androidx.lifecycle.ViewModel
import com.abvanpelt.planty.repository.PlantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val plantRepository: PlantRepository
): ViewModel() {
}