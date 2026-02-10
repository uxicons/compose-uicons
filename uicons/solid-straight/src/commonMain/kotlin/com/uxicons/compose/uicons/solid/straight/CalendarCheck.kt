package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCheck: ImageVector? = null

val Icons.Ss.CalendarCheck: ImageVector
    get() = _CalendarCheck ?: UXIcon(name = "CalendarCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 10f)
                verticalLineToRelative(14f)
                lineTo(24f, 24f)
                lineTo(24f, 10f)
                lineTo(0f, 10f)
                close()
                moveTo(11.91f, 20.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.58f)
                lineToRelative(-2.78f, -2.7f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.79f, 2.71f)
                lineToRelative(5.81f, -5.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-5.79f, 5.71f)
                close()
                moveTo(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
            }
        }.also { _CalendarCheck = it}
