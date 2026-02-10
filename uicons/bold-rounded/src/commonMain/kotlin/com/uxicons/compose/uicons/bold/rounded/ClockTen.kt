package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockTen: ImageVector? = null

val Icons.Br.ClockTen: ImageVector
    get() = _ClockTen ?: UXIcon(name = "ClockTen") {
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
            moveTo(13.25f, 13.8f)
            curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f)
            lineTo(14f, 6.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3.4f)
            lineToRelative(-1.21f, -0.7f)
            curveToRelative(-0.72f, -0.41f, -1.63f, -0.17f, -2.05f, 0.55f)
            curveToRelative(-0.41f, 0.72f, -0.17f, 1.64f, 0.55f, 2.05f)
            lineToRelative(3.46f, 2f)
            curveToRelative(0.23f, 0.13f, 0.49f, 0.2f, 0.75f, 0.2f)
            reflectiveCurveToRelative(0.52f, -0.07f, 0.75f, -0.2f)
            close()
        }
    }.also { _ClockTen = it }
