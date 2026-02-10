package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _7: ImageVector? = null

val Icons.Br.Seven: ImageVector
    get() = _7 ?: UXIcon(name = "Seven") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 24f)
            curveToRelative(-0.25f, 0f, -0.51f, -0.06f, -0.74f, -0.2f)
            curveToRelative(-0.72f, -0.41f, -0.97f, -1.33f, -0.56f, -2.05f)
            lineTo(16.92f, 3f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11.61f)
            curveToRelative(1.01f, 0f, 1.93f, 0.51f, 2.46f, 1.37f)
            reflectiveCurveToRelative(0.58f, 1.91f, 0.13f, 2.81f)
            lineTo(8.8f, 23.24f)
            curveToRelative(-0.28f, 0.48f, -0.78f, 0.76f, -1.3f, 0.76f)
            close()
        }
    }.also { _7 = it }
