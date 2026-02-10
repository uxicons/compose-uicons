package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassWest: ImageVector? = null

val Icons.Ts.CompassWest: ImageVector
    get() = _CompassWest ?: UXIcon(name = "CompassWest") {
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
                moveTo(16.8f, 6.79f)
                curveToRelative(-0.42f, -0.74f, -1.37f, -1.01f, -2.12f, -0.58f)
                lineTo(5.03f, 12.0f)
                lineToRelative(9.65f, 5.77f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.24f, 0.13f, 0.5f, 0.2f, 0.76f, 0.2f)
                curveToRelative(0.26f, 0f, 0.52f, -0.06f, 0.75f, -0.19f)
                curveToRelative(0.75f, -0.41f, 1.02f, -1.36f, 0.63f, -2.06f)
                lineToRelative(-1.6f, -3.72f)
                lineToRelative(1.58f, -3.69f)
                curveToRelative(0.26f, -0.47f, 0.26f, -1.04f, -0.01f, -1.51f)
                close()
                moveTo(15.91f, 7.87f)
                lineToRelative(-1.77f, 4.13f)
                lineToRelative(1.8f, 4.16f)
                curveToRelative(0.15f, 0.27f, 0.05f, 0.6f, -0.21f, 0.75f)
                curveToRelative(-0.17f, 0.09f, -0.37f, 0.09f, -0.53f, 0f)
                lineTo(6.97f, 12f)
                lineTo(15.18f, 7.08f)
                curveToRelative(0.27f, -0.15f, 0.6f, -0.05f, 0.75f, 0.21f)
                curveToRelative(0.09f, 0.17f, 0.09f, 0.37f, -0.02f, 0.58f)
                close()
            }
        }.also { _CompassWest = it}
