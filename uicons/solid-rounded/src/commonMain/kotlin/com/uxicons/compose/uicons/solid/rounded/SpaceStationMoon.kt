package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Sr.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 9f)
                horizontalLineToRelative(10f)
                curveToRelative(0.68f, 1.3f, 1.07f, 3.26f, 1.07f, 5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.24f, 0.39f, -4.2f, 1.07f, -5.5f)
                close()
                moveTo(21.61f, 7f)
                curveToRelative(-2.15f, -2.97f, -5.56f, -4.93f, -9.39f, -5.0f)
                curveToRelative(-3.28f, -0.04f, -6.32f, 1.16f, -8.63f, 3.44f)
                curveToRelative(-0.5f, 0.49f, -0.94f, 1.01f, -1.34f, 1.56f)
                horizontalLineToRelative(19.36f)
                close()
                moveTo(19.19f, 9f)
                curveToRelative(0.57f, 1.5f, 0.88f, 3.39f, 0.88f, 5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3.63f)
                curveToRelative(0f, -1.92f, -0.43f, -3.74f, -1.2f, -5.37f)
                horizontalLineToRelative(-3.61f)
                close()
                moveTo(3.93f, 14.5f)
                curveToRelative(0f, -2.11f, 0.31f, -4.0f, 0.88f, -5.5f)
                lineTo(1.08f, 9f)
                curveToRelative(-0.71f, 1.55f, -1.08f, 3.24f, -1.08f, 5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(-0.07f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.also { _SpaceStationMoon = it}
