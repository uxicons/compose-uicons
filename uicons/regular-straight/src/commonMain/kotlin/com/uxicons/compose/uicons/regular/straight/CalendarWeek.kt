package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarWeek: ImageVector? = null

val Icons.Rs.CalendarWeek: ImageVector
    get() = _CalendarWeek ?: UXIcon(name = "CalendarWeek") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 18f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6f)
                lineTo(4f, 12f)
                verticalLineToRelative(6f)
                close()
                moveTo(6f, 14f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                lineTo(6f, 16f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                lineTo(2f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 22f)
                close()
            }
        }.also { _CalendarWeek = it}
