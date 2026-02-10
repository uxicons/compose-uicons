package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockElevenThirty: ImageVector? = null

val Icons.Ts.ClockElevenThirty: ImageVector
    get() = _ClockElevenThirty ?: UXIcon(name = "ClockElevenThirty") {
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
                moveTo(13f, 11.33f)
                lineToRelative(-3.6f, -4.64f)
                lineToRelative(-0.79f, 0.61f)
                lineToRelative(3.4f, 4.36f)
                verticalLineToRelative(7.33f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.67f)
                close()
            }
        }.also { _ClockElevenThirty = it}
