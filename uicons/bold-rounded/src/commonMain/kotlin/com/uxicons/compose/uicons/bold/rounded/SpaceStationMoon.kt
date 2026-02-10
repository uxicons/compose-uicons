package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Br.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.22f, 2.0f)
            curveToRelative(-3.23f, -0.04f, -6.31f, 1.16f, -8.63f, 3.44f)
            curveTo(1.28f, 7.71f, 0f, 10.75f, 0f, 14f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(15f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-3.15f)
            curveToRelative(0f, -6.69f, -5.28f, -12.23f, -11.78f, -12.35f)
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
            moveTo(12.0f, 5f)
            curveToRelative(0.06f, 0f, 0.11f, 0f, 0.17f, 0.0f)
            curveToRelative(2.02f, 0.04f, 3.88f, 0.78f, 5.37f, 2.0f)
            horizontalLineToRelative(-1.52f)
            curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
            horizontalLineToRelative(-7.97f)
            curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
            horizontalLineToRelative(-1.64f)
            curveToRelative(1.6f, -1.3f, 3.57f, -2f, 5.66f, -2f)
            close()
            moveTo(3f, 17.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.41f, 0.32f, -2.77f, 0.93f, -4f)
            horizontalLineToRelative(1.75f)
            curveToRelative(-0.45f, 1.43f, -0.68f, 3.13f, -0.68f, 5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.87f, -0.24f, -3.57f, -0.68f, -5f)
            horizontalLineToRelative(1.64f)
            curveToRelative(0.67f, 1.3f, 1.04f, 2.78f, 1.04f, 4.35f)
            verticalLineToRelative(3.15f)
            close()
        }
    }.also { _SpaceStationMoon = it }
