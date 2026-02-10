package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Bs.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                curveToRelative(0f, -1.68f, -0.35f, -3.28f, -0.97f, -4.74f)
                curveToRelative(-0.64f, 0.81f, -1.54f, 1.41f, -2.59f, 1.64f)
                curveToRelative(0.36f, 0.97f, 0.56f, 2.01f, 0.56f, 3.1f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                curveToRelative(1.09f, 0f, 2.13f, 0.2f, 3.1f, 0.56f)
                curveToRelative(0.22f, -1.05f, 0.82f, -1.95f, 1.64f, -2.59f)
                curveToRelative(-1.45f, -0.62f, -3.05f, -0.97f, -4.74f, -0.97f)
                horizontalLineToRelative(0f)
                close()
                moveTo(19.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(0f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-0.42f, 0f, -0.84f, 0.04f, -1.24f, 0.12f)
                curveToRelative(0.76f, 0.73f, 1.24f, 1.75f, 1.24f, 2.88f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(-1.14f, 0f, -2.15f, -0.48f, -2.88f, -1.24f)
                curveToRelative(-0.07f, 0.4f, -0.12f, 0.82f, -0.12f, 1.24f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                reflectiveCurveToRelative(-3.13f, -7f, -7f, -7f)
                horizontalLineToRelative(0f)
                close()
                moveTo(8f, 6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(0f)
                close()
                moveTo(12f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _SolarSystem = it}
