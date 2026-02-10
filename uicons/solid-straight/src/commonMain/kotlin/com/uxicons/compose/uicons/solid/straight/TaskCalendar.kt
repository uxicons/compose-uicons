package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TaskCalendar: ImageVector? = null

val Icons.Ss.TaskCalendar: ImageVector
    get() = _TaskCalendar ?: UXIcon(name = "TaskCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-5f)
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
                close()
                moveTo(12.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineToRelative(-5.17f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.56f)
                curveToRelative(0.35f, -0.6f, 0.85f, -1.07f, 1.45f, -1.42f)
                verticalLineToRelative(-0.58f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-8f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14f, 8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _TaskCalendar = it}
