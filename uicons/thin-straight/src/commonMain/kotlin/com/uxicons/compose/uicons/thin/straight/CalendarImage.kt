package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Ts.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(19.5f)
                lineTo(0f, 24f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 9f)
                lineTo(1f, 9f)
                verticalLineToRelative(13.79f)
                lineToRelative(8.94f, -8.94f)
                lineToRelative(4.44f, 4.44f)
                lineToRelative(8.62f, -8.62f)
                verticalLineToRelative(-0.68f)
                close()
                moveTo(1f, 4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 23f)
                verticalLineToRelative(-11.91f)
                lineToRelative(-8.62f, 8.62f)
                lineToRelative(-4.44f, -4.44f)
                lineToRelative(-7.74f, 7.74f)
                horizontalLineToRelative(20.79f)
                close()
            }
        }.also { _CalendarImage = it}
