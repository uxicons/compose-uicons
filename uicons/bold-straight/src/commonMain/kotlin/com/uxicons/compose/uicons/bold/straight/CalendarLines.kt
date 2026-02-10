package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLines: ImageVector? = null

val Icons.Bs.CalendarLines: ImageVector
    get() = _CalendarLines ?: UXIcon(name = "CalendarLines") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                lineTo(6f, 14f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                lineTo(6f, 16f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(21f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                lineTo(21f, 21f)
                close()
            }
        }.also { _CalendarLines = it}
