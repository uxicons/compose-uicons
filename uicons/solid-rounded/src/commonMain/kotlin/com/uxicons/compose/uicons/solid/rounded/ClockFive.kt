package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFive: ImageVector? = null

val Icons.Sr.ClockFive: ImageVector
    get() = _ClockFive ?: UXIcon(name = "ClockFive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(14.5f, 16.33f)
                curveToRelative(-0.16f, 0.09f, -0.33f, 0.13f, -0.5f, 0.13f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.18f, -0.87f, -0.5f)
                lineToRelative(-2f, -3.46f)
                curveToRelative(-0.09f, -0.15f, -0.13f, -0.32f, -0.13f, -0.5f)
                lineTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.73f)
                lineToRelative(1.87f, 3.23f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f)
                close()
            }
        }.also { _ClockFive = it}
