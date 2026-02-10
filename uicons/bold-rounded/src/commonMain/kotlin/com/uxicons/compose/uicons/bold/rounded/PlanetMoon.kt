package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Br.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.5f, 3f)
            curveTo(4.71f, 3f, 0f, 7.71f, 0f, 13.5f)
            reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
            reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
            reflectiveCurveTo(16.29f, 3f, 10.5f, 3f)
            close()
            moveTo(10.5f, 21f)
            curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
            curveToRelative(0f, -1.04f, 0.21f, -2.03f, 0.59f, -2.93f)
            lineToRelative(0.03f, 0.04f)
            curveToRelative(0.24f, 0.25f, 0.57f, 0.39f, 0.91f, 0.39f)
            horizontalLineToRelative(1.94f)
            curveToRelative(0.33f, 0f, 0.65f, 0.13f, 0.89f, 0.37f)
            lineToRelative(0.27f, 0.27f)
            curveToRelative(0.23f, 0.23f, 0.37f, 0.56f, 0.37f, 0.89f)
            verticalLineToRelative(0.96f)
            curveToRelative(0f, 0.33f, 0.13f, 0.65f, 0.37f, 0.89f)
            lineToRelative(1.26f, 1.26f)
            curveToRelative(0.23f, 0.23f, 0.37f, 0.56f, 0.37f, 0.89f)
            verticalLineToRelative(1.23f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            curveToRelative(0.46f, 0f, 0.88f, -0.25f, 1.1f, -0.65f)
            lineToRelative(2.08f, -3.81f)
            curveToRelative(0.32f, -0.58f, 0.13f, -1.31f, -0.44f, -1.67f)
            lineToRelative(-2.53f, -1.58f)
            curveToRelative(-0.3f, -0.19f, -0.65f, -0.29f, -1.01f, -0.29f)
            horizontalLineToRelative(-1.39f)
            curveToRelative(-0.36f, 0f, -0.71f, -0.14f, -0.96f, -0.4f)
            lineToRelative(-0.43f, -0.43f)
            curveToRelative(-0.37f, -0.37f, -0.37f, -0.96f, 0f, -1.33f)
            lineToRelative(0.35f, -0.35f)
            curveToRelative(0.29f, -0.29f, 0.72f, -0.36f, 1.09f, -0.18f)
            lineToRelative(0.79f, 0.39f)
            curveToRelative(0.36f, 0.18f, 0.8f, 0.11f, 1.09f, -0.18f)
            curveToRelative(0.31f, -0.31f, 0.36f, -0.78f, 0.14f, -1.15f)
            lineToRelative(-0.82f, -1.37f)
            curveToRelative(0.07f, -0.0f, 0.13f, -0.0f, 0.2f, -0.0f)
            curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
            reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(24f, 2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.also { _PlanetMoon = it }
