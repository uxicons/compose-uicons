package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeWatchCalendar: ImageVector? = null

val Icons.Ss.TimeWatchCalendar: ImageVector
    get() = _TimeWatchCalendar ?: UXIcon(name = "TimeWatchCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.41f)
                lineToRelative(-4.01f, 2.11f)
                lineToRelative(0.97f, 1.75f)
                lineToRelative(5.04f, -2.68f)
                verticalLineToRelative(0.95f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.99f, -2f, 3.46f)
                verticalLineToRelative(5.95f)
                curveToRelative(-0.83f, -0.07f, -1.65f, -0.24f, -2.44f, -0.5f)
                curveTo(3.04f, 19.96f, 0f, 15.76f, 0f, 11f)
                curveTo(0f, 4.93f, 4.93f, 0f, 11f, 0f)
                curveToRelative(5.02f, 0f, 9.4f, 3.39f, 10.65f, 8.25f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0.0f)
                curveToRelative(0.15f, 0.57f, 0.23f, 1.16f, 0.28f, 1.75f)
                horizontalLineToRelative(-9.94f)
                close()
                moveTo(24f, 17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                close()
                moveTo(12f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _TimeWatchCalendar = it}
