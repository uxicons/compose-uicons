package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarEventTax: ImageVector? = null

val Icons.Bs.CalendarEventTax: ImageVector
    get() = _CalendarEventTax ?: UXIcon(name = "CalendarEventTax") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(16.45f, 17.63f)
                lineToRelative(1.45f, 6.37f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(-0.33f, -1.4f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(-0.33f, 1.4f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(1.48f, -6.42f)
                curveToRelative(0.13f, -0.58f, 0.78f, -1.58f, 1.88f, -1.58f)
                reflectiveCurveToRelative(1.75f, 0.96f, 1.89f, 1.63f)
                close()
                moveTo(15.59f, 21f)
                lineToRelative(-0.7f, -3.02f)
                curveToRelative(-0.05f, -0.21f, -0.1f, -0.38f, -0.33f, -0.38f)
                reflectiveCurveToRelative(-0.29f, 0.19f, -0.32f, 0.32f)
                lineToRelative(-0.73f, 3.08f)
                horizontalLineToRelative(2.08f)
                close()
                moveTo(11.3f, 17.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22.19f, 16f)
                lineToRelative(-1.09f, 2.18f)
                lineToRelative(-1.09f, -2.18f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(1.99f, 4f)
                lineToRelative(-1.99f, 4f)
                horizontalLineToRelative(1.81f)
                lineToRelative(1.09f, -2.18f)
                lineToRelative(1.09f, 2.18f)
                horizontalLineToRelative(1.81f)
                lineToRelative(-1.99f, -4f)
                lineToRelative(1.99f, -4f)
                horizontalLineToRelative(-1.81f)
                close()
            }
        }.also { _CalendarEventTax = it}
