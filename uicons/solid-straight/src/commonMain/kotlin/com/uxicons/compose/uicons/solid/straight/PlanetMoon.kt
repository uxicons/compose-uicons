package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Ss.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 3f)
                curveTo(4.71f, 3f, 0f, 7.71f, 0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3f, 10.5f, 3f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.14f, -1.2f)
                curveToRelative(1.35f, -2.78f, 4.18f, -4.72f, 7.46f, -4.79f)
                curveToRelative(-0.19f, 0.3f, -0.32f, 0.49f, -0.32f, 0.49f)
                lineToRelative(1.5f, 2.5f)
                lineToRelative(-1f, 1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-3f, 5.5f)
                close()
            }
        }.also { _PlanetMoon = it}
