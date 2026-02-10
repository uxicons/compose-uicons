package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTenThirty: ImageVector? = null

val Icons.Sc.ClockTenThirty: ImageVector
    get() = _ClockTenThirty ?: UXIcon(name = "ClockTenThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(13f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.46f)
                lineToRelative(-2.56f, -1.7f)
                curveToRelative(-0.46f, -0.31f, -0.58f, -0.93f, -0.28f, -1.39f)
                reflectiveCurveToRelative(0.93f, -0.58f, 1.39f, -0.28f)
                lineToRelative(3f, 2f)
                curveToRelative(0.28f, 0.19f, 0.45f, 0.5f, 0.45f, 0.83f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClockTenThirty = it}
