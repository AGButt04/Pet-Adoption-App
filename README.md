# 🐾 Pet Adoption App

A modern Android application built with Jetpack Compose for browsing and adopting pets. Features a clean three-screen navigation flow with pet listings, detailed information, and adoption confirmation.

## 🎯 What I Built
- **Pet Browser**: Scrollable list of available pets with tap-to-select functionality
- **Detailed Pet View**: Comprehensive pet information display with adoption option
- **Adoption Flow**: Complete adoption process with confirmation screen
- **Dynamic Pet Creation**: Generate sample pet data with a single tap
- **Navigation System**: Seamless three-screen workflow with proper back navigation
- **Clean UI Design**: Modern Material 3 interface with intuitive user interactions

## ✨ Key Features
- 🐕 **Pet Listings**: Lazy-loaded scrollable list of available pets for adoption
- 📱 **Three-Screen Flow**: List → Details → Adoption confirmation workflow
- 🔍 **Pet Details**: Display pet name, age, and animal type information
- ❤️ **Adoption Process**: Simple "Adopt Me!" button with thank you confirmation
- ➕ **Sample Data Generation**: Create test pets with floating action button
- 🧭 **Intuitive Navigation**: Proper back button handling and screen transitions
- 🎨 **Material 3 Design**: Clean, modern interface following Google's design system

## 🏗️ App Architecture
```
Android App Components:
├── MainActivity.kt        # Main activity and app entry point
├── PetViewModel.kt        # State management and pet data handling
├── Navigation System      # Type-safe routing between three screens
├── ListScreen.kt          # Pet browsing interface with lazy column
├── DetailScreen.kt        # Individual pet information display
├── AdoptScreen.kt         # Adoption confirmation and thank you screen
└── Pet Data Class         # Pet model with name, age, and animal type
```

## 🎮 User Workflow
- **Browse**: View scrollable list of available pets
- **Select**: Tap on any pet to view detailed information
- **Learn**: Review pet's name, age, and animal type
- **Adopt**: Tap "Adopt Me!" to begin adoption process
- **Confirm**: Receive thank you message with pickup instructions

## 🔧 Technical Implementation
- **Jetpack Compose**: Fully declarative UI with reusable composable functions
- **LazyColumn**: Efficient scrolling lists for pet browsing
- **State Management**: ViewModel pattern for pet data and selection state
- **Navigation Compose**: Type-safe navigation with sealed class routes
- **Material 3**: Latest Material Design components and theming system
- **Event Handling**: Clickable modifiers and button interactions
- **Dynamic Data**: Runtime pet creation and list management

## 📖 Learning Outcomes
This project demonstrates core Android development skills:
- **Jetpack Compose Fundamentals**: Building interactive UIs with modern declarative approach
- **Navigation Patterns**: Implementing multi-screen workflows with proper state management
- **List Management**: Efficient rendering of dynamic content with LazyColumn
- **State Architecture**: Using ViewModels for data persistence across navigation
- **User Experience Design**: Creating intuitive flows for common app interactions
- **Material Design Implementation**: Following Google's design guidelines for Android apps
- **Event-Driven Programming**: Handling user interactions and screen transitions

## 🐱 App Features Highlights
- **Simple Adoption Flow**: Streamlined three-step process from browsing to adoption
- **Responsive Design**: Smooth scrolling and navigation between screens
- **User-Friendly Interface**: Clear typography and intuitive button placement
- **Practical Functionality**: Real-world pet adoption app workflow simulation

---
**Part of my Android development portfolio** | [Github Profile](https://github.com/AGButt04) | [LinkedIn](https://www.linkedin.com/in/abdul-ghani-butt-290056338/)

