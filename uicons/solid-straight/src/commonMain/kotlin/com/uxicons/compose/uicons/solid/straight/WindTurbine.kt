package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindTurbine: ImageVector? = null

val Icons.Ss.WindTurbine: ImageVector
    get() = _WindTurbine ?: UXIcon(name = "WindTurbine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 13.95f)
                curveToRelative(-0.16f, -0.13f, -3.76f, -3.09f, -6.67f, -4.98f)
                curveToRelative(-0.39f, -3.46f, -1.43f, -8.0f, -1.48f, -8.2f)
                lineToRelative(-0.18f, -0.78f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(-0.18f, 0.78f)
                curveToRelative(-0.05f, 0.2f, -1.09f, 4.74f, -1.48f, 8.2f)
                curveToRelative(-2.92f, 1.89f, -6.52f, 4.85f, -6.67f, 4.98f)
                lineToRelative(-0.61f, 0.51f)
                lineToRelative(1.66f, 3.34f)
                lineToRelative(0.77f, -0.19f)
                curveToRelative(0.19f, -0.05f, 4.2f, -1.01f, 7.39f, -2.12f)
                verticalLineToRelative(6.51f)
                horizontalLineToRelative(-4.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.02f)
                verticalLineToRelative(-6.5f)
                curveToRelative(3.19f, 1.1f, 7.17f, 2.06f, 7.36f, 2.11f)
                lineToRelative(0.77f, 0.19f)
                lineToRelative(1.66f, -3.34f)
                lineToRelative(-0.61f, -0.51f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _WindTurbine = it}
