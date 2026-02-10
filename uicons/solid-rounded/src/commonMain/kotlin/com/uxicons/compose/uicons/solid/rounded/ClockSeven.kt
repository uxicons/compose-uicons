package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockSeven: ImageVector? = null

val Icons.Sr.ClockSeven: ImageVector
    get() = _ClockSeven ?: UXIcon(name = "ClockSeven") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.18f, -0.05f, 0.35f, -0.13f, 0.5f)
                lineToRelative(-2f, 3.46f)
                curveToRelative(-0.19f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.48f, -0.28f, -0.64f, -0.89f, -0.37f, -1.37f)
                lineToRelative(1.87f, -3.23f)
                lineTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClockSeven = it}
