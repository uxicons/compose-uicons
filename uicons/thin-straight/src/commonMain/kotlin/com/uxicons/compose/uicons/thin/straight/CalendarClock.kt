package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarClock: ImageVector? = null

val Icons.Ts.CalendarClock: ImageVector
    get() = _CalendarClock ?: UXIcon(name = "CalendarClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(18f, 17.29f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineToRelative(-3.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.79f)
                close()
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
                lineTo(12.03f, 24f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                lineTo(1f, 23f)
                lineTo(1f, 9f)
                lineTo(23f, 9f)
                verticalLineToRelative(2.03f)
                curveToRelative(0.36f, 0.31f, 0.69f, 0.64f, 1f, 1.0f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                close()
            }
        }.also { _CalendarClock = it}
