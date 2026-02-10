package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAlien: ImageVector? = null

val Icons.Sr.UserAlien: ImageVector
    get() = _UserAlien ?: UXIcon(name = "UserAlien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.04f, 0f)
                curveTo(7.63f, 0f, 4.04f, 3.53f, 4.04f, 7.86f)
                curveToRelative(0f, 4.09f, 3.61f, 8.17f, 5.76f, 10.24f)
                curveToRelative(0.63f, 0.6f, 1.44f, 0.91f, 2.24f, 0.91f)
                reflectiveCurveToRelative(1.61f, -0.3f, 2.24f, -0.91f)
                curveToRelative(2.15f, -2.07f, 5.76f, -6.14f, 5.76f, -10.24f)
                curveToRelative(0f, -4.33f, -3.59f, -7.86f, -8f, -7.86f)
                close()
                moveTo(10.28f, 10.0f)
                curveToRelative(-0.64f, -0.03f, -1.55f, -0.18f, -2.08f, -0.7f)
                curveToRelative(-0.53f, -0.53f, -0.67f, -1.44f, -0.7f, -2.08f)
                curveToRelative(-0.02f, -0.41f, 0.31f, -0.74f, 0.72f, -0.72f)
                curveToRelative(0.64f, 0.03f, 1.55f, 0.18f, 2.08f, 0.7f)
                curveToRelative(0.53f, 0.53f, 0.67f, 1.44f, 0.7f, 2.08f)
                curveToRelative(0.02f, 0.41f, -0.31f, 0.74f, -0.72f, 0.72f)
                close()
                moveTo(15.79f, 9.29f)
                curveToRelative(-0.53f, 0.53f, -1.44f, 0.67f, -2.08f, 0.7f)
                curveToRelative(-0.41f, 0.02f, -0.74f, -0.31f, -0.72f, -0.72f)
                curveToRelative(0.03f, -0.64f, 0.18f, -1.55f, 0.7f, -2.08f)
                curveToRelative(0.53f, -0.53f, 1.44f, -0.67f, 2.08f, -0.7f)
                curveToRelative(0.41f, -0.02f, 0.74f, 0.31f, 0.72f, 0.72f)
                curveToRelative(-0.03f, 0.64f, -0.18f, 1.55f, -0.7f, 2.08f)
                close()
                moveTo(21.0f, 22.0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 24.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.19f, 0.91f, -4.24f, 2.42f, -5.72f)
                curveToRelative(0.95f, 1.23f, 1.98f, 2.33f, 2.95f, 3.26f)
                curveToRelative(0.98f, 0.94f, 2.27f, 1.47f, 3.63f, 1.47f)
                reflectiveCurveToRelative(2.65f, -0.52f, 3.63f, -1.47f)
                curveToRelative(0.97f, -0.93f, 2.01f, -2.04f, 2.95f, -3.26f)
                curveToRelative(1.51f, 1.48f, 2.42f, 3.54f, 2.42f, 5.72f)
                close()
            }
        }.also { _UserAlien = it}
