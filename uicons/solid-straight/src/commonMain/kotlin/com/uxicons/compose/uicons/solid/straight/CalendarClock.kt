package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarClock: ImageVector? = null

val Icons.Ss.CalendarClock: ImageVector
    get() = _CalendarClock ?: UXIcon(name = "CalendarClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3f)
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
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(19.71f, 18.29f)
                lineToRelative(-1.71f, -1.71f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(8f, 17f)
                curveToRelative(0f, -2.83f, 1.31f, -5.35f, 3.35f, -7f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                lineTo(11.35f, 24f)
                curveToRelative(-2.04f, -1.65f, -3.35f, -4.17f, -3.35f, -7f)
                close()
            }
        }.also { _CalendarClock = it}
