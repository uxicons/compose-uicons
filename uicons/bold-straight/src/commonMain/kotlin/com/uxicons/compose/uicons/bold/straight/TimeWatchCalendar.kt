package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeWatchCalendar: ImageVector? = null

val Icons.Bs.TimeWatchCalendar: ImageVector
    get() = _TimeWatchCalendar ?: UXIcon(name = "TimeWatchCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(9f, 5.36f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.03f)
                lineToRelative(-4.63f, 2.57f)
                lineToRelative(-1.46f, -2.62f)
                lineToRelative(3.09f, -1.72f)
                verticalLineToRelative(-4.26f)
                close()
                moveTo(10f, 17.98f)
                verticalLineToRelative(3f)
                curveToRelative(-5.56f, -0.26f, -10f, -4.85f, -10f, -10.47f)
                curveTo(0f, 4.71f, 4.71f, 0f, 10.5f, 0f)
                curveToRelative(5.62f, 0f, 10.21f, 4.44f, 10.47f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.26f, -3.9f, -3.51f, -7f, -7.47f, -7f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                curveToRelative(0f, 3.97f, 3.1f, 7.22f, 7f, 7.47f)
                close()
            }
        }.also { _TimeWatchCalendar = it}
