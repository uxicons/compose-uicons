package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Sc.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.02f, 7.0f)
                curveToRelative(1.5f, -3.45f, 4.7f, -5.0f, 9.98f, -5.0f)
                reflectiveCurveToRelative(8.49f, 1.55f, 9.98f, 5.0f)
                curveToRelative(-2.72f, 0.5f, -6.83f, 1.02f, -9.98f, 1.0f)
                curveToRelative(-3.15f, 0.02f, -7.27f, -0.5f, -9.98f, -1.0f)
                close()
                moveTo(5f, 13f)
                curveToRelative(0f, -1.3f, 0.09f, -2.44f, 0.28f, -3.47f)
                curveToRelative(-1.62f, -0.21f, -2.98f, -0.44f, -3.87f, -0.61f)
                curveToRelative(-0.27f, 1.19f, -0.41f, 2.54f, -0.41f, 4.08f)
                verticalLineToRelative(6.89f)
                curveToRelative(0f, 0.47f, 0.33f, 0.88f, 0.79f, 0.98f)
                curveToRelative(0.1f, 0.02f, 1.37f, 0.3f, 3.21f, 0.57f)
                close()
                moveTo(7.27f, 9.75f)
                curveToRelative(-0.18f, 0.94f, -0.27f, 2.01f, -0.27f, 3.25f)
                verticalLineToRelative(8.69f)
                curveToRelative(0.64f, 0.07f, 1.31f, 0.14f, 2f, 0.19f)
                verticalLineToRelative(-3.88f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.01f, 3f, 3f)
                verticalLineToRelative(3.88f)
                curveToRelative(0.69f, -0.05f, 1.36f, -0.12f, 2f, -0.19f)
                verticalLineToRelative(-8.69f)
                curveToRelative(0f, -1.24f, -0.09f, -2.31f, -0.27f, -3.25f)
                curveToRelative(-1.5f, 0.14f, -3.12f, 0.25f, -4.73f, 0.25f)
                reflectiveCurveToRelative(-3.24f, -0.1f, -4.73f, -0.25f)
                close()
                moveTo(18.72f, 9.53f)
                curveToRelative(0.18f, 1.03f, 0.28f, 2.17f, 0.28f, 3.47f)
                verticalLineToRelative(8.44f)
                curveToRelative(1.85f, -0.27f, 3.11f, -0.55f, 3.21f, -0.57f)
                curveToRelative(0.46f, -0.1f, 0.79f, -0.51f, 0.79f, -0.98f)
                verticalLineToRelative(-6.89f)
                curveToRelative(0f, -1.53f, -0.14f, -2.88f, -0.41f, -4.08f)
                curveToRelative(-0.89f, 0.17f, -2.25f, 0.4f, -3.87f, 0.61f)
                close()
                moveTo(13f, 18f)
                curveToRelative(0f, -0.88f, -0.12f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.12f, -1f, 1f)
                verticalLineToRelative(3.98f)
                curveToRelative(0.33f, 0.01f, 0.67f, 0.01f, 1f, 0.01f)
                reflectiveCurveToRelative(0.67f, -0.01f, 1f, -0.01f)
                close()
            }
        }.also { _SpaceStationMoon = it}
