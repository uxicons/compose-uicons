package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Rr.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.22f, 2.0f)
                curveToRelative(-3.28f, -0.04f, -6.32f, 1.16f, -8.63f, 3.44f)
                curveTo(1.28f, 7.71f, 0f, 10.75f, 0f, 14f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-3.13f)
                curveToRelative(0f, -6.7f, -5.28f, -12.24f, -11.78f, -12.36f)
                close()
                moveTo(12.0f, 4f)
                curveToRelative(0.06f, 0f, 0.13f, 0f, 0.19f, 0.0f)
                curveToRelative(2.65f, 0.05f, 5.06f, 1.19f, 6.82f, 3.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                lineTo(7.51f, 7f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                horizontalLineToRelative(-2.62f)
                curveToRelative(0.04f, -0.05f, 0.09f, -0.09f, 0.14f, -0.14f)
                curveToRelative(1.89f, -1.85f, 4.37f, -2.86f, 7.0f, -2.86f)
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
                moveTo(2f, 17.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.79f, 0.46f, -3.5f, 1.33f, -5f)
                horizontalLineToRelative(2.55f)
                curveToRelative(-0.57f, 1.5f, -0.88f, 3.39f, -0.88f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 17.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.11f, -0.31f, -4.0f, -0.88f, -5.5f)
                horizontalLineToRelative(2.42f)
                curveToRelative(0.93f, 1.57f, 1.46f, 3.41f, 1.46f, 5.37f)
                verticalLineToRelative(3.13f)
                close()
            }
        }.also { _SpaceStationMoon = it}
