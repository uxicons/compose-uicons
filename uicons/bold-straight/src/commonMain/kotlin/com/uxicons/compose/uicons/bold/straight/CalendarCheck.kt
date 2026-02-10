package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCheck: ImageVector? = null

val Icons.Bs.CalendarCheck: ImageVector
    get() = _CalendarCheck ?: UXIcon(name = "CalendarCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.95f, 10.93f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-5.29f, 5.21f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.76f, 0.72f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.78f, -2.69f)
                lineToRelative(2.09f, -2.15f)
                lineToRelative(2.45f, 2.38f)
                lineToRelative(4.95f, -4.87f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(21f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(12f)
                lineTo(21f, 21f)
                close()
            }
        }.also { _CalendarCheck = it}
