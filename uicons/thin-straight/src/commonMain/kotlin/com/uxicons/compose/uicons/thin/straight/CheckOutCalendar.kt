package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckOutCalendar: ImageVector? = null

val Icons.Ts.CheckOutCalendar: ImageVector
    get() = _CheckOutCalendar ?: UXIcon(name = "CheckOutCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2.5f)
                horizontalLineToRelative(-3.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.5f)
                lineTo(7f, 2.5f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.08f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-2.58f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(13.5f)
                lineTo(1f, 23f)
                verticalLineToRelative(-2.08f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(4.08f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 8.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8.5f)
                close()
                moveTo(3.97f, 13.35f)
                lineToRelative(-2.65f, 2.65f)
                horizontalLineToRelative(9.68f)
                verticalLineToRelative(1f)
                lineTo(1.32f, 17f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.84f, -2.84f)
                curveToRelative(-0.27f, -0.27f, -0.42f, -0.63f, -0.42f, -1.01f)
                reflectiveCurveToRelative(0.15f, -0.74f, 0.42f, -1.01f)
                lineToRelative(2.84f, -2.84f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _CheckOutCalendar = it}
