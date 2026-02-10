package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSouth: ImageVector? = null

val Icons.Ts.CompassSouth: ImageVector
    get() = _CompassSouth ?: UXIcon(name = "CompassSouth") {
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
                moveTo(17.2f, 7.2f)
                curveToRelative(-0.47f, -0.26f, -1.03f, -0.27f, -1.47f, -0.03f)
                lineToRelative(-3.74f, 1.6f)
                lineToRelative(-3.68f, -1.58f)
                curveToRelative(-0.75f, -0.41f, -1.69f, -0.14f, -2.11f, 0.61f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.26f, 0.47f, -0.26f, 1.04f, 0.01f, 1.52f)
                lineToRelative(5.77f, 9.65f)
                lineToRelative(5.8f, -9.66f)
                curveToRelative(0.42f, -0.74f, 0.15f, -1.69f, -0.59f, -2.11f)
                close()
                moveTo(16.93f, 8.81f)
                lineToRelative(-4.93f, 8.22f)
                lineTo(7.09f, 8.82f)
                curveToRelative(-0.09f, -0.17f, -0.1f, -0.37f, -0.0f, -0.54f)
                curveToRelative(0.15f, -0.27f, 0.48f, -0.36f, 0.79f, -0.19f)
                lineToRelative(4.12f, 1.78f)
                lineToRelative(4.18f, -1.8f)
                curveToRelative(0.17f, -0.09f, 0.37f, -0.09f, 0.54f, 0.0f)
                curveToRelative(0.26f, 0.15f, 0.36f, 0.48f, 0.22f, 0.74f)
                close()
            }
        }.also { _CompassSouth = it}
