package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarClock: ImageVector? = null

val Icons.Rs.CalendarClock: ImageVector
    get() = _CalendarClock ?: UXIcon(name = "CalendarClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(18f, 16.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(6.35f)
                curveToRelative(-0.57f, -0.7f, -1.25f, -1.31f, -2f, -1.82f)
                lineTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(15f)
                curveToRelative(-2.14f, 0f, -4.11f, 0.75f, -5.65f, 2f)
                lineTo(2f, 10f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.52f)
                curveToRelative(0.51f, 0.76f, 1.12f, 1.43f, 1.83f, 2f)
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
            }
        }.also { _CalendarClock = it}
