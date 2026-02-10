package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwo: ImageVector? = null

val Icons.Ts.ClockTwo: ImageVector
    get() = _ClockTwo ?: UXIcon(name = "ClockTwo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                close()
                moveTo(11f, 13.37f)
                lineToRelative(5.34f, -3.09f)
                lineToRelative(-0.5f, -0.86f)
                lineToRelative(-3.83f, 2.22f)
                lineTo(12f, 5f)
                horizontalLineToRelative(-1f)
                lineTo(11f, 13.37f)
                close()
            }
        }.also { _ClockTwo = it}
