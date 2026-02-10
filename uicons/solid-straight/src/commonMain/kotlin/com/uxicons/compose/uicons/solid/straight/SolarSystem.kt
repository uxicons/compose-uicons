package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Ss.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(1.68f, 0f, 3.28f, 0.35f, 4.73f, 0.98f)
                curveToRelative(-0.56f, 0.44f, -1.01f, 0.99f, -1.31f, 1.64f)
                curveToRelative(-1.07f, -0.39f, -2.22f, -0.62f, -3.43f, -0.62f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -1.21f, -0.23f, -2.36f, -0.62f, -3.43f)
                curveToRelative(0.65f, -0.3f, 1.2f, -0.75f, 1.64f, -1.31f)
                curveToRelative(0.63f, 1.45f, 0.98f, 3.05f, 0.98f, 4.73f)
                close()
                moveTo(10f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(19.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(10.76f, 5.12f)
                curveToRelative(0.53f, 0.51f, 0.92f, 1.16f, 1.1f, 1.9f)
                curveToRelative(0.05f, -0.0f, 0.09f, -0.01f, 0.14f, -0.01f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.05f, 0.01f, -0.09f, 0.01f, -0.14f)
                curveToRelative(-0.73f, -0.19f, -1.39f, -0.57f, -1.9f, -1.1f)
                curveToRelative(-0.07f, 0.4f, -0.12f, 0.82f, -0.12f, 1.24f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                curveToRelative(-0.42f, 0f, -0.84f, 0.04f, -1.24f, 0.12f)
                close()
            }
        }.also { _SolarSystem = it}
