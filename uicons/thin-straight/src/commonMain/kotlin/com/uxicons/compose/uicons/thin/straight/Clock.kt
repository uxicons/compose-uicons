package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clock: ImageVector? = null

val Icons.Ts.Clock: ImageVector
    get() = _Clock ?: UXIcon(name = "Clock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.76f, 15.93f)
                lineToRelative(-0.51f, -0.86f)
                lineToRelative(4.76f, -2.85f)
                lineToRelative(0f, -7.22f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 7.78f)
                lineToRelative(-5.24f, 3.15f)
                close()
            }
        }.also { _Clock = it}
