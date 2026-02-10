package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flushed: ImageVector? = null

val Icons.Rc.Flushed: ImageVector
    get() = _Flushed ?: UXIcon(name = "Flushed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.61f, 12.37f)
                curveToRelative(1.24f, -0.01f, 1.99f, -0.75f, 2.01f, -2.03f)
                curveToRelative(-0.02f, -1.23f, -0.79f, -2.0f, -2.02f, -2.01f)
                curveToRelative(-1.24f, 0.01f, -1.99f, 0.75f, -2.01f, 2.03f)
                curveToRelative(0.02f, 1.25f, 0.78f, 2.0f, 2.01f, 2.0f)
                horizontalLineToRelative(0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.39f, 8.33f)
                curveToRelative(-1.24f, 0.01f, -1.99f, 0.75f, -2.02f, 2.03f)
                curveToRelative(0.02f, 1.25f, 0.78f, 2.0f, 2.01f, 2.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.24f, -0.01f, 1.99f, -0.75f, 2.01f, -2.03f)
                curveToRelative(-0.02f, -1.23f, -0.79f, -2.0f, -2.02f, -2.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.39f, 15.48f)
                horizontalLineToRelative(-6.79f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.79f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
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
        }.also { _Flushed = it}
