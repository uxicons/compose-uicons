package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEightThirty: ImageVector? = null

val Icons.Tc.ClockEightThirty: ImageVector
    get() = _ClockEightThirty ?: UXIcon(name = "ClockEightThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.04f, 1f, 12.01f)
                curveToRelative(0f, 7.09f, 3.83f, 10.95f, 11.0f, 10.99f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.74f, 11.0f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.95f, -11.0f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10.0f, -10f)
                curveToRelative(0.12f, -6.59f, 3.49f, -9.96f, 10.0f, -10f)
                curveToRelative(4.49f, 0.03f, 9.86f, 1.79f, 10.0f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.4f, 9.97f, -10.0f, 10.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.26f, 11.57f)
                curveToRelative(-0.15f, -0.09f, -0.33f, -0.1f, -0.49f, -0.02f)
                lineToRelative(-4f, 2f)
                curveToRelative(-0.25f, 0.12f, -0.35f, 0.42f, -0.22f, 0.67f)
                curveToRelative(0.12f, 0.25f, 0.42f, 0.35f, 0.67f, 0.22f)
                lineToRelative(3.28f, -1.64f)
                verticalLineToRelative(5.19f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.17f, -0.09f, -0.33f, -0.24f, -0.42f)
                close()
            }
        }.also { _ClockEightThirty = it}
