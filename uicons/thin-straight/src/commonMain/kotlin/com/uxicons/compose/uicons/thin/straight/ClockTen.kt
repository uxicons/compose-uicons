package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTen: ImageVector? = null

val Icons.Ts.ClockTen: ImageVector
    get() = _ClockTen ?: UXIcon(name = "ClockTen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.63f)
                lineToRelative(-3.83f, -2.22f)
                lineToRelative(-0.5f, 0.86f)
                lineToRelative(5.34f, 3.09f)
                lineTo(13f, 5f)
                close()
            }
        }.also { _ClockTen = it}
