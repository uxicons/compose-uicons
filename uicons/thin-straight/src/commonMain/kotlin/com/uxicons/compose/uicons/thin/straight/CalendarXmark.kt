package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarXmark: ImageVector? = null

val Icons.Ts.CalendarXmark: ImageVector
    get() = _CalendarXmark ?: UXIcon(name = "CalendarXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(14f)
                lineTo(1f, 23f)
                close()
                moveTo(15.85f, 12.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _CalendarXmark = it}
