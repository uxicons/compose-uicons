package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smile: ImageVector? = null

val Icons.Sc.Smile: ImageVector
    get() = _Smile ?: UXIcon(name = "Smile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.82f, 1f, 1f, 5.11f, 1f, 12.02f)
                curveToRelative(0f, 6.86f, 3.85f, 10.98f, 11.01f, 10.98f)
                reflectiveCurveToRelative(10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.98f, -11.01f, -10.98f)
                close()
                moveTo(6.59f, 10.48f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                close()
                moveTo(16.16f, 16.78f)
                curveToRelative(-1.35f, 1.31f, -2.77f, 1.96f, -4.18f, 1.96f)
                reflectiveCurveToRelative(-2.82f, -0.66f, -4.15f, -1.97f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                curveToRelative(1.89f, 1.86f, 3.6f, 1.86f, 5.53f, -0.01f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                reflectiveCurveToRelative(0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(15.4f, 12.38f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                close()
            }
        }.also { _Smile = it}
