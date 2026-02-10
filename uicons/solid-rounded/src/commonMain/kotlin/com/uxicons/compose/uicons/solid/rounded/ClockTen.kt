package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTen: ImageVector? = null

val Icons.Sr.ClockTen: ImageVector
    get() = _ClockTen ?: UXIcon(name = "ClockTen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.36f, -0.19f, 0.69f, -0.5f, 0.87f)
                curveToRelative(-0.15f, 0.09f, -0.33f, 0.13f, -0.5f, 0.13f)
                reflectiveCurveToRelative(-0.34f, -0.04f, -0.5f, -0.13f)
                lineToRelative(-3.46f, -2f)
                curveToRelative(-0.48f, -0.28f, -0.64f, -0.89f, -0.37f, -1.37f)
                reflectiveCurveToRelative(0.89f, -0.64f, 1.37f, -0.37f)
                lineToRelative(1.96f, 1.13f)
                lineTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClockTen = it}
