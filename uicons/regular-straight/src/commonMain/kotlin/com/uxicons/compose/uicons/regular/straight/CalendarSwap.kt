package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarSwap: ImageVector? = null

val Icons.Rs.CalendarSwap: ImageVector
    get() = _CalendarSwap ?: UXIcon(name = "CalendarSwap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.96f, 10.79f)
                lineToRelative(4.21f, 4.21f)
                lineTo(7f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.34f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(11.04f, 21.21f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.79f, -0.79f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(-2f)
                lineTo(6.84f, 17f)
                lineToRelative(4.21f, 4.21f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 5f)
                verticalLineToRelative(3f)
                lineTo(22f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 22f)
                lineTo(22f, 10f)
                lineTo(2f, 10f)
                verticalLineToRelative(12f)
                lineTo(22f, 22f)
                close()
            }
        }.also { _CalendarSwap = it}
