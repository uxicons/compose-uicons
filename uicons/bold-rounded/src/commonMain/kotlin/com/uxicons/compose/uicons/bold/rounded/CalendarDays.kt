package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarDays: ImageVector? = null

val Icons.Br.CalendarDays: ImageVector
    get() = _CalendarDays ?: UXIcon(name = "CalendarDays") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 2.02f)
            verticalLineToRelative(-0.52f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            lineTo(8f, 2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.52f)
            curveTo(2.2f, 2.28f, 0f, 4.64f, 0f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.48f)
            close()
            moveTo(10f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(14f, 17f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
            moveTo(3f, 10f)
            lineTo(7f, 10f)
            verticalLineToRelative(4f)
            lineTo(3f, 14f)
            verticalLineToRelative(-4f)
            close()
            moveTo(17f, 10f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            close()
            moveTo(5.5f, 5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
            lineTo(3.05f, 7f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-1.5f)
            lineTo(7f, 17f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _CalendarDays = it }
