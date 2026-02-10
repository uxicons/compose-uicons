package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockThreeThirty: ImageVector? = null

val Icons.Sc.ClockThreeThirty: ImageVector
    get() = _ClockThreeThirty ?: UXIcon(name = "ClockThreeThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.02f, 1f, 11.98f)
                reflectiveCurveToRelative(3.93f, 11.02f, 11.01f, 11.02f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(16.0f, 13f)
                lineToRelative(-3.0f, 0.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1.0f, -1f)
                lineToRelative(4f, -0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1f, 1.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }.also { _ClockThreeThirty = it}
