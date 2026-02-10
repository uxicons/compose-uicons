package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smile: ImageVector? = null

val Icons.Rc.Smile: ImageVector
    get() = _Smile ?: UXIcon(name = "Smile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.61f, 12.38f)
                curveToRelative(1.24f, -0.01f, 1.99f, -0.71f, 2.01f, -1.93f)
                curveToRelative(-0.02f, -1.16f, -0.79f, -1.89f, -2.02f, -1.9f)
                curveToRelative(-1.24f, 0.01f, -1.99f, 0.71f, -2.02f, 1.93f)
                curveToRelative(0.02f, 1.18f, 0.78f, 1.89f, 2.01f, 1.9f)
                horizontalLineToRelative(0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.39f, 8.55f)
                curveToRelative(-1.24f, 0.01f, -1.99f, 0.71f, -2.02f, 1.93f)
                curveToRelative(0.02f, 1.18f, 0.78f, 1.89f, 2.01f, 1.9f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.24f, -0.01f, 1.99f, -0.71f, 2.01f, -1.93f)
                curveToRelative(-0.02f, -1.16f, -0.79f, -1.89f, -2.02f, -1.9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.77f, 14.6f)
                curveToRelative(-1.94f, 1.87f, -3.65f, 1.87f, -5.53f, 0.01f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.38f, 1.03f, 0.01f, 1.41f)
                curveToRelative(1.33f, 1.31f, 2.73f, 1.97f, 4.15f, 1.97f)
                reflectiveCurveToRelative(2.83f, -0.65f, 4.18f, -1.96f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.41f, -1.41f, -0.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 4.84f, 1f, 11.98f)
                curveToRelative(0f, 7.02f, 3.93f, 10.98f, 11.01f, 11.02f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-6.03f, -0.04f, -8.89f, -2.9f, -9.01f, -9f)
                curveToRelative(0.11f, -6.02f, 3.06f, -8.96f, 8.99f, -9f)
                curveToRelative(5.87f, 0.04f, 8.9f, 3.07f, 9.01f, 8.98f)
                curveToRelative(-0.11f, 6.12f, -2.97f, 8.98f, -8.99f, 9.02f)
                close()
            }
        }.also { _Smile = it}
