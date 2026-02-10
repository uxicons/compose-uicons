package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassNorth: ImageVector? = null

val Icons.Ts.CompassNorth: ImageVector
    get() = _CompassNorth ?: UXIcon(name = "CompassNorth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12f, 5.03f)
                lineTo(6.23f, 14.68f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.27f, 0.47f, -0.27f, 1.03f, -0.01f, 1.51f)
                curveToRelative(0.29f, 0.52f, 0.83f, 0.81f, 1.36f, 0.81f)
                curveToRelative(0.24f, 0f, 0.48f, -0.06f, 0.7f, -0.18f)
                lineToRelative(3.72f, -1.6f)
                lineToRelative(3.69f, 1.58f)
                curveToRelative(0.47f, 0.26f, 1.04f, 0.26f, 1.51f, -0.01f)
                curveToRelative(0.74f, -0.42f, 1.01f, -1.37f, 0.58f, -2.12f)
                lineTo(12.0f, 5.03f)
                close()
                moveTo(16.72f, 15.93f)
                curveToRelative(-0.17f, 0.09f, -0.37f, 0.1f, -0.58f, -0.02f)
                lineToRelative(-4.13f, -1.77f)
                lineToRelative(-4.16f, 1.8f)
                curveToRelative(-0.26f, 0.14f, -0.6f, 0.05f, -0.75f, -0.21f)
                curveToRelative(-0.09f, -0.17f, -0.09f, -0.37f, 0f, -0.53f)
                lineTo(12.0f, 6.97f)
                lineToRelative(4.92f, 8.21f)
                curveToRelative(0.15f, 0.26f, 0.05f, 0.6f, -0.21f, 0.75f)
                close()
            }
        }.also { _CompassNorth = it}
