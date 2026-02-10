package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Rs.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(19f)
                lineTo(0f, 24f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 21.97f)
                lineToRelative(8.38f, -8.38f)
                lineToRelative(4f, 4f)
                lineToRelative(7.58f, -7.59f)
                lineTo(2f, 10f)
                verticalLineToRelative(11.97f)
                close()
                moveTo(22f, 12.8f)
                lineToRelative(-7.62f, 7.62f)
                lineToRelative(-4f, -4f)
                lineToRelative(-5.59f, 5.59f)
                horizontalLineToRelative(17.2f)
                verticalLineToRelative(-9.2f)
                close()
                moveTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _CalendarImage = it}
