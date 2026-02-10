package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Bs.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2f)
                curveTo(5.38f, 2f, 0f, 7.38f, 0f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -6.62f, -5.38f, -12f, -12f, -12f)
                close()
                moveTo(17.65f, 7f)
                lineTo(6.35f, 7f)
                curveToRelative(1.55f, -1.25f, 3.51f, -2f, 5.65f, -2f)
                reflectiveCurveToRelative(4.1f, 0.75f, 5.65f, 2f)
                close()
                moveTo(16f, 15f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.98f, 0.32f, -3.78f, 0.88f, -5f)
                horizontalLineToRelative(6.24f)
                curveToRelative(0.56f, 1.22f, 0.88f, 3.02f, 0.88f, 5f)
                close()
                moveTo(3f, 14f)
                curveToRelative(0f, -1.44f, 0.34f, -2.79f, 0.94f, -4f)
                horizontalLineToRelative(1.74f)
                curveToRelative(-0.45f, 1.43f, -0.68f, 3.13f, -0.68f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.87f, -0.24f, -3.57f, -0.68f, -5f)
                horizontalLineToRelative(1.74f)
                curveToRelative(0.6f, 1.21f, 0.94f, 2.56f, 0.94f, 4f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _SpaceStationMoon = it}
