package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFive: ImageVector? = null

val Icons.Rr.ClockFive: ImageVector
    get() = _ClockFive ?: UXIcon(name = "ClockFive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(14.5f, 16.33f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f)
                lineToRelative(-1.87f, -3.23f)
                lineTo(13f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.18f, 0.05f, 0.35f, 0.13f, 0.5f)
                lineToRelative(2f, 3.46f)
                curveToRelative(0.19f, 0.32f, 0.52f, 0.5f, 0.87f, 0.5f)
                curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.5f, -0.13f)
                close()
            }
        }.also { _ClockFive = it}
