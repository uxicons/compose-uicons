package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Br.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.26f, 24f)
            horizontalLineToRelative(-6.52f)
            curveToRelative(-2.31f, 0.06f, -4.2f, -2.28f, -3.65f, -4.53f)
            lineToRelative(2.08f, -7.41f)
            curveToRelative(-1.76f, -1.68f, -2.54f, -4.18f, -1.99f, -6.63f)
            curveTo(5.75f, 2.83f, 7.88f, 0.71f, 10.49f, 0.16f)
            curveToRelative(2.11f, -0.44f, 4.27f, 0.07f, 5.91f, 1.4f)
            curveToRelative(1.65f, 1.34f, 2.59f, 3.32f, 2.59f, 5.44f)
            curveToRelative(0f, 1.93f, -0.8f, 3.75f, -2.17f, 5.06f)
            lineToRelative(2.06f, 7.32f)
            curveToRelative(0.58f, 2.34f, -1.27f, 4.65f, -3.63f, 4.62f)
            close()
            moveTo(12.01f, 3.0f)
            curveToRelative(-0.29f, 0f, -0.59f, 0.03f, -0.9f, 0.1f)
            curveToRelative(-1.48f, 0.31f, -2.69f, 1.51f, -3.01f, 2.98f)
            curveToRelative(-0.36f, 1.66f, 0.26f, 3.27f, 1.63f, 4.22f)
            curveToRelative(0.53f, 0.36f, 0.76f, 1.02f, 0.59f, 1.64f)
            lineToRelative(-2.32f, 8.26f)
            curveToRelative(0.0f, 0.47f, 0.21f, 0.74f, 0.74f, 0.81f)
            horizontalLineToRelative(6.52f)
            curveToRelative(0.57f, -0.09f, 0.76f, -0.32f, 0.72f, -0.89f)
            lineToRelative(-2.3f, -8.18f)
            curveToRelative(-0.17f, -0.62f, 0.06f, -1.27f, 0.59f, -1.64f)
            curveToRelative(1.08f, -0.75f, 1.73f, -1.98f, 1.73f, -3.29f)
            curveToRelative(0f, -1.21f, -0.54f, -2.34f, -1.48f, -3.11f)
            curveToRelative(-0.72f, -0.59f, -1.59f, -0.89f, -2.51f, -0.89f)
            close()
        }
    }.also { _KeyHole = it }
