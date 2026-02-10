package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Rr.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
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
                moveTo(23.55f, 8.73f)
                curveToRelative(-0.15f, -0.53f, -0.71f, -0.84f, -1.23f, -0.69f)
                curveToRelative(-0.53f, 0.15f, -0.84f, 0.7f, -0.69f, 1.23f)
                curveToRelative(0.25f, 0.88f, 0.38f, 1.8f, 0.38f, 2.73f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.51f, 2f, 12f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(0.93f, 0f, 1.84f, 0.13f, 2.73f, 0.38f)
                curveToRelative(0.53f, 0.15f, 1.08f, -0.16f, 1.23f, -0.69f)
                reflectiveCurveToRelative(-0.16f, -1.08f, -0.69f, -1.23f)
                curveToRelative(-1.06f, -0.3f, -2.16f, -0.45f, -3.27f, -0.45f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -1.11f, -0.15f, -2.21f, -0.45f, -3.27f)
                close()
                moveTo(11f, 6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _SolarSystem = it}
