package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EagleFlying: ImageVector? = null

val Icons.Ss.EagleFlying: ImageVector
    get() = _EagleFlying ?: UXIcon(name = "EagleFlying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.72f, 21.5f)
                curveToRelative(-0.54f, 1.25f, -2.42f, 1.74f, -3.98f, 1.52f)
                lineToRelative(-3.88f, -4.52f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-2.34f, 2.92f)
                lineToRelative(-1.04f, 1.63f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.57f, 0.02f, -0.87f, 0.34f, -0.87f, 0.94f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.81f, 1.21f, -2.65f, 2.28f, -2.88f)
                lineToRelative(0.9f, -2.83f)
                curveToRelative(-2.58f, -0.74f, -5.19f, -3.31f, -6.12f, -4.29f)
                horizontalLineToRelative(-4.06f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.57f, 2.09f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4.53f)
                curveToRelative(0.53f, -0.43f, 1.71f, -3.6f, 1.47f, -6.28f)
                lineToRelative(14.5f, -3.71f)
                curveToRelative(0.0f, 0.95f, 0.01f, 2.19f, -0.09f, 3.1f)
                lineToRelative(-10.41f, 2.89f)
                horizontalLineToRelative(9.88f)
                curveToRelative(-0.33f, 1.13f, -0.79f, 2.12f, -1.33f, 3f)
                horizontalLineToRelative(-9.02f)
                lineToRelative(7.2f, 2.3f)
                curveToRelative(-1.04f, 1.04f, -2.22f, 1.88f, -3.42f, 2.6f)
                lineToRelative(0.94f, 1.89f)
                lineToRelative(4.98f, 1.72f)
                curveToRelative(0.64f, 0.77f, 1.8f, 2.22f, 0.98f, 3.99f)
                close()
            }
        }.also { _EagleFlying = it}
