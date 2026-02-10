package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarExclamation: ImageVector? = null

val Icons.Bs.CalendarExclamation: ImageVector
    get() = _CalendarExclamation ?: UXIcon(name = "CalendarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                lineTo(24f, 24f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(21f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
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
                moveTo(10.5f, 19f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                close()
                moveTo(10.5f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _CalendarExclamation = it}
