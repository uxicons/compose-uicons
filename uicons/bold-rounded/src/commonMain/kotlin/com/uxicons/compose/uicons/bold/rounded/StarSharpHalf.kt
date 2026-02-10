package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Br.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.44f, 0.38f)
            curveToRelative(-0.36f, -0.28f, -0.82f, -0.39f, -1.27f, -0.29f)
            curveToRelative(-1.24f, 0.28f, -2.23f, 1.19f, -2.62f, 2.43f)
            lineToRelative(-1.14f, 3.57f)
            horizontalLineToRelative(-3.77f)
            curveToRelative(-1.6f, 0f, -2.95f, 0.98f, -3.45f, 2.5f)
            curveToRelative(-0.5f, 1.52f, 0.02f, 3.11f, 1.31f, 4.05f)
            lineToRelative(3.08f, 2.25f)
            lineToRelative(-1.17f, 3.62f)
            curveToRelative(-0.49f, 1.53f, 0.03f, 3.12f, 1.33f, 4.06f)
            curveToRelative(0.64f, 0.46f, 1.38f, 0.69f, 2.12f, 0.69f)
            curveToRelative(0.75f, 0f, 1.51f, -0.24f, 2.15f, -0.71f)
            lineToRelative(3.39f, -2.49f)
            curveToRelative(0.39f, -0.28f, 0.61f, -0.73f, 0.61f, -1.21f)
            lineTo(13.0f, 1.55f)
            curveToRelative(0f, -0.46f, -0.21f, -0.89f, -0.56f, -1.17f)
            close()
            moveTo(10f, 18.09f)
            lineToRelative(-2.78f, 2.04f)
            curveToRelative(-0.23f, 0.17f, -0.51f, 0.17f, -0.74f, 0.0f)
            curveToRelative(-0.24f, -0.18f, -0.32f, -0.41f, -0.23f, -0.7f)
            lineToRelative(1.5f, -4.65f)
            curveToRelative(0.2f, -0.62f, -0.02f, -1.29f, -0.54f, -1.67f)
            lineToRelative(-3.96f, -2.89f)
            curveToRelative(-0.24f, -0.18f, -0.32f, -0.41f, -0.23f, -0.7f)
            curveToRelative(0.09f, -0.29f, 0.29f, -0.43f, 0.59f, -0.43f)
            horizontalLineToRelative(4.87f)
            curveToRelative(0.65f, 0f, 1.23f, -0.42f, 1.43f, -1.04f)
            lineToRelative(0.07f, -0.23f)
            verticalLineToRelative(10.27f)
            close()
        }
    }.also { _StarSharpHalf = it }
