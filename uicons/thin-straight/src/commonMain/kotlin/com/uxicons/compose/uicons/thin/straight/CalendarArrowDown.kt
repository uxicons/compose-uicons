package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarArrowDown: ImageVector? = null

val Icons.Ts.CalendarArrowDown: ImageVector
    get() = _CalendarArrowDown ?: UXIcon(name = "CalendarArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(14f)
                lineTo(1f, 23f)
                close()
                moveTo(15.89f, 16.52f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.2f, 3.2f)
                curveToRelative(-0.38f, 0.38f, -0.89f, 0.58f, -1.39f, 0.58f)
                reflectiveCurveToRelative(-1.01f, -0.19f, -1.39f, -0.58f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.11f, 0.19f, 0.15f)
                verticalLineToRelative(-8.87f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8.87f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.09f, 0.19f, -0.15f)
                lineToRelative(3.2f, -3.2f)
                close()
            }
        }.also { _CalendarArrowDown = it}
