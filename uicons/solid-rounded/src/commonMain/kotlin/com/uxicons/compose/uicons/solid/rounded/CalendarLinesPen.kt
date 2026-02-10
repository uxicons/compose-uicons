package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarLinesPen: ImageVector? = null

val Icons.Sr.CalendarLinesPen: ImageVector
    get() = _CalendarLinesPen ?: UXIcon(name = "CalendarLinesPen") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(10f, 22.55f)
                curveToRelative(0f, -0.89f, 0.19f, -1.75f, 0.54f, -2.54f)
                lineTo(6f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(0f, 0f, 4.02f, 0f, 5.92f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(6f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(15.92f, 14f)
                lineToRelative(2.74f, -2.74f)
                curveToRelative(0.81f, -0.81f, 1.89f, -1.26f, 3.04f, -1.26f)
                lineTo(0f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.46f)
                close()
                moveTo(20.08f, 12.67f)
                curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.25f, 0f)
                curveToRelative(0.9f, 0.9f, 0.9f, 2.35f, 0f, 3.25f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
                horizontalLineToRelative(-1.46f)
                verticalLineToRelative(-1.46f)
                curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
                lineToRelative(6.81f, -6.81f)
                close()
            }
        }.also { _CalendarLinesPen = it}
