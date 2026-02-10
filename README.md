# UXIcons

A comprehensive, beautiful icon library for Kotlin Multiplatform Compose, featuring 40,000+ vector icons across 12 styles: Brand, Bold Rounded, Bold Straight, Regular Chubby, Regular Rounded, Regular Straight, Solid Chubby, Solid Rounded, Solid Straight, Thin Chubby, Thin Rounded, and Thin Straight.

## Features

- 🎨 **Rich Collection**: 40,000+ high-quality vector icons
- 🔧 **Multiplatform**: Works on JVM, Android, iOS, Desktop, and Web
- 📦 **Modular**: Include only the styles you need
- ⚡ **Optimized**: Efficient vector rendering with Compose
- 🎯 **Consistent**: Unified API across all icon styles

## Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    // Include only the styles you need
    implementation("io.github.uxicons:uicons-thin-chubby:1.0.0")
    implementation("io.github.uxicons:uicons-solid-rounded:1.0.0")
    // ... add more as needed
}
```

Available packages:
- `uicons-brand` (221 brand icons)
- `uicons-bold-rounded` (~4,600 icons)
- `uicons-bold-straight` (~4,600 icons)
- `uicons-regular-chubby` (~2,400 icons)
- `uicons-regular-rounded` (~4,600 icons)
- `uicons-regular-straight` (~4,600 icons)
- `uicons-solid-chubby` (~2,400 icons)
- `uicons-solid-rounded` (~4,600 icons)
- `uicons-solid-straight` (~4,600 icons)
- `uicons-thin-chubby` (~2,400 icons)
- `uicons-thin-rounded` (~4,500 icons)
- `uicons-thin-straight` (~4,500 icons)

## Usage

Import the icons and use them in your Compose UI:

```kotlin
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.thin.chubby.*

@Composable
fun MyIcon() {
    // Use thin chubby style
    Icon(
        imageVector = Icons.Tc.Add,  // Tc for Thin Chubby
        contentDescription = "Add",
        tint = Color.Blue
    )
}
```

### Icon Styles and Prefixes

Each style has a unique prefix for its icons:

- **Brand**: `Icons.Brand.*`
- **Bold Rounded**: `Icons.Br.*`
- **Bold Straight**: `Icons.Bs.*`
- **Regular Chubby**: `Icons.Rc.*`
- **Regular Rounded**: `Icons.Rr.*`
- **Regular Straight**: `Icons.Rs.*`
- **Solid Chubby**: `Icons.Sc.*`
- **Solid Rounded**: `Icons.Sr.*`
- **Solid Straight**: `Icons.Ss.*`
- **Thin Chubby**: `Icons.Tc.*`
- **Thin Rounded**: `Icons.Tr.*`
- **Thin Straight**: `Icons.Ts.*`

## Size Optimization

The library is optimized for size, but here are additional tips:

### 1. Include Only Needed Packages

Don't add all packages—only include the styles you use:

```kotlin
// Good: Only what you need
implementation("io.github.uxicons:uicons-thin-chubby:1.0.0")

// Avoid: Including everything
// implementation("io.github.uxicons:uicons-*")  // Not supported
```

### 2. Enable ProGuard/R8 Minification

Add these rules to your `proguard-rules.pro`:

```
# UXIcons ProGuard Rules
-keep class com.uxicons.compose.uicons.** { *; }
-dontwarn com.uxicons.compose.uicons.**
-keep class androidx.compose.ui.graphics.vector.** { *; }
-keep class androidx.compose.ui.graphics.** { *; }

# Keep icon classes
-keep class ** extends androidx.compose.ui.graphics.vector.ImageVector { *; }

# Remove unused icons (tree shaking)
-keep class com.uxicons.compose.uicons.Icons { *; }
-keep class com.uxicons.compose.uicons.Icons$* { *; }
```

In your `build.gradle.kts`:

```kotlin
android {
    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
```

### 3. Use Compose Compiler Optimizations

In `gradle.properties`:

```
android.enableR8.fullMode=true
kotlin.compiler.execution.strategy=in-process
kotlin.daemon.jvmargs=-Xmx4g -XX:+UseParallelGC
```

## Examples

### Basic Usage

```kotlin
@Composable
fun IconExamples() {
    Row {
        Icon(Icons.Tc.Heart, "Heart", tint = Color.Red)
        Icon(Icons.Sr.Star, "Star", tint = Color.Yellow)
        Icon(Icons.Brand.Github, "GitHub", tint = Color.Black)
    }
}
```

### Custom Styling

```kotlin
@Composable
fun CustomIcon() {
    Icon(
        imageVector = Icons.Tr.User,
        contentDescription = "User",
        modifier = Modifier.size(48.dp),
        tint = MaterialTheme.colors.primary
    )
}
```

### Conditional Icons

```kotlin
@Composable
fun StatusIcon(isOnline: Boolean) {
    val icon = if (isOnline) Icons.Ss.Wifi else Icons.Ss.WifiSlash
    Icon(icon, "WiFi Status")
}
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

Creative Commons Attribution 4.0 International (CC BY 4.0) - see the [LICENSE](LICENSE) file for details.

## Repository

[GitHub Repository](https://github.com/uxicons/compose-uicons)
