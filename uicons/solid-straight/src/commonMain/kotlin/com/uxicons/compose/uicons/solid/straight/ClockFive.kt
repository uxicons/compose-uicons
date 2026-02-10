package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFive: ImageVector? = null

val Icons.Ss.ClockFive: ImageVector
    get() = _ClockFive ?: UXIcon(name = "ClockFive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(15.4f, 15.8f)
                lineToRelative(-2.4f, -4.08f)
                lineTo(13f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.27f)
                lineToRelative(2.67f, 4.54f)
                lineToRelative(1.73f, -1.01f)
                close()
            }
        }.also { _ClockFive = it}
