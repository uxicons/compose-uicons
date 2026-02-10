package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Tr.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.39f, 12.45f)
                curveToRelative(1.64f, -1.32f, 2.61f, -3.34f, 2.61f, -5.45f)
                curveToRelative(0.08f, -3.76f, -3.24f, -7.08f, -7.0f, -7f)
                curveToRelative(-3.82f, -0.09f, -7.28f, 3.56f, -6.99f, 7.37f)
                curveToRelative(0.1f, 1.99f, 1.05f, 3.82f, 2.6f, 5.07f)
                lineToRelative(-2.04f, 7.92f)
                curveToRelative(-0.44f, 1.8f, 1.08f, 3.68f, 2.93f, 3.63f)
                horizontalLineToRelative(7f)
                curveToRelative(1.87f, 0.04f, 3.37f, -1.83f, 2.93f, -3.65f)
                lineToRelative(-2.04f, -7.9f)
                close()
                moveTo(17.06f, 22.26f)
                curveToRelative(-0.38f, 0.47f, -0.95f, 0.74f, -1.56f, 0.74f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.23f, 0.04f, -2.25f, -1.22f, -1.96f, -2.4f)
                lineToRelative(2.12f, -8.22f)
                curveToRelative(0.05f, -0.2f, -0.02f, -0.41f, -0.19f, -0.53f)
                curveToRelative(-1.47f, -1.07f, -2.37f, -2.72f, -2.47f, -4.53f)
                curveToRelative(-0.24f, -3.26f, 2.73f, -6.4f, 5.99f, -6.32f)
                curveToRelative(3.22f, -0.07f, 6.07f, 2.77f, 6f, 6f)
                curveToRelative(0f, 1.91f, -0.93f, 3.72f, -2.48f, 4.85f)
                curveToRelative(-0.17f, 0.12f, -0.24f, 0.33f, -0.19f, 0.53f)
                lineToRelative(2.12f, 8.2f)
                curveToRelative(0.13f, 0.59f, -0.02f, 1.21f, -0.4f, 1.68f)
                close()
            }
        }.also { _KeyHole = it}
