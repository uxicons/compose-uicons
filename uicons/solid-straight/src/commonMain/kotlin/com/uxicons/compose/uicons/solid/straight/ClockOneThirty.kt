package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOneThirty: ImageVector? = null

val Icons.Ss.ClockOneThirty: ImageVector
    get() = _ClockOneThirty ?: UXIcon(name = "ClockOneThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(13f, 12.33f)
                lineToRelative(2.8f, -3.73f)
                lineToRelative(-1.6f, -1.2f)
                lineToRelative(-3.2f, 4.27f)
                verticalLineToRelative(7.33f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.67f)
                close()
            }
        }.also { _ClockOneThirty = it}
