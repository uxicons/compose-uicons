package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassEast: ImageVector? = null

val Icons.Bs.CompassEast: ImageVector
    get() = _CompassEast ?: UXIcon(name = "CompassEast") {
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
                moveTo(9.49f, 6.91f)
                lineToRelative(8.73f, 5.09f)
                lineToRelative(-8.71f, 5.11f)
                curveToRelative(-0.48f, 0.27f, -1.09f, 0.1f, -1.36f, -0.38f)
                curveToRelative(-0.17f, -0.3f, -0.17f, -0.67f, -0.0f, -0.97f)
                lineToRelative(1.59f, -3.75f)
                lineToRelative(-1.61f, -3.73f)
                curveToRelative(-0.27f, -0.48f, -0.09f, -1.09f, 0.39f, -1.36f)
                curveToRelative(0.3f, -0.17f, 0.67f, -0.17f, 0.97f, 0.0f)
                close()
            }
        }.also { _CompassEast = it}
