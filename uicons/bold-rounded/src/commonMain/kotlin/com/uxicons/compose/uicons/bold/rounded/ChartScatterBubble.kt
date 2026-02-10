package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartScatterBubble: ImageVector? = null

val Icons.Br.ChartScatterBubble: ImageVector
    get() = _ChartScatterBubble ?: UXIcon(name = "ChartScatterBubble") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 3f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            close()
            moveTo(18f, 16f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            close()
            moveTo(9.5f, 9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(8.5f, 18f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(22.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(0f, 0.67f, 0f, 1.5f)
            lineTo(0f, 18.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            lineTo(22.5f, 24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ChartScatterBubble = it }
