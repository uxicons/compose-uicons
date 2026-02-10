package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLines: ImageVector? = null

val Icons.Ts.CalendarLines: ImageVector
    get() = _CalendarLines ?: UXIcon(name = "CalendarLines") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 9f)
                lineTo(23f, 9f)
                verticalLineToRelative(14f)
                lineTo(1f, 23f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                lineTo(5f, 14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                lineTo(5f, 19f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _CalendarLines = it}
