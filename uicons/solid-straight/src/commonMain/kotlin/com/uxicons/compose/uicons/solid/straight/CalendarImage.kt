package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Ss.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.97f, 13.59f)
                lineToRelative(4f, 4f)
                lineToRelative(7.59f, -7.59f)
                lineTo(0f, 10f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(0.05f)
                lineToRelative(9.91f, -9.91f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3.5f)
                curveTo(0f, 2.85f, 1.35f, 1.5f, 3f, 1.5f)
                horizontalLineToRelative(3f)
                lineTo(6f, -0.5f)
                horizontalLineToRelative(2f)
                lineTo(8f, 1.5f)
                horizontalLineToRelative(8f)
                lineTo(16f, -0.5f)
                horizontalLineToRelative(2f)
                lineTo(18f, 1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24f, 10.38f)
                verticalLineToRelative(13.12f)
                lineTo(2.88f, 23.5f)
                lineToRelative(7.09f, -7.09f)
                lineToRelative(4f, 4f)
                lineToRelative(10.03f, -10.03f)
                close()
            }
        }.also { _CalendarImage = it}
