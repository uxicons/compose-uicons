package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Br.Z: ImageVector
    get() = _Z ?: UXIcon(name = "Z") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 24f)
            horizontalLineTo(6.26f)
            curveToRelative(-1.86f, 0f, -3.45f, -1.15f, -4.03f, -2.93f)
            curveToRelative(-0.59f, -1.8f, 0f, -3.68f, 1.51f, -4.8f)
            lineTo(18.48f, 5.33f)
            curveToRelative(0.69f, -0.52f, 0.52f, -1.24f, 0.45f, -1.45f)
            curveToRelative(-0.07f, -0.2f, -0.35f, -0.87f, -1.19f, -0.87f)
            horizontalLineTo(3.5f)
            curveTo(1.53f, 2.97f, 1.53f, 0.03f, 3.5f, 0f)
            horizontalLineToRelative(14.24f)
            curveToRelative(1.86f, 0f, 3.45f, 1.15f, 4.03f, 2.93f)
            curveToRelative(0.59f, 1.8f, 0f, 3.68f, -1.51f, 4.8f)
            lineTo(5.52f, 18.67f)
            curveToRelative(-0.69f, 0.52f, -0.52f, 1.24f, -0.45f, 1.45f)
            curveToRelative(0.07f, 0.2f, 0.35f, 0.87f, 1.19f, 0.87f)
            horizontalLineToRelative(14.24f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            close()
        }
    }.also { _Z = it }
