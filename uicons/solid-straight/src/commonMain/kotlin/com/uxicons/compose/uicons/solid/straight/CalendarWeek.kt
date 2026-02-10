package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarWeek: ImageVector? = null

val Icons.Ss.CalendarWeek: ImageVector
    get() = _CalendarWeek ?: UXIcon(name = "CalendarWeek") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(19f, 15f)
                lineTo(5f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(24f)
                close()
                moveTo(21f, 13f)
                lineTo(3f, 13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _CalendarWeek = it}
