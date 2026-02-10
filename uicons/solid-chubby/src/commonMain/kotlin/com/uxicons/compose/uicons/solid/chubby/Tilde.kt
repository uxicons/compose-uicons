package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tilde: ImageVector? = null

val Icons.Sc.Tilde: ImageVector
    get() = _Tilde ?: UXIcon(name = "Tilde") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.92f, 19f)
                curveToRelative(-3.92f, 0f, -5.22f, -3.53f, -6.0f, -5.63f)
                curveToRelative(-0.22f, -0.61f, -0.44f, -1.13f, -0.66f, -1.73f)
                curveToRelative(-0.92f, -2.47f, -1.53f, -3.63f, -3.17f, -3.63f)
                curveToRelative(-2.48f, 0f, -3.08f, 0.59f, -3.08f, 3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -4.09f, 1.93f, -6f, 6.08f, -6f)
                curveToRelative(3.91f, 0f, 5.16f, 3.36f, 5.98f, 5.59f)
                curveToRelative(0.22f, 0.6f, 0.44f, 1.13f, 0.66f, 1.74f)
                curveToRelative(0.85f, 2.29f, 1.48f, 3.68f, 3.19f, 3.68f)
                curveToRelative(2.48f, 0f, 3.08f, -0.59f, 3.08f, -3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 4.09f, -1.93f, 6f, -6.08f, 6f)
                close()
            }
        }.also { _Tilde = it}
