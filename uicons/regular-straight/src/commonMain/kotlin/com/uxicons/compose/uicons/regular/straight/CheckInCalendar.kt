package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckInCalendar: ImageVector? = null

val Icons.Rs.CheckInCalendar: ImageVector
    get() = _CheckInCalendar ?: UXIcon(name = "CheckInCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 22f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                lineTo(2f, 8f)
                close()
                moveTo(7.95f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.95f)
                lineToRelative(-1.57f, -1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.73f, 0.73f, 0.73f, 1.92f, 0f, 2.65f)
                lineToRelative(-2.66f, 2.66f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.57f, -1.57f)
                close()
            }
        }.also { _CheckInCalendar = it}
