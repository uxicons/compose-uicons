package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Sr.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                curveToRelative(0f, -0.81f, 0.2f, -1.62f, 0.59f, -2.36f)
                lineTo(3.81f, 3.64f)
                curveToRelative(0.87f, -1.63f, 2.56f, -2.64f, 4.41f, -2.64f)
                horizontalLineToRelative(7.58f)
                curveToRelative(1.85f, 0f, 3.54f, 1.01f, 4.41f, 2.64f)
                lineToRelative(3.2f, 6f)
                curveToRelative(0.79f, 1.48f, 0.79f, 3.24f, 0f, 4.71f)
                lineToRelative(-3.2f, 6f)
                curveToRelative(-0.87f, 1.63f, -2.56f, 2.64f, -4.41f, 2.64f)
                horizontalLineToRelative(-7.58f)
                curveToRelative(-1.85f, 0f, -3.53f, -1.01f, -4.41f, -2.64f)
                lineTo(0.59f, 14.37f)
                curveTo(0.2f, 13.63f, 0f, 12.82f, 0f, 12f)
                close()
            }
        }.also { _Hexagon = it}
