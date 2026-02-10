package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _V: ImageVector? = null

val Icons.Br.V: ImageVector
    get() = _V ?: UXIcon(name = "V") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24.01f)
            curveToRelative(-2.05f, 0f, -3.86f, -1.23f, -4.61f, -3.14f)
            lineTo(0.1f, 2.04f)
            curveTo(-0.2f, 1.27f, 0.19f, 0.4f, 0.96f, 0.1f)
            curveToRelative(0.77f, -0.3f, 1.64f, 0.09f, 1.94f, 0.86f)
            lineToRelative(7.29f, 18.82f)
            curveToRelative(0.7f, 1.66f, 2.93f, 1.67f, 3.63f, -0.01f)
            lineTo(21.1f, 0.96f)
            curveToRelative(0.3f, -0.77f, 1.17f, -1.16f, 1.94f, -0.86f)
            curveToRelative(0.77f, 0.3f, 1.16f, 1.17f, 0.86f, 1.94f)
            lineToRelative(-7.29f, 18.82f)
            curveToRelative(-0.75f, 1.92f, -2.56f, 3.15f, -4.61f, 3.15f)
            close()
        }
    }.also { _V = it }
