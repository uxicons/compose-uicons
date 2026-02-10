package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Rs.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2f)
                curveTo(5.38f, 2f, 0f, 7.38f, 0f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(12f, 4f)
                curveToRelative(2.79f, 0f, 5.32f, 1.15f, 7.13f, 3f)
                lineTo(4.87f, 7f)
                curveToRelative(1.82f, -1.85f, 4.34f, -3f, 7.13f, -3f)
                close()
                moveTo(17f, 14.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.24f, 0.39f, -4.2f, 1.07f, -5.5f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.68f, 1.3f, 1.07f, 3.26f, 1.07f, 5.5f)
                close()
                moveTo(2f, 14f)
                curveToRelative(0f, -1.82f, 0.49f, -3.53f, 1.34f, -5f)
                horizontalLineToRelative(2.54f)
                curveToRelative(-0.57f, 1.5f, -0.88f, 3.39f, -0.88f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.11f, -0.31f, -4.0f, -0.88f, -5.5f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.85f, 1.47f, 1.34f, 3.18f, 1.34f, 5f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _SpaceStationMoon = it}
