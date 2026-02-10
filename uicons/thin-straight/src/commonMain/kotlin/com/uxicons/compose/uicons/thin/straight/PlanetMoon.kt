package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Ts.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 3f)
                curveTo(4.71f, 3f, 0f, 7.71f, 0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3f, 10.5f, 3f)
                close()
                moveTo(10.09f, 4.01f)
                lineToRelative(-1.3f, 1.42f)
                lineToRelative(1.37f, 2.28f)
                lineToRelative(-1.86f, -0.93f)
                lineToRelative(-2.72f, 2.72f)
                lineToRelative(0.5f, 0.5f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(-1.78f, -1.83f)
                curveToRelative(1.64f, -2.41f, 4.35f, -4.03f, 7.45f, -4.16f)
                close()
                moveTo(10.5f, 23f)
                curveToRelative(-5.24f, 0f, -9.5f, -4.26f, -9.5f, -9.5f)
                curveToRelative(0f, -1.61f, 0.4f, -3.12f, 1.11f, -4.45f)
                lineToRelative(1.9f, 1.95f)
                horizontalLineToRelative(3.0f)
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
                lineToRelative(-1.47f, -2.45f)
                lineToRelative(1.38f, -1.51f)
                curveToRelative(4.81f, 0.46f, 8.59f, 4.53f, 8.59f, 9.46f)
                curveToRelative(0f, 5.24f, -4.26f, 9.5f, -9.5f, 9.5f)
                close()
                moveTo(9f, 13.59f)
                verticalLineToRelative(-1.59f)
                horizontalLineToRelative(1.71f)
                lineToRelative(2.96f, 1.85f)
                lineToRelative(-2.26f, 4.15f)
                horizontalLineToRelative(-0.41f)
                verticalLineToRelative(-2.41f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(21.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _PlanetMoon = it}
