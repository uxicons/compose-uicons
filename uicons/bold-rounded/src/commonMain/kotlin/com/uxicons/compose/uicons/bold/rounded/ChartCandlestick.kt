package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartCandlestick: ImageVector? = null

val Icons.Br.ChartCandlestick: ImageVector
    get() = _ChartCandlestick ?: UXIcon(name = "ChartCandlestick") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.51f, 24f)
            reflectiveCurveToRelative(0f, 0f, 0f, 0f)
            curveToRelative(-1.46f, 0f, -2.84f, -0.57f, -3.88f, -1.61f)
            curveToRelative(-1.04f, -1.04f, -1.61f, -2.42f, -1.61f, -3.89f)
            lineTo(0.02f, 1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(3f, 18.49f)
            curveToRelative(0f, 0.67f, 0.26f, 1.3f, 0.73f, 1.77f)
            curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
            lineTo(22.5f, 20.99f)
            curveToRelative(0.83f, 0f, 1.5f, 0.68f, 1.5f, 1.51f)
            close()
            moveTo(18f, 14f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            lineTo(23f, 5f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            lineTo(21f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            close()
            moveTo(8f, 16f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            lineTo(13f, 5f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            lineTo(11f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            lineTo(6f, 14f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            close()
        }
    }.also { _ChartCandlestick = it }
