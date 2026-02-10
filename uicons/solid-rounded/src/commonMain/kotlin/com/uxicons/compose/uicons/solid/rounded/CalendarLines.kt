package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLines: ImageVector? = null

val Icons.Sr.CalendarLines: ImageVector
    get() = _CalendarLines ?: UXIcon(name = "CalendarLines") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
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
                lineTo(0f, 8f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 10f)
                lineTo(24f, 10f)
                close()
                moveTo(12f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(6f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(6f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _CalendarLines = it}
