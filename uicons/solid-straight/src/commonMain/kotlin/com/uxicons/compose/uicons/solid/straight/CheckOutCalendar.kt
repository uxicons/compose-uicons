package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckOutCalendar: ImageVector? = null

val Icons.Ss.CheckOutCalendar: ImageVector
    get() = _CheckOutCalendar ?: UXIcon(name = "CheckOutCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 8f)
                verticalLineToRelative(-3f)
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
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(24f)
                close()
                moveTo(11f, 16f)
                lineTo(3.05f, 16f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-0.73f, 0.73f, -0.73f, 1.92f, 0f, 2.65f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.57f, -1.57f)
                horizontalLineToRelative(7.95f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _CheckOutCalendar = it}
