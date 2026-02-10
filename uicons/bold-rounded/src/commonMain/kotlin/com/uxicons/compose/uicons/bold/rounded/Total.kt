package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Br.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 19.5f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(4.81f)
            curveToRelative(-1.16f, 0f, -2.19f, -0.7f, -2.62f, -1.78f)
            curveToRelative(-0.43f, -1.08f, -0.17f, -2.29f, 0.67f, -3.1f)
            lineToRelative(7.47f, -7.13f)
            lineTo(2.86f, 4.87f)
            curveToRelative(-0.84f, -0.8f, -1.1f, -2.02f, -0.67f, -3.1f)
            curveToRelative(0.43f, -1.08f, 1.46f, -1.78f, 2.62f, -1.78f)
            horizontalLineToRelative(12.69f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(5.24f)
            lineToRelative(8.29f, 7.92f)
            curveToRelative(0.3f, 0.28f, 0.46f, 0.68f, 0.46f, 1.08f)
            reflectiveCurveToRelative(-0.17f, 0.8f, -0.46f, 1.08f)
            lineToRelative(-8.29f, 7.92f)
            horizontalLineToRelative(12.26f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Total = it }
