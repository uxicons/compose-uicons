package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFive: ImageVector? = null

val Icons.Tr.ClockFive: ImageVector
    get() = _ClockFive ?: UXIcon(name = "ClockFive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(14.8f, 16.9f)
                curveToRelative(0.22f, -0.17f, 0.27f, -0.48f, 0.1f, -0.7f)
                lineToRelative(-2.9f, -3.87f)
                lineTo(12.0f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.11f, 0.04f, 0.21f, 0.1f, 0.3f)
                lineToRelative(3f, 4f)
                curveToRelative(0.1f, 0.13f, 0.25f, 0.2f, 0.4f, 0.2f)
                curveToRelative(0.1f, 0f, 0.21f, -0.03f, 0.3f, -0.1f)
                close()
            }
        }.also { _ClockFive = it}
