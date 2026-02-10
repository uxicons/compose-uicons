package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCall: ImageVector? = null

val Icons.Rs.CalendarCall: ImageVector
    get() = _CalendarCall ?: UXIcon(name = "CalendarCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 19.11f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -1.25f, 0.8f, -1.96f, 0.8f)
                curveToRelative(-3.63f, 0f, -8.66f, -4.75f, -8.66f, -8.66f)
                curveToRelative(0f, -0.71f, 0.26f, -1.42f, 0.8f, -1.96f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(0.88f, 2.19f, 2.38f, 3.63f, 4.4f, 4.4f)
                lineToRelative(1.77f, -1.77f)
                horizontalLineToRelative(0f)
                close()
                moveTo(24f, 5.0f)
                verticalLineToRelative(14.0f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-7.0f)
                lineTo(2f, 10.0f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(11.04f)
                curveToRelative(0.68f, 0.74f, 1.43f, 1.42f, 2.23f, 2f)
                lineTo(0f, 24.0f)
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
                moveTo(22f, 8.0f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(20f)
                close()
            }
        }.also { _CalendarCall = it}
