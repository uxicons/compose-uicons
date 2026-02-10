package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassEast: ImageVector? = null

val Icons.Ts.CompassEast: ImageVector
    get() = _CompassEast ?: UXIcon(name = "CompassEast") {
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
                moveTo(9.31f, 6.22f)
                curveToRelative(-0.47f, -0.27f, -1.03f, -0.27f, -1.51f, -0.01f)
                curveToRelative(-0.36f, 0.2f, -0.62f, 0.53f, -0.74f, 0.93f)
                curveToRelative(-0.11f, 0.4f, -0.07f, 0.82f, 0.11f, 1.14f)
                lineToRelative(1.6f, 3.72f)
                lineToRelative(-1.58f, 3.69f)
                curveToRelative(-0.26f, 0.47f, -0.26f, 1.04f, 0.01f, 1.51f)
                curveToRelative(0.28f, 0.5f, 0.81f, 0.79f, 1.35f, 0.79f)
                curveToRelative(0.26f, 0f, 0.53f, -0.07f, 0.77f, -0.2f)
                lineToRelative(9.65f, -5.79f)
                lineTo(9.32f, 6.23f)
                lineToRelative(-0.01f, -0.01f)
                close()
                moveTo(8.82f, 16.93f)
                curveToRelative(-0.26f, 0.15f, -0.6f, 0.06f, -0.75f, -0.21f)
                curveToRelative(-0.09f, -0.17f, -0.1f, -0.37f, 0.02f, -0.58f)
                lineToRelative(1.77f, -4.13f)
                lineToRelative(-1.8f, -4.16f)
                curveToRelative(-0.07f, -0.13f, -0.09f, -0.28f, -0.05f, -0.42f)
                curveToRelative(0.04f, -0.14f, 0.13f, -0.26f, 0.26f, -0.33f)
                curveToRelative(0.08f, -0.05f, 0.18f, -0.07f, 0.27f, -0.07f)
                curveToRelative(0.09f, 0f, 0.18f, 0.02f, 0.26f, 0.07f)
                lineToRelative(8.21f, 4.91f)
                lineToRelative(-8.21f, 4.92f)
                close()
            }
        }.also { _CompassEast = it}
