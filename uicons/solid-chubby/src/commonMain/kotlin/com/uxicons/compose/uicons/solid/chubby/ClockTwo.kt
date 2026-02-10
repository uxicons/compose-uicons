package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwo: ImageVector? = null

val Icons.Sc.ClockTwo: ImageVector
    get() = _ClockTwo ?: UXIcon(name = "ClockTwo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(16.45f, 10.89f)
                lineToRelative(-4f, 2f)
                curveToRelative(-0.58f, 0.29f, -1.45f, -0.06f, -1.45f, -0.9f)
                lineTo(11.0f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.38f)
                lineToRelative(2.55f, -1.28f)
                curveToRelative(0.49f, -0.25f, 1.09f, -0.05f, 1.34f, 0.45f)
                curveToRelative(0.25f, 0.49f, 0.05f, 1.09f, -0.45f, 1.34f)
                close()
            }
        }.also { _ClockTwo = it}
