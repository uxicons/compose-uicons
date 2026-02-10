package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Br.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1.5f, 24f)
            curveToRelative(-0.59f, 0f, -1.16f, -0.35f, -1.39f, -0.94f)
            curveToRelative(-0.31f, -0.77f, 0.06f, -1.64f, 0.83f, -1.95f)
            lineToRelative(19.16f, -7.74f)
            curveToRelative(0.86f, -0.35f, 0.93f, -1.14f, 0.93f, -1.38f)
            curveToRelative(0f, -0.23f, -0.07f, -1.03f, -0.93f, -1.37f)
            lineTo(0.94f, 2.89f)
            curveTo(0.17f, 2.58f, -0.2f, 1.71f, 0.11f, 0.94f)
            curveTo(0.42f, 0.17f, 1.29f, -0.2f, 2.06f, 0.11f)
            lineToRelative(19.16f, 7.74f)
            curveToRelative(1.7f, 0.69f, 2.8f, 2.32f, 2.8f, 4.15f)
            curveToRelative(0f, 1.84f, -1.1f, 3.47f, -2.8f, 4.16f)
            lineTo(2.06f, 23.89f)
            curveToRelative(-0.18f, 0.07f, -0.37f, 0.11f, -0.56f, 0.11f)
            close()
        }
    }.also { _GreaterThan = it }
