package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckInCalendar: ImageVector? = null

val Icons.Bs.CheckInCalendar: ImageVector
    get() = _CheckInCalendar ?: UXIcon(name = "CheckInCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(19f)
                horizontalLineTo(0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-11f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6.98f, 19.48f)
                lineToRelative(3.65f, -3.16f)
                curveToRelative(0.49f, -0.44f, 0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(-3.65f, -3.18f)
                verticalLineToRelative(2.52f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(2.48f)
                close()
            }
        }.also { _CheckInCalendar = it}
