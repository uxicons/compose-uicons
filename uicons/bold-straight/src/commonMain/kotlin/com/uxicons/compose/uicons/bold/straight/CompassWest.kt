package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassWest: ImageVector? = null

val Icons.Bs.CompassWest: ImageVector
    get() = _CompassWest ?: UXIcon(name = "CompassWest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(15.88f, 8.27f)
                lineToRelative(-1.61f, 3.73f)
                lineToRelative(1.59f, 3.75f)
                curveToRelative(0.17f, 0.3f, 0.17f, 0.67f, -0.0f, 0.97f)
                curveToRelative(-0.27f, 0.48f, -0.88f, 0.65f, -1.36f, 0.38f)
                lineTo(5.78f, 12f)
                lineTo(14.51f, 6.91f)
                curveToRelative(0.3f, -0.17f, 0.67f, -0.17f, 0.97f, -0.0f)
                curveToRelative(0.48f, 0.27f, 0.66f, 0.88f, 0.39f, 1.36f)
                close()
            }
        }.also { _CompassWest = it}
