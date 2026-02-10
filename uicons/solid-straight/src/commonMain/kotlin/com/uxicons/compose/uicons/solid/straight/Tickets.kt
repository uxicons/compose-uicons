package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tickets: ImageVector? = null

val Icons.Ss.Tickets: ImageVector
    get() = _Tickets ?: UXIcon(name = "Tickets") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 24f)
                lineTo(7f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                close()
                moveTo(16f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-3f)
                curveTo(2.35f, 0f, 1f, 1.35f, 1f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                verticalLineToRelative(1f)
                reflectiveCurveToRelative(3f, 0f, 3f, 0f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Tickets = it}
