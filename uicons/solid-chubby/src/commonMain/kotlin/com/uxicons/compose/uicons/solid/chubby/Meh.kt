package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meh: ImageVector? = null

val Icons.Sc.Meh: ImageVector
    get() = _Meh ?: UXIcon(name = "Meh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.82f, 1f, 1f, 5.11f, 1f, 12.02f)
                curveToRelative(0f, 6.86f, 3.85f, 10.98f, 11.01f, 10.98f)
                reflectiveCurveToRelative(10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.98f, -11.01f, -10.98f)
                close()
                moveTo(6.59f, 10.1f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                close()
                moveTo(15.39f, 17.17f)
                horizontalLineToRelative(-6.79f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.79f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(15.4f, 12.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                close()
            }
        }.also { _Meh = it}
