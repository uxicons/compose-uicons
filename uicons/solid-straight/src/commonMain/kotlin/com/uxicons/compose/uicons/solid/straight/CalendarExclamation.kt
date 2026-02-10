package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarExclamation: ImageVector? = null

val Icons.Ss.CalendarExclamation: ImageVector
    get() = _CalendarExclamation ?: UXIcon(name = "CalendarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                verticalLineToRelative(3f)
                lineTo(9f, 8f)
                verticalLineToRelative(2f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                lineTo(24f, 24f)
                lineTo(24f, 10f)
                lineTo(15f, 10f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _CalendarExclamation = it}
