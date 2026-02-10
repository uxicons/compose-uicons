package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y: ImageVector? = null

val Icons.Br.Y: ImageVector
    get() = _Y ?: UXIcon(name = "Y") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.44f, 0.33f)
            curveToRelative(-0.65f, -0.52f, -1.59f, -0.42f, -2.11f, 0.22f)
            lineToRelative(-7.33f, 9.06f)
            lineTo(4.67f, 0.56f)
            curveToRelative(-1.24f, -1.52f, -3.56f, 0.36f, -2.33f, 1.89f)
            lineTo(10.5f, 12.53f)
            verticalLineToRelative(9.97f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineTo(12.53f)
            lineTo(21.67f, 2.44f)
            curveToRelative(0.52f, -0.64f, 0.42f, -1.59f, -0.22f, -2.11f)
            close()
        }
    }.also { _Y = it }
