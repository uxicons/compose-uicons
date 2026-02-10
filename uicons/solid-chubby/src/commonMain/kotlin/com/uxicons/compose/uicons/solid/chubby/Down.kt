package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Sc.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.05f, -0.54f, -0.16f)
                curveToRelative(-3.67f, -2.35f, -6.8f, -5.48f, -9.3f, -9.29f)
                curveToRelative(-0.36f, -0.52f, -0.09f, -1.31f, 0.52f, -1.5f)
                curveToRelative(0.07f, -0.02f, 1.53f, -0.5f, 4.37f, -0.8f)
                curveToRelative(-0.04f, -0.71f, -0.05f, -1.38f, -0.05f, -2.0f)
                curveToRelative(0f, -3.26f, 0.49f, -6.74f, 0.51f, -6.89f)
                curveToRelative(0.05f, -0.34f, 0.27f, -0.63f, 0.58f, -0.77f)
                curveToRelative(0.13f, -0.06f, 1.37f, -0.59f, 3.91f, -0.59f)
                reflectiveCurveToRelative(3.78f, 0.53f, 3.91f, 0.59f)
                curveToRelative(0.31f, 0.14f, 0.53f, 0.43f, 0.58f, 0.77f)
                curveToRelative(0.02f, 0.15f, 0.51f, 3.63f, 0.51f, 6.89f)
                curveToRelative(0f, 0.62f, -0.02f, 1.29f, -0.05f, 2.0f)
                curveToRelative(2.84f, 0.3f, 4.3f, 0.78f, 4.37f, 0.8f)
                curveToRelative(0.61f, 0.19f, 0.88f, 0.97f, 0.52f, 1.5f)
                curveToRelative(-2.5f, 3.82f, -5.63f, 6.95f, -9.3f, 9.29f)
                curveToRelative(-0.16f, 0.1f, -0.35f, 0.16f, -0.54f, 0.16f)
                close()
            }
        }.also { _Down = it}
