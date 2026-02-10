package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarClock: ImageVector? = null

val Icons.Bs.CalendarClock: ImageVector
    get() = _CalendarClock ?: UXIcon(name = "CalendarClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                verticalLineToRelative(6.53f)
                curveToRelative(-0.81f, -0.96f, -1.84f, -1.74f, -3f, -2.27f)
                verticalLineToRelative(-0.76f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.53f, 1.16f, 1.3f, 2.19f, 2.27f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(20.9f, 18.78f)
                lineToRelative(-1.9f, -1.9f)
                verticalLineToRelative(-2.88f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.12f)
                lineToRelative(2.78f, 2.78f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _CalendarClock = it}
