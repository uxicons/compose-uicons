package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sad: ImageVector? = null

val Icons.Sc.Sad: ImageVector
    get() = _Sad ?: UXIcon(name = "Sad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.82f, 1f, 1f, 5.11f, 1f, 12.02f)
                curveToRelative(0f, 6.86f, 3.85f, 10.98f, 11.01f, 10.98f)
                reflectiveCurveToRelative(10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.98f, -11.01f, -10.98f)
                close()
                moveTo(6.59f, 9.48f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                close()
                moveTo(16.18f, 17.45f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                curveToRelative(-1.89f, -1.87f, -3.6f, -1.86f, -5.54f, 0.01f)
                curveToRelative(-0.4f, 0.38f, -1.03f, 0.37f, -1.41f, -0.03f)
                curveToRelative(-0.38f, -0.4f, -0.37f, -1.03f, 0.03f, -1.41f)
                curveToRelative(2.71f, -2.62f, 5.67f, -2.62f, 8.33f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                close()
                moveTo(15.4f, 11.38f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                close()
            }
        }.also { _Sad = it}
