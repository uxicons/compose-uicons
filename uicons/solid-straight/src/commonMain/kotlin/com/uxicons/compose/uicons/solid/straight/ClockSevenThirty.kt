package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockSevenThirty: ImageVector? = null

val Icons.Ss.ClockSevenThirty: ImageVector
    get() = _ClockSevenThirty ?: UXIcon(name = "ClockSevenThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(13f, 9f)
                lineToRelative(-4.8f, 6.4f)
                lineToRelative(1.6f, 1.2f)
                lineToRelative(1.2f, -1.6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(13f, 9f)
                close()
            }
        }.also { _ClockSevenThirty = it}
