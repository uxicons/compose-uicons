package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwo: ImageVector? = null

val Icons.Ss.ClockTwo: ImageVector
    get() = _ClockTwo ?: UXIcon(name = "ClockTwo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(16.82f, 10.34f)
                lineToRelative(-1.01f, -1.73f)
                lineToRelative(-2.81f, 1.64f)
                lineTo(13f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 13.74f)
                lineToRelative(5.82f, -3.4f)
                close()
            }
        }.also { _ClockTwo = it}
