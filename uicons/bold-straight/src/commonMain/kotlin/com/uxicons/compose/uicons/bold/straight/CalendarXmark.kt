package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarXmark: ImageVector? = null

val Icons.Bs.CalendarXmark: ImageVector
    get() = _CalendarXmark ?: UXIcon(name = "CalendarXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                lineTo(3f, 21f)
                close()
                moveTo(16.24f, 12.77f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _CalendarXmark = it}
