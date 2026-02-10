package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLinesPen: ImageVector? = null

val Icons.Ss.CalendarLinesPen: ImageVector
    get() = _CalendarLinesPen ?: UXIcon(name = "CalendarLinesPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 8f)
                lineTo(-0.0f, 8f)
                verticalLineToRelative(-3f)
                curveTo(-0.0f, 3.35f, 1.34f, 2f, 3.0f, 2f)
                horizontalLineToRelative(3f)
                lineTo(6.0f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8.0f, 2f)
                lineTo(16.0f, 2f)
                lineTo(16.0f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18.0f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                close()
                moveTo(23.26f, 12.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.79f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
                moveTo(11.58f, 18f)
                lineToRelative(2f, -2f)
                lineTo(5f, 16f)
                verticalLineToRelative(-2f)
                lineTo(15.58f, 14f)
                lineToRelative(2.67f, -2.67f)
                curveToRelative(0.85f, -0.86f, 2.0f, -1.33f, 3.21f, -1.33f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                lineTo(10f, 24f)
                verticalLineToRelative(-4f)
                lineTo(5f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.58f)
                close()
            }
        }.also { _CalendarLinesPen = it}
