package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockSevenThirty: ImageVector? = null

val Icons.Ts.ClockSevenThirty: ImageVector
    get() = _ClockSevenThirty ?: UXIcon(name = "ClockSevenThirty") {
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
                moveTo(13f, 10f)
                lineToRelative(-3.9f, 5.2f)
                lineToRelative(0.8f, 0.6f)
                lineToRelative(2.1f, -2.8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                lineTo(13f, 10f)
                close()
            }
        }.also { _ClockSevenThirty = it}
