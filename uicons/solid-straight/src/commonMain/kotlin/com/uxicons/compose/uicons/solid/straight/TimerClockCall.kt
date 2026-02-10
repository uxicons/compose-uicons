package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimerClockCall: ImageVector? = null

val Icons.Ss.TimerClockCall: ImageVector
    get() = _TimerClockCall ?: UXIcon(name = "TimerClockCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.61f, 12.85f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                close()
                moveTo(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                close()
                moveTo(20.29f, 7.71f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _TimerClockCall = it}
