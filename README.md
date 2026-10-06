# ProfileLayout

A simple Jetpack Compose Profile Screen created to learn Android UI layouts, reusable components, and basic Compose concepts.

## Technologies Used

- Kotlin
- Jetpack Compose
- Material 3
- Android Studio

## Concepts Covered

- Column
- Row
- Box
- Modifier
- Spacer
- Alignment
- Arrangement
- Reusable Composable Functions
- Passing data to Composable functions
- Button click handling
- Local image resources
- Drawable resources

## Project Structure

```text
ProfileLayout
│
├── app
│   └── src
│       └── main
│           ├── java
│           │   └── com.example.composeprofile
│           │       ├── MainActivity.kt
│           │       │
│           │       ├── screens
│           │       │   └── ProfileScreen.kt
│           │       │
│           │       └── components
│           │           ├── ProfileImage.kt
│           │           ├── ProfileStat.kt
│           │           └── ProfileButton.kt
│           │
│           └── res
│               └── drawable
│                   └── profile.jpg
│
├── .gitignore
├── build.gradle.kts
└── README.md