package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwo: ImageVector? = null

val Icons.Tr.ClockTwo: ImageVector
    get() = _ClockTwo ?: UXIcon(name = "ClockTwo") {
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
                moveTo(11.77f, 12.92f)
                lineToRelative(4f, -2.5f)
                curveToRelative(0.23f, -0.15f, 0.3f, -0.46f, 0.16f, -0.69f)
                curveToRelative(-0.15f, -0.23f, -0.46f, -0.31f, -0.69f, -0.16f)
                lineToRelative(-3.23f, 2.02f)
                lineTo(12f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.18f, 0.1f, 0.35f, 0.26f, 0.44f)
                curveToRelative(0.07f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                curveToRelative(0.09f, 0f, 0.18f, -0.03f, 0.27f, -0.08f)
                close()
            }
        }.also { _ClockTwo = it}
