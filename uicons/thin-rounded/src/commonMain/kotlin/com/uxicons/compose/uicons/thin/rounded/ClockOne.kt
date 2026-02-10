package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockOne: ImageVector? = null

val Icons.Tr.ClockOne: ImageVector
    get() = _ClockOne ?: UXIcon(name = "ClockOne") {
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
                moveTo(11.9f, 12.8f)
                lineToRelative(3f, -4f)
                curveToRelative(0.17f, -0.22f, 0.12f, -0.53f, -0.1f, -0.7f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.12f, -0.7f, 0.1f)
                lineToRelative(-2.1f, 2.8f)
                lineTo(12.0f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.21f, 0.14f, 0.41f, 0.34f, 0.47f)
                curveToRelative(0.05f, 0.02f, 0.1f, 0.03f, 0.16f, 0.03f)
                curveToRelative(0.15f, 0f, 0.3f, -0.07f, 0.4f, -0.2f)
                close()
            }
        }.also { _ClockOne = it}
