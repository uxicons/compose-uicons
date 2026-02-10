package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Br.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.91f, 11.54f)
            curveToRelative(0.53f, 0.64f, 0.44f, 1.58f, -0.2f, 2.11f)
            curveToRelative(-0.64f, 0.53f, -1.58f, 0.44f, -2.11f, -0.2f)
            curveToRelative(-1.03f, -1.25f, -1.6f, -2.83f, -1.6f, -4.46f)
            curveTo(0f, 5.14f, 3.14f, 2f, 7f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
            curveToRelative(0f, 3.12f, -2.09f, 5.89f, -5.09f, 6.74f)
            curveToRelative(-0.14f, 0.04f, -0.27f, 0.06f, -0.41f, 0.06f)
            curveToRelative(-0.65f, 0f, -1.25f, -0.43f, -1.44f, -1.09f)
            curveToRelative(-0.23f, -0.8f, 0.24f, -1.63f, 1.03f, -1.85f)
            curveToRelative(1.71f, -0.48f, 2.91f, -2.07f, 2.91f, -3.85f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            lineTo(7f, 5.0f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 0.94f, 0.32f, 1.82f, 0.91f, 2.54f)
            close()
            moveTo(22.4f, 10.54f)
            curveToRelative(-0.53f, -0.64f, -1.47f, -0.73f, -2.11f, -0.2f)
            curveToRelative(-0.64f, 0.53f, -0.73f, 1.47f, -0.2f, 2.11f)
            curveToRelative(0.6f, 0.72f, 0.91f, 1.6f, 0.91f, 2.54f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-4f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -1.78f, 1.2f, -3.37f, 2.91f, -3.85f)
            curveToRelative(0.8f, -0.23f, 1.26f, -1.05f, 1.03f, -1.85f)
            curveToRelative(-0.23f, -0.8f, -1.05f, -1.26f, -1.85f, -1.03f)
            curveToRelative(-3.0f, 0.85f, -5.09f, 3.62f, -5.09f, 6.74f)
            curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
            horizontalLineToRelative(4f)
            curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
            curveToRelative(0f, -1.62f, -0.57f, -3.21f, -1.6f, -4.46f)
            close()
        }
    }.also { _LinkHorizontal = it }
