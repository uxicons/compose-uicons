package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketAlt: ImageVector? = null

val Icons.Rr.TicketAlt: ImageVector
    get() = _TicketAlt ?: UXIcon(name = "TicketAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-0.92f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.02f, 0f, 0.05f, 0.0f, 0.08f, 0.0f)
                curveToRelative(1.11f, -0.02f, 2f, -0.93f, 2f, -2.04f)
                reflectiveCurveToRelative(-0.89f, -2.02f, -2f, -2.04f)
                curveToRelative(-0.03f, 0.0f, -0.06f, 0.0f, -0.08f, 0.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.0f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(2f, 15.97f)
                verticalLineToRelative(0.03f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-0.13f)
                curveToRelative(-1.72f, -0.45f, -3f, -2.01f, -3f, -3.87f)
                reflectiveCurveToRelative(1.28f, -3.43f, 3f, -3.87f)
                verticalLineToRelative(-0.13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(0.12f)
                curveToRelative(1.77f, 0.43f, 3.08f, 2.03f, 3.08f, 3.93f)
                reflectiveCurveToRelative(-1.31f, 3.49f, -3.08f, 3.93f)
                close()
            }
        }.also { _TicketAlt = it}
