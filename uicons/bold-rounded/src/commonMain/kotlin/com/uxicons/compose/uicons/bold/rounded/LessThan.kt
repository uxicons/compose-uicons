package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Br.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.89f, 23.06f)
            curveToRelative(-0.23f, 0.58f, -0.8f, 0.94f, -1.39f, 0.94f)
            curveToRelative(-0.19f, 0f, -0.38f, -0.04f, -0.56f, -0.11f)
            lineTo(2.78f, 16.16f)
            curveTo(1.08f, 15.47f, -0.02f, 13.84f, -0.02f, 12f)
            reflectiveCurveToRelative(1.1f, -3.47f, 2.8f, -4.16f)
            lineTo(21.94f, 0.11f)
            curveToRelative(0.77f, -0.31f, 1.64f, 0.06f, 1.95f, 0.83f)
            curveToRelative(0.31f, 0.77f, -0.06f, 1.64f, -0.83f, 1.95f)
            lineTo(3.91f, 10.63f)
            curveToRelative(-0.86f, 0.35f, -0.93f, 1.14f, -0.93f, 1.37f)
            reflectiveCurveToRelative(0.07f, 1.03f, 0.93f, 1.37f)
            lineToRelative(19.15f, 7.74f)
            curveToRelative(0.77f, 0.31f, 1.14f, 1.19f, 0.83f, 1.95f)
            close()
        }
    }.also { _LessThan = it }
