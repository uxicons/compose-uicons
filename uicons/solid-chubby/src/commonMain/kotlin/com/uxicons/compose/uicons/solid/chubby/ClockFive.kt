package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFive: ImageVector? = null

val Icons.Sc.ClockFive: ImageVector
    get() = _ClockFive ?: UXIcon(name = "ClockFive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(14.55f, 15.83f)
                curveToRelative(-0.17f, 0.11f, -0.87f, 0.4f, -1.39f, -0.28f)
                lineToRelative(-2f, -3f)
                curveToRelative(-0.11f, -0.16f, -0.17f, -0.36f, -0.17f, -0.56f)
                lineTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.7f)
                lineToRelative(1.83f, 2.75f)
                curveToRelative(0.31f, 0.46f, 0.18f, 1.08f, -0.28f, 1.39f)
                close()
            }
        }.also { _ClockFive = it}
