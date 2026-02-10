package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeWatchCalendar: ImageVector? = null

val Icons.Ts.TimeWatchCalendar: ImageVector
    get() = _TimeWatchCalendar ?: UXIcon(name = "TimeWatchCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 21.88f)
                verticalLineToRelative(1.01f)
                curveTo(4.37f, 22.15f, 0f, 17.33f, 0f, 11.5f)
                curveTo(0f, 5.16f, 5.16f, 0f, 11.5f, 0f)
                curveToRelative(5.83f, 0f, 10.65f, 4.37f, 11.39f, 10f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.73f, -5.08f, -5.1f, -9f, -10.38f, -9f)
                curveTo(5.71f, 1f, 1f, 5.71f, 1f, 11.5f)
                curveToRelative(0f, 5.28f, 3.92f, 9.65f, 9f, 10.38f)
                close()
                moveTo(11f, 11.21f)
                lineToRelative(-4.24f, 2.36f)
                lineToRelative(0.49f, 0.87f)
                lineToRelative(4.76f, -2.64f)
                verticalLineToRelative(-6.79f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.21f)
                close()
                moveTo(24f, 15.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23f, 18.0f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5f)
                close()
                moveTo(23f, 15.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _TimeWatchCalendar = it}
