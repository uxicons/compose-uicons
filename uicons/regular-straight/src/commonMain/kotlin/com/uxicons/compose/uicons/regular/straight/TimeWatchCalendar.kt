package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeWatchCalendar: ImageVector? = null

val Icons.Rs.TimeWatchCalendar: ImageVector
    get() = _TimeWatchCalendar ?: UXIcon(name = "TimeWatchCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 5.86f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.73f)
                lineToRelative(-4.37f, 2.43f)
                lineToRelative(-0.97f, -1.75f)
                lineToRelative(3.34f, -1.86f)
                verticalLineToRelative(-4.55f)
                close()
                moveTo(2f, 11f)
                curveTo(2f, 6.04f, 6.04f, 2f, 11f, 2f)
                curveToRelative(4.11f, 0f, 7.69f, 2.77f, 8.72f, 6.75f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0.0f)
                curveToRelative(0.11f, 0.41f, 0.17f, 0.83f, 0.22f, 1.25f)
                horizontalLineToRelative(2f)
                curveToRelative(-0.05f, -0.59f, -0.14f, -1.18f, -0.28f, -1.75f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, -0.0f)
                curveTo(20.4f, 3.39f, 16.02f, 0f, 11f, 0f)
                curveTo(4.93f, 0f, 0f, 4.93f, 0f, 11f)
                curveToRelative(0f, 4.76f, 3.04f, 8.96f, 7.56f, 10.45f)
                curveToRelative(0.79f, 0.26f, 1.61f, 0.43f, 2.44f, 0.5f)
                verticalLineToRelative(-2.03f)
                curveToRelative(-0.62f, -0.07f, -1.23f, -0.18f, -1.82f, -0.37f)
                curveToRelative(-3.7f, -1.22f, -6.18f, -4.65f, -6.18f, -8.55f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(22f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _TimeWatchCalendar = it}
