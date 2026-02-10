package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _P: ImageVector? = null

val Icons.Br.P: ImageVector
    get() = _P ?: UXIcon(name = "P") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(7f)
            curveToRelative(9.93f, 0.35f, 9.92f, 14.65f, 0f, 15f)
            lineTo(5f, 15f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(5f, 12f)
            lineTo(14.5f, 12f)
            curveToRelative(5.93f, -0.16f, 5.93f, -8.85f, 0f, -9f)
            lineTo(7.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(6.5f)
            close()
        }
    }.also { _P = it }
