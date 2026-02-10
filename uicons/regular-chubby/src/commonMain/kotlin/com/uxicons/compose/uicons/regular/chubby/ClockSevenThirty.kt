package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockSevenThirty: ImageVector? = null

val Icons.Rc.ClockSevenThirty: ImageVector
    get() = _ClockSevenThirty ?: UXIcon(name = "ClockSevenThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.38f, 11.08f)
                curveToRelative(-0.38f, -0.15f, -0.8f, -0.07f, -1.09f, 0.22f)
                lineToRelative(-3f, 3f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.29f, -1.29f)
                verticalLineToRelative(3.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.4f, -0.24f, -0.77f, -0.62f, -0.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-6.03f, -0.04f, -8.89f, -2.9f, -9.01f, -9f)
                curveToRelative(0.11f, -6.02f, 3.06f, -8.96f, 8.99f, -9f)
                curveToRelative(5.87f, 0.04f, 8.9f, 3.07f, 9.01f, 8.98f)
                curveToRelative(-0.11f, 6.12f, -2.97f, 8.98f, -8.99f, 9.02f)
                close()
            }
        }.also { _ClockSevenThirty = it}
