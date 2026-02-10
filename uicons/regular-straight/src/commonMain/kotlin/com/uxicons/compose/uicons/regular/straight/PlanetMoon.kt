package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Rs.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 3f)
                curveTo(4.71f, 3f, 0f, 7.71f, 0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3f, 10.5f, 3f)
                close()
                moveTo(10.5f, 22f)
                curveToRelative(-4.69f, 0f, -8.5f, -3.81f, -8.5f, -8.5f)
                curveToRelative(0f, -1.33f, 0.31f, -2.59f, 0.85f, -3.71f)
                lineToRelative(1.15f, 1.21f)
                horizontalLineToRelative(3f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, -5.5f)
                lineToRelative(-4f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, -1f)
                lineToRelative(-1.5f, -2.5f)
                reflectiveCurveToRelative(0.12f, -0.19f, 0.32f, -0.5f)
                curveToRelative(0.06f, -0.0f, 0.12f, -0.0f, 0.18f, -0.0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.81f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _PlanetMoon = it}
