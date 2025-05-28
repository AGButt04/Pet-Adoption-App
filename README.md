🐾 Pet Adoption App (Jetpack Compose)
A simple, clean pet adoption app built with Jetpack Compose and Kotlin.
Navigate through a list of pets, view details, and adopt your new best friend!

🚩 Features
📋 List of pets with clickable items

🐕 Pet detail screen showing name, age, and type

❤️ Adoption confirmation screen

🔄 Navigation using Jetpack Compose Navigation

🧑‍💻 State management with ViewModel and Compose State

🎨 Material3 design components and theming

🏗 Architecture
MainActivity — entry point that sets up theme and PetApp() composable

PetApp() — hosts navigation with sealed class Routes (List, Detail, Adopt)

PetViewModel — holds list of pets and selected pet state

ListScreen — displays pet list and supports creating sample pets

DetailScreen — shows detailed pet info with adoption button

AdoptScreen — thank you screen after adoption

PetAppBar — reusable top app bar with back navigation and add button

