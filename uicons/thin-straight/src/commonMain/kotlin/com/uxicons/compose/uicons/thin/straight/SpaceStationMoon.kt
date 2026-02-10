package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Ts.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2f)
                curveTo(5.38f, 2f, 0f, 7.38f, 0f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.41f, 0f, 6.46f, 1.56f, 8.48f, 4f)
                lineTo(3.52f, 7f)
                curveToRelative(2.02f, -2.44f, 5.07f, -4f, 8.48f, -4f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.48f)
                curveToRelative(0f, -2.73f, 0.54f, -5.1f, 1.48f, -6.52f)
                lineToRelative(-0.01f, -0.01f)
                horizontalLineToRelative(9.05f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(0.94f, 1.42f, 1.48f, 3.79f, 1.48f, 6.52f)
                verticalLineToRelative(6.48f)
                close()
                moveTo(14f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                close()
                moveTo(1f, 14f)
                curveToRelative(0f, -2.21f, 0.66f, -4.27f, 1.78f, -6f)
                horizontalLineToRelative(3.54f)
                curveToRelative(-0.85f, 1.59f, -1.33f, 3.92f, -1.33f, 6.52f)
                verticalLineToRelative(6.48f)
                lineTo(1f, 21f)
                verticalLineToRelative(-7f)
                close()
                moveTo(23f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.48f)
                curveToRelative(0f, -2.6f, -0.48f, -4.93f, -1.33f, -6.52f)
                horizontalLineToRelative(3.54f)
                curveToRelative(1.13f, 1.73f, 1.78f, 3.79f, 1.78f, 6f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _SpaceStationMoon = it}
