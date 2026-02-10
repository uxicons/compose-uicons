package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockElevenThirty: ImageVector? = null

val Icons.Ss.ClockElevenThirty: ImageVector
    get() = _ClockElevenThirty ?: UXIcon(name = "ClockElevenThirty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.67f)
                lineToRelative(-2.8f, -3.73f)
                lineToRelative(1.6f, -1.2f)
                lineToRelative(3.2f, 4.27f)
                verticalLineToRelative(7.33f)
                close()
            }
        }.also { _ClockElevenThirty = it}
