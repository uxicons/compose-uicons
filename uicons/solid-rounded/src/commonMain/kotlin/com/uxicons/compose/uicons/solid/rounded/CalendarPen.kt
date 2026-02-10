package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPen: ImageVector? = null

val Icons.Sr.CalendarPen: ImageVector
    get() = _CalendarPen ?: UXIcon(name = "CalendarPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(1.46f)
                curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.9f, -0.9f, 0.9f, -2.35f, 0f, -3.25f)
                curveToRelative(-0.9f, -0.9f, -2.35f, -0.9f, -3.25f, 0f)
                lineToRelative(-6.81f, 6.81f)
                close()
                moveTo(24f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(-1f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(1f)
                lineTo(6f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                close()
                moveTo(0f, 10f)
                lineTo(21.36f, 10f)
                curveToRelative(-0.84f, 0.1f, -1.67f, 0.48f, -2.39f, 1.21f)
                lineToRelative(-7.21f, 7.21f)
                curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
                verticalLineToRelative(1.34f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 10f)
                close()
            }
        }.also { _CalendarPen = it}
