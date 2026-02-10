package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassNorth: ImageVector? = null

val Icons.Rs.CompassNorth: ImageVector
    get() = _CompassNorth ?: UXIcon(name = "CompassNorth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(12.0f, 4.05f)
                lineTo(6.05f, 14.0f)
                lineToRelative(-0.01f, 0.02f)
                curveToRelative(-0.34f, 0.61f, -0.34f, 1.33f, -0.01f, 1.95f)
                curveToRelative(0.37f, 0.67f, 1.07f, 1.04f, 1.76f, 1.04f)
                curveToRelative(0.3f, 0f, 0.6f, -0.07f, 0.87f, -0.22f)
                lineToRelative(3.34f, -1.44f)
                lineToRelative(3.32f, 1.41f)
                curveToRelative(0.59f, 0.3f, 1.31f, 0.29f, 1.9f, -0.04f)
                curveToRelative(0.96f, -0.54f, 1.3f, -1.76f, 0.75f, -2.75f)
                lineTo(12.0f, 4.05f)
                close()
                moveTo(12.0f, 13.18f)
                lineToRelative(-4.21f, 1.82f)
                verticalLineToRelative(-0.0f)
                lineToRelative(4.22f, -7.06f)
                lineToRelative(4.23f, 7.04f)
                lineToRelative(-4.24f, -1.8f)
                close()
            }
        }.also { _CompassNorth = it}
