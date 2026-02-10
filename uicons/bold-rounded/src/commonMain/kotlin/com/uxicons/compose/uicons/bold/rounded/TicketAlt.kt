package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketAlt: ImageVector? = null

val Icons.Br.TicketAlt: ImageVector
    get() = _TicketAlt ?: UXIcon(name = "TicketAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 21f)
            horizontalLineTo(5.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.85f, 0f, 1.52f, -0.67f, 1.52f, -1.52f)
            curveToRelative(0f, -0.84f, -0.65f, -1.48f, -1.52f, -1.48f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(3.1f, 16.21f)
            curveToRelative(0.31f, 1.03f, 1.26f, 1.79f, 2.4f, 1.79f)
            horizontalLineToRelative(13f)
            curveToRelative(1.13f, 0f, 2.09f, -0.76f, 2.4f, -1.79f)
            curveToRelative(-1.69f, -0.65f, -2.9f, -2.29f, -2.9f, -4.21f)
            reflectiveCurveToRelative(1.21f, -3.56f, 2.9f, -4.21f)
            curveToRelative(-0.3f, -1.04f, -1.26f, -1.79f, -2.4f, -1.79f)
            horizontalLineTo(5.5f)
            curveToRelative(-1.13f, 0f, -2.08f, 0.75f, -2.4f, 1.78f)
            curveToRelative(1.72f, 0.63f, 2.92f, 2.25f, 2.92f, 4.2f)
            curveToRelative(0f, 1.93f, -1.21f, 3.58f, -2.92f, 4.23f)
            close()
        }
    }.also { _TicketAlt = it }
