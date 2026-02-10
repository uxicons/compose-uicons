package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLines: ImageVector? = null

val Icons.Rs.CalendarLines: ImageVector
    get() = _CalendarLines ?: UXIcon(name = "CalendarLines") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
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
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 4f)
                lineTo(21f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                lineTo(2f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 10f)
                lineTo(22f, 10f)
                verticalLineToRelative(12f)
                lineTo(2f, 22f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _CalendarLines = it}
