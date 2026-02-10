package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarDay: ImageVector? = null

val Icons.Ss.CalendarDay: ImageVector
    get() = _CalendarDay ?: UXIcon(name = "CalendarDay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.0f, 8f)
                verticalLineToRelative(-3f)
                curveTo(0.0f, 3.35f, 1.35f, 2f, 3.0f, 2f)
                horizontalLineToRelative(3f)
                lineTo(6.0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16.0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0.0f, 8f)
                close()
                moveTo(7f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24.0f, 10f)
                verticalLineToRelative(14f)
                lineTo(0.0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(24f)
                close()
                moveTo(9f, 13f)
                lineTo(3f, 13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _CalendarDay = it}
