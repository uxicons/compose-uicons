package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Br.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.9f, 21.96f)
            lineTo(16.61f, 3.14f)
            curveToRelative(-1.51f, -4.14f, -7.71f, -4.14f, -9.22f, 0.01f)
            lineTo(0.1f, 21.96f)
            curveToRelative(-0.3f, 0.77f, 0.08f, 1.64f, 0.86f, 1.94f)
            curveToRelative(0.77f, 0.3f, 1.64f, -0.08f, 1.94f, -0.86f)
            lineToRelative(1.95f, -5.04f)
            horizontalLineToRelative(14.3f)
            lineToRelative(1.95f, 5.04f)
            curveToRelative(0.3f, 0.78f, 1.19f, 1.15f, 1.94f, 0.86f)
            curveToRelative(0.77f, -0.3f, 1.16f, -1.17f, 0.86f, -1.94f)
            close()
            moveTo(6.01f, 15f)
            lineTo(10.18f, 4.24f)
            curveToRelative(0.7f, -1.67f, 2.93f, -1.67f, 3.63f, -0.01f)
            lineToRelative(4.17f, 10.77f)
            horizontalLineTo(6.01f)
            close()
        }
    }.also { _A = it }
