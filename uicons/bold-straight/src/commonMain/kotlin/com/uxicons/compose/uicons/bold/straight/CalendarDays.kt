package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarDays: ImageVector? = null

val Icons.Bs.CalendarDays: ImageVector
    get() = _CalendarDays ?: UXIcon(name = "CalendarDays") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 2f)
                horizontalLineToRelative(-1.5f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(3f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(14f, 17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 14f)
                lineTo(3f, 14f)
                verticalLineToRelative(-4f)
                lineTo(7f, 10f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(3f, 17f)
                lineTo(7f, 17f)
                verticalLineToRelative(4f)
                lineTo(3f, 21f)
                verticalLineToRelative(-4f)
                close()
                moveTo(17f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _CalendarDays = it}
