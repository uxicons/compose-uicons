package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatCowboy: ImageVector? = null

val Icons.Ss.HatCowboy: ImageVector
    get() = _HatCowboy ?: UXIcon(name = "HatCowboy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, -0.0f)
                reflectiveCurveToRelative(-0.01f, 3.07f, -0.01f, 4.6f)
                curveToRelative(0f, 1.47f, -0.14f, 2.85f, -0.41f, 4.16f)
                curveTo(17.03f, 5.16f, 10.15f, 0.41f, 7.97f, 2.6f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.31f, -0.98f, 3.27f)
                curveToRelative(0f, 0.35f, 0f, 0.93f, -0.07f, 1.04f)
                curveToRelative(-0.14f, 0.09f, -0.7f, 0.08f, -1.04f, 0.08f)
                curveToRelative(-0.96f, -0.0f, -2.28f, -0.01f, -3.26f, 0.97f)
                curveToRelative(-1.65f, 1.65f, 0.65f, 5.99f, 3.43f, 9.98f)
                curveToRelative(3.31f, -0.27f, 6.0f, -1.48f, 8.21f, -3.69f)
                curveToRelative(1.18f, -1.18f, 2.07f, -2.51f, 2.69f, -3.99f)
                curveToRelative(0.53f, 0.38f, 1.07f, 0.79f, 1.63f, 1.22f)
                curveToRelative(-0.71f, 1.54f, -1.67f, 2.95f, -2.9f, 4.18f)
                curveToRelative(-2.25f, 2.25f, -5.04f, 3.62f, -8.29f, 4.11f)
                curveToRelative(0.47f, 0.63f, 0.93f, 1.23f, 1.38f, 1.8f)
                curveToRelative(-1.31f, 0.26f, -2.68f, 0.41f, -4.16f, 0.41f)
                curveToRelative(-1.53f, 0f, -4.6f, 0.01f, -4.6f, 0.01f)
                lineToRelative(0.01f, 2f)
                reflectiveCurveToRelative(3.06f, -0.01f, 4.6f, -0.01f)
                curveToRelative(5.63f, 0f, 10.33f, -1.83f, 13.94f, -5.45f)
                reflectiveCurveToRelative(5.45f, -8.31f, 5.45f, -13.94f)
                curveToRelative(0f, -1.53f, 0.01f, -4.6f, 0.01f, -4.6f)
                lineToRelative(-2f, -0.01f)
                close()
            }
        }.also { _HatCowboy = it}
