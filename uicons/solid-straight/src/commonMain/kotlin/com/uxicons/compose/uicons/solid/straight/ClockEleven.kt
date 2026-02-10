package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEleven: ImageVector? = null

val Icons.Ss.ClockEleven: ImageVector
    get() = _ClockEleven ?: UXIcon(name = "ClockEleven") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 15f)
                lineToRelative(-4.8f, -6.4f)
                lineToRelative(1.6f, -1.2f)
                lineToRelative(1.2f, 1.6f)
                lineTo(11f, 5f)
                horizontalLineToRelative(2f)
                lineTo(13f, 15f)
                close()
            }
        }.also { _ClockEleven = it}
