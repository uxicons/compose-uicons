package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketAlt: ImageVector? = null

val Icons.Rs.TicketAlt: ImageVector
    get() = _TicketAlt ?: UXIcon(name = "TicketAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-3.92f)
                lineToRelative(1.1f, 0.0f)
                curveToRelative(1.1f, -0.03f, 1.99f, -0.93f, 1.99f, -2.04f)
                reflectiveCurveToRelative(-0.88f, -2.01f, -1.98f, -2.04f)
                lineToRelative(-1.1f, 0.0f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineTo(21f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.89f)
                curveToRelative(-1.0f, 0f, -1.92f, 0.68f, -2.08f, 1.66f)
                curveToRelative(-0.21f, 1.25f, 0.76f, 2.34f, 1.97f, 2.34f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                close()
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.13f)
                curveToRelative(-1.72f, -0.45f, -3f, -2.01f, -3f, -3.87f)
                reflectiveCurveToRelative(1.28f, -3.43f, 3f, -3.87f)
                verticalLineToRelative(-2.13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.12f)
                curveToRelative(1.77f, 0.43f, 3.08f, 2.03f, 3.08f, 3.93f)
                reflectiveCurveToRelative(-1.31f, 3.49f, -3.08f, 3.93f)
                verticalLineToRelative(2.03f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _TicketAlt = it}
