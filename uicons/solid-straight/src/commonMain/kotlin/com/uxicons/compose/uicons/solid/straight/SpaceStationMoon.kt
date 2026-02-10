package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Ss.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.24f, 0.39f, -4.2f, 1.07f, -5.5f)
                horizontalLineToRelative(9.85f)
                curveToRelative(0.69f, 1.3f, 1.07f, 3.26f, 1.07f, 5.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(21.73f, 7f)
                curveToRelative(-2.18f, -3.02f, -5.72f, -5f, -9.73f, -5f)
                reflectiveCurveTo(4.45f, 3.98f, 2.27f, 7f)
                horizontalLineToRelative(19.45f)
                close()
                moveTo(4f, 14.5f)
                curveToRelative(0f, -2.12f, 0.31f, -4.0f, 0.89f, -5.5f)
                lineTo(1.1f, 9f)
                curveToRelative(-0.7f, 1.52f, -1.1f, 3.21f, -1.1f, 5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.11f, 9f)
                curveToRelative(0.57f, 1.5f, 0.89f, 3.38f, 0.89f, 5.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.79f, -0.4f, -3.48f, -1.1f, -5f)
                horizontalLineToRelative(-3.78f)
                close()
            }
        }.also { _SpaceStationMoon = it}
