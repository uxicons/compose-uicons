package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketAlt: ImageVector? = null

val Icons.Ts.TicketAlt: ImageVector
    get() = _TicketAlt ?: UXIcon(name = "TicketAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 21f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 21f, -0.0f, 19.88f, -0.0f, 18.5f)
                curveToRelative(-0.0f, -1.13f, -0.0f, -2.43f, -0.0f, -3.06f)
                verticalLineToRelative(-0.43f)
                lineToRelative(0.43f, -0.06f)
                curveToRelative(1.47f, -0.21f, 2.58f, -1.48f, 2.58f, -2.96f)
                reflectiveCurveToRelative(-1.11f, -2.75f, -2.58f, -2.96f)
                lineToRelative(-0.43f, -0.06f)
                verticalLineToRelative(-0.43f)
                curveToRelative(-0.0f, -0.84f, 0.0f, -3.05f, 0.0f, -3.05f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineTo(21.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3.48f)
                lineToRelative(-0.43f, 0.06f)
                curveToRelative(-1.47f, 0.21f, -2.57f, 1.48f, -2.57f, 2.96f)
                reflectiveCurveToRelative(1.1f, 2.74f, 2.57f, 2.96f)
                lineToRelative(0.43f, 0.06f)
                verticalLineToRelative(3.48f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(0.99f, 15.86f)
                curveToRelative(0f, 0.69f, 0f, 1.73f, 0.0f, 2.64f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.64f)
                curveToRelative(-1.74f, -0.45f, -3f, -2.04f, -3f, -3.86f)
                reflectiveCurveToRelative(1.26f, -3.41f, 3f, -3.86f)
                verticalLineToRelative(-2.64f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.0f, -0.01f, 1.65f, -0.01f, 2.64f)
                curveToRelative(1.74f, 0.45f, 3.01f, 2.04f, 3.01f, 3.86f)
                reflectiveCurveToRelative(-1.26f, 3.41f, -3.01f, 3.86f)
                close()
            }
        }.also { _TicketAlt = it}
