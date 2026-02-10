package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockEleven: ImageVector? = null

val Icons.Br.ClockEleven: ImageVector
    get() = _ClockEleven ?: UXIcon(name = "ClockEleven") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            reflectiveCurveTo(16.96f, 3f, 12f, 3f)
            close()
            moveTo(12.98f, 13.92f)
            curveToRelative(0.61f, -0.21f, 1.02f, -0.78f, 1.02f, -1.42f)
            lineTo(14f, 6.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.59f)
            curveToRelative(-0.51f, -0.65f, -1.44f, -0.77f, -2.1f, -0.27f)
            curveToRelative(-0.66f, 0.51f, -0.78f, 1.45f, -0.28f, 2.1f)
            lineToRelative(2.68f, 3.49f)
            curveToRelative(0.29f, 0.38f, 0.73f, 0.59f, 1.19f, 0.59f)
            curveToRelative(0.16f, 0f, 0.32f, -0.03f, 0.48f, -0.08f)
            close()
        }
    }.also { _ClockEleven = it }
