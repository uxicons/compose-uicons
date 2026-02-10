package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockSeven: ImageVector? = null

val Icons.Br.ClockSeven: ImageVector
    get() = _ClockSeven ?: UXIcon(name = "ClockSeven") {
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
            moveTo(11.75f, 16.33f)
            lineToRelative(2f, -3f)
            curveToRelative(0.16f, -0.25f, 0.25f, -0.54f, 0.25f, -0.83f)
            lineTo(14f, 6.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.55f)
            lineToRelative(-1.75f, 2.62f)
            curveToRelative(-0.46f, 0.69f, -0.27f, 1.62f, 0.42f, 2.08f)
            curveToRelative(0.26f, 0.17f, 0.55f, 0.25f, 0.83f, 0.25f)
            curveToRelative(0.48f, 0f, 0.96f, -0.23f, 1.25f, -0.67f)
            close()
        }
    }.also { _ClockSeven = it }
