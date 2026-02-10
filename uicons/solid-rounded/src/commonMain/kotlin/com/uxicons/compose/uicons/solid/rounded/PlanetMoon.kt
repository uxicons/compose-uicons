package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Sr.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                reflectiveCurveTo(0f, 19.29f, 0f, 13.5f)
                reflectiveCurveTo(4.71f, 3f, 10.5f, 3f)
                reflectiveCurveToRelative(10.5f, 4.71f, 10.5f, 10.5f)
                close()
                moveTo(14.54f, 13.03f)
                lineToRelative(-3.05f, -1.73f)
                curveToRelative(-0.32f, -0.2f, -0.69f, -0.3f, -1.06f, -0.3f)
                horizontalLineToRelative(-1.54f)
                curveToRelative(-0.25f, 0f, -0.49f, -0.1f, -0.67f, -0.28f)
                lineToRelative(-0.56f, -0.56f)
                curveToRelative(-0.37f, -0.37f, -0.37f, -0.96f, 0f, -1.33f)
                lineToRelative(0.35f, -0.35f)
                curveToRelative(0.29f, -0.29f, 0.72f, -0.36f, 1.09f, -0.18f)
                lineToRelative(0.79f, 0.39f)
                curveToRelative(0.36f, 0.18f, 0.8f, 0.11f, 1.09f, -0.18f)
                curveToRelative(0.31f, -0.31f, 0.36f, -0.78f, 0.14f, -1.15f)
                lineToRelative(-0.82f, -1.37f)
                curveToRelative(-0.18f, -0.31f, -0.18f, -0.69f, 0.02f, -0.99f)
                curveToRelative(0.0f, -0.0f, 0.0f, -0.0f, 0.0f, -0.01f)
                curveToRelative(-3.28f, 0.07f, -6.11f, 2.01f, -7.47f, 4.79f)
                lineToRelative(0.85f, 0.9f)
                curveToRelative(0.19f, 0.2f, 0.45f, 0.31f, 0.72f, 0.31f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.25f, 0f, 0.49f, 0.1f, 0.67f, 0.28f)
                lineToRelative(0.45f, 0.45f)
                curveToRelative(0.18f, 0.18f, 0.28f, 0.42f, 0.28f, 0.67f)
                verticalLineToRelative(0.78f)
                curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(1.14f, 1.14f)
                curveToRelative(0.18f, 0.18f, 0.28f, 0.42f, 0.28f, 0.67f)
                verticalLineToRelative(1.48f)
                curveToRelative(0f, 0.62f, 0.51f, 1.13f, 1.13f, 1.13f)
                horizontalLineToRelative(0.49f)
                curveToRelative(0.41f, 0f, 0.79f, -0.23f, 0.99f, -0.59f)
                lineToRelative(2.25f, -4.13f)
                curveToRelative(0.24f, -0.44f, 0.1f, -0.98f, -0.33f, -1.25f)
                close()
            }
        }.also { _PlanetMoon = it}
