package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSouth: ImageVector? = null

val Icons.Bs.CompassSouth: ImageVector
    get() = _CompassSouth ?: UXIcon(name = "CompassSouth") {
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
                moveTo(17.11f, 9.51f)
                lineToRelative(-5.11f, 8.71f)
                lineTo(6.91f, 9.49f)
                curveToRelative(-0.17f, -0.3f, -0.17f, -0.67f, -0.0f, -0.97f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.66f, 1.36f, -0.39f)
                lineToRelative(3.73f, 1.61f)
                lineToRelative(3.75f, -1.59f)
                curveToRelative(0.3f, -0.17f, 0.67f, -0.17f, 0.97f, 0.0f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.38f, 1.36f)
                close()
            }
        }.also { _CompassSouth = it}
