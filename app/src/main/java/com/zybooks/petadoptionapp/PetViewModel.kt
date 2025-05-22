package com.zybooks.petadoptionapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PetViewModel: ViewModel() {

    val petList = mutableStateListOf<Pet>()

    var selectedPet by mutableStateOf<Pet>(Pet("Spot", "Dog", 1))

    fun createSamplePets() {
        petList.add(Pet("Fido", "Dog", 3))
        petList.add(Pet("Muffin", "Cat", 5))
        petList.add(Pet("Mr. Roundtree", "Cow", 7))
        petList.add(Pet("HopMaster 3000", "Bunny", 2))
    }

}