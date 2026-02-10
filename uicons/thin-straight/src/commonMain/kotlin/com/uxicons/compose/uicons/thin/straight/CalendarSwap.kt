package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Ts.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.85f, 11.65f)
                lineToRelative(3.35f, 3.35f)
                lineTo(7f, 15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7.79f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(10.15f, 20.35f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.65f, -1.65f)
                horizontalLineToRelative(7.79f)
                verticalLineToRelative(-1f)
                lineTo(6.79f, 17f)
                lineToRelative(3.35f, 3.35f)
                close()
                moveTo(24f, 4.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(1f)
                lineTo(7f, 2f)
                horizontalLineToRelative(10f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 4.5f)
                verticalLineToRelative(3.5f)
                lineTo(23f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 23f)
                lineTo(23f, 9f)
                lineTo(1f, 9f)
                verticalLineToRelative(14f)
                lineTo(23f, 23f)
                close()
            }
        }.also { _CalendarSwap = it}
