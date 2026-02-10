package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Br.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 12f)
            curveToRelative(0f, -0.86f, 0.21f, -1.72f, 0.63f, -2.51f)
            lineTo(3.71f, 3.79f)
            curveToRelative(0.93f, -1.72f, 2.72f, -2.79f, 4.69f, -2.79f)
            horizontalLineToRelative(7.23f)
            curveToRelative(1.97f, 0f, 3.76f, 1.07f, 4.69f, 2.8f)
            lineToRelative(3.06f, 5.7f)
            curveToRelative(0.84f, 1.57f, 0.84f, 3.43f, 0f, 5f)
            lineToRelative(-3.06f, 5.7f)
            curveToRelative(-0.93f, 1.73f, -2.72f, 2.8f, -4.69f, 2.8f)
            horizontalLineToRelative(-7.23f)
            curveToRelative(-1.96f, 0f, -3.76f, -1.07f, -4.68f, -2.79f)
            lineTo(0.63f, 14.51f)
            curveTo(0.21f, 13.73f, 0f, 12.87f, 0f, 12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, -0.37f, -0.09f, -0.74f, -0.27f, -1.08f)
            lineToRelative(-3.06f, -5.7f)
            curveToRelative(-0.4f, -0.75f, -1.19f, -1.22f, -2.05f, -1.22f)
            horizontalLineToRelative(-7.23f)
            curveToRelative(-0.86f, 0f, -1.64f, 0.47f, -2.04f, 1.22f)
            lineToRelative(-3.07f, 5.7f)
            curveToRelative(-0.37f, 0.68f, -0.37f, 1.49f, 0f, 2.17f)
            lineToRelative(3.07f, 5.7f)
            curveToRelative(0.4f, 0.75f, 1.19f, 1.21f, 2.04f, 1.21f)
            horizontalLineToRelative(7.23f)
            curveToRelative(0.86f, 0f, 1.64f, -0.47f, 2.05f, -1.22f)
            reflectiveQuadToRelative(0f, 0f)
            lineToRelative(3.06f, -5.7f)
            curveToRelative(0.18f, -0.34f, 0.27f, -0.71f, 0.27f, -1.08f)
            close()
        }
    }.also { _Hexagon = it }
