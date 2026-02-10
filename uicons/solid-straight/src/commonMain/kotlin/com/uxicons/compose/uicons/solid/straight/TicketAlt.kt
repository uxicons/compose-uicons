package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketAlt: ImageVector? = null

val Icons.Ss.TicketAlt: ImageVector
    get() = _TicketAlt ?: UXIcon(name = "TicketAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-4f)
                lineToRelative(1.1f, 0.0f)
                curveToRelative(1.1f, -0.03f, 1.99f, -0.85f, 1.99f, -1.96f)
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
            }
        }.also { _TicketAlt = it}
