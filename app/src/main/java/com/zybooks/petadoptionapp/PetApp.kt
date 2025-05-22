package com.zybooks.petadoptionapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    data object List
    @Serializable
    data object Detail
    @Serializable
    data object Adopt
}

@Composable
fun PetApp(
    petViewModel: PetViewModel = viewModel()
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.List
    ) {
        composable<Routes.List> {
            ListScreen(
                petList = petViewModel.petList,
                onPetClick = { pet ->
                    petViewModel.selectedPet = pet
                    navController.navigate(Routes.Detail)
                },
                createPets = petViewModel::createSamplePets
            )
        }
        composable<Routes.Detail> {
            DetailScreen(
                pet = petViewModel.selectedPet,
                onAdoptClick = {
                    navController.navigate(Routes.Adopt)
                },
                onUpClick = {
                    navController.navigateUp()
                }
            )
        }
        composable<Routes.Adopt> {
            AdoptScreen(
                pet = petViewModel.selectedPet,
                onUpClick = {
                    navController.navigateUp()
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PetAppBar(
    title: String,
    modifier: Modifier = Modifier,
    onCreatePets: ()->Unit = { },
    canNavigateBack: Boolean = false,
    onUpClick: () -> Unit = { }
) {
    TopAppBar(
        title = { Text(title) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = onUpClick) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back")
                }
            }
        },
        actions = {
            IconButton(onClick = onCreatePets) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Create test tasks"
                )
            }
        }
    )
}

@Composable
fun ListScreen(petList: List<Pet>, createPets: ()->Unit, onPetClick: (Pet)->Unit, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            PetAppBar(
                title = "Find a Friend",
                onCreatePets = createPets
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier.padding(innerPadding)
        ) {
            items(petList) { pet ->
                Text(
                    text = pet.name,
                    modifier = Modifier.clickable(
                        onClick = { onPetClick(pet) },
                        onClickLabel = "Select the pet"
                    )
                )
            }
        }
    }
}

@Composable
fun DetailScreen(
    pet: Pet,
    onAdoptClick: () -> Unit,
    modifier: Modifier = Modifier,
    onUpClick: () -> Unit = { }
) {
    Scaffold(
        topBar = {
            PetAppBar(
                title = "Details",
                canNavigateBack = true,
                onUpClick = onUpClick
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = modifier.padding(6.dp)
            ) {
                Text(
                    text = "Name: ${pet.name}",
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "Age: ${pet.age}",
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "Animal: ${pet.animal}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Button(onClick = onAdoptClick) {
                    Text("Adopt Me!")
                }
            }
        }
    }
}

@Composable
fun AdoptScreen(
    pet: Pet,
    modifier: Modifier = Modifier,
    onUpClick: () -> Unit = { }
) {
    Scaffold(
        topBar = {
            PetAppBar(
                title = "Thank You!",
                canNavigateBack = true,
                onUpClick = onUpClick
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
        ) {
            Text(
                text = "Thank you for adopting ${pet.name}!",
                modifier = modifier.padding(horizontal = 28.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "Please pick up your new family member during business hours.",
                modifier = modifier.padding(6.dp),
            )
        }
    }
}
