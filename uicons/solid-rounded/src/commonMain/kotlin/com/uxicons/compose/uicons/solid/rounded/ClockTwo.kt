package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTwo: ImageVector? = null

val Icons.Sr.ClockTwo: ImageVector
    get() = _ClockTwo ?: UXIcon(name = "ClockTwo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(15.96f, 10.87f)
                lineToRelative(-3.46f, 2f)
                curveToRelative(-0.15f, 0.09f, -0.33f, 0.13f, -0.5f, 0.13f)
                reflectiveCurveToRelative(-0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.31f, -0.18f, -0.5f, -0.51f, -0.5f, -0.87f)
                lineTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.27f)
                lineToRelative(1.96f, -1.13f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f)
                close()
            }
        }.also { _ClockTwo = it}
