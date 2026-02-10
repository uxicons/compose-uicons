package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassWest: ImageVector? = null

val Icons.Rs.CompassWest: ImageVector
    get() = _CompassWest ?: UXIcon(name = "CompassWest") {
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
                moveTo(15.97f, 6.03f)
                curveToRelative(-0.61f, -0.34f, -1.34f, -0.34f, -1.97f, 0.02f)
                lineTo(4.05f, 12.0f)
                lineToRelative(9.95f, 5.98f)
                curveToRelative(0.31f, 0.17f, 0.65f, 0.26f, 0.98f, 0.26f)
                curveToRelative(0.7f, 0f, 1.38f, -0.37f, 1.75f, -1.02f)
                curveToRelative(0.33f, -0.58f, 0.34f, -1.3f, 0.04f, -1.9f)
                lineToRelative(-1.41f, -3.32f)
                lineToRelative(1.4f, -3.25f)
                curveToRelative(0.53f, -0.96f, 0.18f, -2.19f, -0.78f, -2.72f)
                close()
                moveTo(14.94f, 16.14f)
                lineToRelative(0.07f, 0.11f)
                lineToRelative(-7.06f, -4.25f)
                lineToRelative(7.06f, -4.22f)
                lineToRelative(-1.83f, 4.22f)
                lineToRelative(1.76f, 4.14f)
                close()
            }
        }.also { _CompassWest = it}
