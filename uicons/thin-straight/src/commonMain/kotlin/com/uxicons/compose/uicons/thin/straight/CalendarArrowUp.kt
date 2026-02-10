package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarArrowUp: ImageVector? = null

val Icons.Ts.CalendarArrowUp: ImageVector
    get() = _CalendarArrowUp ?: UXIcon(name = "CalendarArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.11f, 15.48f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.77f, -0.77f, 2.02f, -0.77f, 2.79f, 0f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.2f, -3.2f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.11f, -0.19f, -0.15f)
                verticalLineToRelative(8.87f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.87f)
                curveToRelative(-0.07f, 0.04f, -0.13f, 0.09f, -0.19f, 0.15f)
                lineToRelative(-3.2f, 3.2f)
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
                verticalLineToRelative(14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-14f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _CalendarArrowUp = it}
