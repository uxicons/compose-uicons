package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Bs.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 3f)
                curveTo(4.71f, 3f, 0f, 7.71f, 0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3f, 10.5f, 3f)
                close()
                moveTo(10.5f, 21f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                curveToRelative(0f, -1.04f, 0.21f, -2.03f, 0.59f, -2.93f)
                lineToRelative(0.41f, 0.43f)
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
                lineToRelative(-1.2f, -2.0f)
                curveToRelative(0.07f, -0.0f, 0.13f, -0.0f, 0.2f, -0.0f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _PlanetMoon = it}
