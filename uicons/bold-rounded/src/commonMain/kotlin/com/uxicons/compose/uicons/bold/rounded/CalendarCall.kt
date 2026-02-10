package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCall: ImageVector? = null

val Icons.Br.CalendarCall: ImageVector
    get() = _CalendarCall ?: UXIcon(name = "CalendarCall") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 7.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            lineTo(3f, 9f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 7.5f)
            curveTo(0f, 4.47f, 2.47f, 2f, 5.5f, 2f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(22.36f, 19.76f)
            curveToRelative(-0.45f, -0.45f, -1.17f, -0.45f, -1.62f, 0f)
            lineToRelative(-1.04f, 1.02f)
            curveToRelative(-2.07f, -0.79f, -3.6f, -2.26f, -4.5f, -4.5f)
            lineToRelative(1.02f, -1.04f)
            curveToRelative(0.45f, -0.45f, 0.45f, -1.17f, 0f, -1.62f)
            lineToRelative(-1.21f, -1.3f)
            curveToRelative(-0.45f, -0.45f, -1.17f, -0.45f, -1.62f, 0f)
            lineToRelative(-0.6f, 0.52f)
            curveToRelative(-0.55f, 0.55f, -0.81f, 1.28f, -0.81f, 2f)
            curveToRelative(0f, 4f, 5.43f, 9.14f, 9.14f, 9.14f)
            curveToRelative(0.72f, 0f, 1.45f, -0.26f, 2f, -0.81f)
            lineToRelative(0.52f, -0.6f)
            curveToRelative(0.45f, -0.45f, 0.45f, -1.17f, 0f, -1.62f)
            lineToRelative(-1.3f, -1.21f)
            close()
        }
    }.also { _CalendarCall = it }
