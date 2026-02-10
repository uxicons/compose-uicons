package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Br.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 4.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(8f, 10f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            close()
            moveTo(13.5f, 12f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(23.78f, 9.72f)
            curveToRelative(-0.16f, -0.81f, -0.95f, -1.35f, -1.76f, -1.19f)
            curveToRelative(-0.81f, 0.16f, -1.35f, 0.94f, -1.19f, 1.76f)
            curveToRelative(0.11f, 0.56f, 0.16f, 1.14f, 0.16f, 1.72f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            reflectiveCurveTo(3f, 16.96f, 3f, 12f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            curveToRelative(0.58f, 0f, 1.15f, 0.06f, 1.72f, 0.16f)
            curveToRelative(0.8f, 0.16f, 1.6f, -0.37f, 1.76f, -1.19f)
            curveToRelative(0.16f, -0.81f, -0.38f, -1.6f, -1.19f, -1.76f)
            curveToRelative(-0.75f, -0.14f, -1.52f, -0.22f, -2.28f, -0.22f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            curveToRelative(0f, -0.77f, -0.07f, -1.54f, -0.22f, -2.28f)
            close()
            moveTo(12.06f, 6.3f)
            curveToRelative(-0.23f, 0.8f, 0.24f, 1.63f, 1.03f, 1.85f)
            curveToRelative(1.71f, 0.48f, 2.91f, 2.07f, 2.91f, 3.85f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-1.78f, 0f, -3.37f, -1.2f, -3.85f, -2.91f)
            curveToRelative(-0.23f, -0.8f, -1.06f, -1.26f, -1.85f, -1.03f)
            curveToRelative(-0.8f, 0.23f, -1.26f, 1.05f, -1.03f, 1.85f)
            curveToRelative(0.85f, 3.0f, 3.62f, 5.09f, 6.74f, 5.09f)
            curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
            curveToRelative(0f, -3.12f, -2.09f, -5.89f, -5.09f, -6.74f)
            curveToRelative(-0.79f, -0.23f, -1.63f, 0.24f, -1.85f, 1.03f)
            close()
        }
    }.also { _SolarSystem = it }
