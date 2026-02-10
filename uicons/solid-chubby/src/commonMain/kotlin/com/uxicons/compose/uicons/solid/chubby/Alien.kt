package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Alien: ImageVector? = null

val Icons.Sc.Alien: ImageVector
    get() = _Alien ?: UXIcon(name = "Alien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                curveToRelative(0f, 6.13f, 8.04f, 12.52f, 8.38f, 12.79f)
                curveToRelative(0.18f, 0.14f, 0.4f, 0.21f, 0.62f, 0.21f)
                reflectiveCurveToRelative(0.44f, -0.07f, 0.62f, -0.21f)
                curveToRelative(0.34f, -0.27f, 8.38f, -6.66f, 8.38f, -12.79f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                close()
                moveTo(10.14f, 12.99f)
                curveToRelative(-0.72f, -0.04f, -1.74f, -0.21f, -2.33f, -0.8f)
                reflectiveCurveToRelative(-0.76f, -1.61f, -0.8f, -2.33f)
                curveToRelative(-0.03f, -0.48f, 0.37f, -0.88f, 0.85f, -0.85f)
                curveToRelative(0.72f, 0.04f, 1.74f, 0.21f, 2.33f, 0.8f)
                reflectiveCurveToRelative(0.76f, 1.61f, 0.8f, 2.33f)
                curveToRelative(0.03f, 0.48f, -0.37f, 0.88f, -0.85f, 0.85f)
                close()
                moveTo(16.19f, 12.19f)
                curveToRelative(-0.59f, 0.59f, -1.61f, 0.76f, -2.33f, 0.8f)
                curveToRelative(-0.48f, 0.03f, -0.88f, -0.37f, -0.85f, -0.85f)
                curveToRelative(0.04f, -0.72f, 0.21f, -1.74f, 0.8f, -2.33f)
                reflectiveCurveToRelative(1.61f, -0.76f, 2.33f, -0.8f)
                curveToRelative(0.48f, -0.03f, 0.88f, 0.37f, 0.85f, 0.85f)
                curveToRelative(-0.04f, 0.72f, -0.21f, 1.74f, -0.8f, 2.33f)
                close()
            }
        }.also { _Alien = it}
