package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockSeven: ImageVector? = null

val Icons.Sc.ClockSeven: ImageVector
    get() = _ClockSeven ?: UXIcon(name = "ClockSeven") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.2f, -0.06f, 0.39f, -0.17f, 0.56f)
                lineToRelative(-2f, 3f)
                curveToRelative(-0.19f, 0.29f, -0.73f, 0.68f, -1.39f, 0.28f)
                curveToRelative(-0.47f, -0.29f, -0.58f, -0.93f, -0.28f, -1.39f)
                lineToRelative(1.83f, -2.75f)
                lineTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClockSeven = it}
