package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _X: ImageVector? = null

val Icons.Br.X: ImageVector
    get() = _X ?: UXIcon(name = "X") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.93f, 12f)
            lineTo(21.67f, 2.44f)
            curveToRelative(0.52f, -0.64f, 0.42f, -1.59f, -0.22f, -2.11f)
            curveToRelative(-0.65f, -0.52f, -1.59f, -0.42f, -2.11f, 0.22f)
            lineToRelative(-7.33f, 9.06f)
            lineTo(4.67f, 0.56f)
            curveToRelative(-1.24f, -1.52f, -3.56f, 0.36f, -2.33f, 1.89f)
            lineToRelative(7.74f, 9.56f)
            lineTo(2.33f, 21.56f)
            curveToRelative(-0.52f, 0.64f, -0.42f, 1.59f, 0.22f, 2.11f)
            curveToRelative(0.64f, 0.52f, 1.59f, 0.42f, 2.11f, -0.22f)
            lineToRelative(7.33f, -9.06f)
            lineToRelative(7.33f, 9.06f)
            curveToRelative(0.52f, 0.65f, 1.47f, 0.74f, 2.11f, 0.22f)
            curveToRelative(0.65f, -0.52f, 0.74f, -1.47f, 0.22f, -2.11f)
            lineToRelative(-7.74f, -9.56f)
            close()
        }
    }.also { _X = it }
