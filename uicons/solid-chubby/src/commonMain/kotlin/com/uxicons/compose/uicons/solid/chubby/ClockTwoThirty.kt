package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwoThirty: ImageVector? = null

val Icons.Sc.ClockTwoThirty: ImageVector
    get() = _ClockTwoThirty ?: UXIcon(name = "ClockTwoThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(15.55f, 10.83f)
                lineToRelative(-2.56f, 1.7f)
                verticalLineToRelative(5.46f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.33f, 0.17f, -0.65f, 0.45f, -0.83f)
                lineToRelative(3f, -2f)
                curveToRelative(0.46f, -0.31f, 1.08f, -0.18f, 1.39f, 0.28f)
                curveToRelative(0.31f, 0.46f, 0.18f, 1.08f, -0.28f, 1.39f)
                close()
            }
        }.also { _ClockTwoThirty = it}
