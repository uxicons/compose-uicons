package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForwardFast: ImageVector? = null

val Icons.Sc.ForwardFast: ImageVector
    get() = _ForwardFast ?: UXIcon(name = "ForwardFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 6.47f, -0.94f, 9.78f, -0.98f, 9.92f)
                curveToRelative(-0.23f, 0.8f, -1.08f, 1.25f, -1.86f, 1.02f)
                curveToRelative(-0.8f, -0.23f, -1.25f, -1.06f, -1.02f, -1.85f)
                curveToRelative(0.01f, -0.04f, 0.69f, -2.53f, 0.83f, -7.36f)
                curveToRelative(-0.74f, 0.91f, -1.97f, 2.27f, -3.85f, 3.82f)
                curveToRelative(-3.33f, 2.77f, -5.39f, 3.4f, -5.48f, 3.42f)
                curveToRelative(-0.51f, 0.16f, -1.05f, -0.21f, -1.16f, -0.72f)
                curveToRelative(-0.01f, -0.06f, -0.23f, -1.03f, -0.42f, -2.93f)
                curveToRelative(-3.11f, 2.59f, -6.3f, 3.77f, -6.14f, 3.65f)
                curveToRelative(-0.52f, 0.16f, -1.11f, -0.19f, -1.24f, -0.72f)
                curveToRelative(-0.03f, -0.11f, -0.69f, -2.85f, -0.69f, -8.24f)
                reflectiveCurveToRelative(0.67f, -8.13f, 0.69f, -8.24f)
                curveToRelative(0.12f, -0.53f, 0.71f, -0.88f, 1.24f, -0.72f)
                curveToRelative(-0.19f, -0.14f, 3.06f, 1.08f, 6.14f, 3.65f)
                curveToRelative(0.18f, -1.9f, 0.4f, -2.87f, 0.42f, -2.93f)
                curveToRelative(0.11f, -0.52f, 0.65f, -0.88f, 1.16f, -0.72f)
                curveToRelative(0.09f, 0.03f, 2.14f, 0.65f, 5.48f, 3.42f)
                curveToRelative(1.87f, 1.55f, 3.11f, 2.91f, 3.85f, 3.82f)
                curveToRelative(-0.14f, -4.85f, -0.83f, -7.33f, -0.83f, -7.36f)
                curveToRelative(-0.23f, -0.8f, 0.23f, -1.62f, 1.03f, -1.85f)
                curveToRelative(0.8f, -0.23f, 1.62f, 0.23f, 1.85f, 1.02f)
                curveToRelative(0.04f, 0.14f, 0.98f, 3.45f, 0.98f, 9.92f)
                close()
            }
        }.also { _ForwardFast = it}
