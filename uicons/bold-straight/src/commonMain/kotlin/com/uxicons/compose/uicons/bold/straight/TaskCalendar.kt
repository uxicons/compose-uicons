package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TaskCalendar: ImageVector? = null

val Icons.Bs.TaskCalendar: ImageVector
    get() = _TaskCalendar ?: UXIcon(name = "TaskCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 21f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-18.5f)
                horizontalLineToRelative(5.34f)
                curveToRelative(0.56f, -1.18f, 1.77f, -2f, 3.16f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.39f, 0f, 2.6f, 0.82f, 3.16f, 2f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _TaskCalendar = it}
