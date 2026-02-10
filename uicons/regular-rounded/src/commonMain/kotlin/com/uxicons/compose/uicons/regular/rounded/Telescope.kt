package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Telescope: ImageVector? = null

val Icons.Rr.Telescope: ImageVector
    get() = _Telescope ?: UXIcon(name = "Telescope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.91f, 9.07f)
                lineTo(19.91f, 0.57f)
                curveToRelative(-0.24f, -0.5f, -0.83f, -0.71f, -1.33f, -0.48f)
                curveToRelative(-0.5f, 0.23f, -0.71f, 0.83f, -0.48f, 1.33f)
                lineToRelative(0.36f, 0.77f)
                lineTo(5.27f, 7.82f)
                curveToRelative(-1.65f, 0.71f, -2.54f, 2.48f, -2.19f, 4.18f)
                lineToRelative(-2.48f, 1.09f)
                curveToRelative(-0.51f, 0.22f, -0.74f, 0.81f, -0.51f, 1.32f)
                curveToRelative(0.17f, 0.38f, 0.53f, 0.6f, 0.92f, 0.6f)
                curveToRelative(0.13f, 0f, 0.27f, -0.03f, 0.4f, -0.08f)
                lineToRelative(2.58f, -1.13f)
                curveToRelative(0.37f, 0.41f, 0.84f, 0.73f, 1.36f, 0.94f)
                curveToRelative(0.45f, 0.18f, 0.93f, 0.27f, 1.4f, 0.27f)
                curveToRelative(0.5f, 0f, 1.0f, -0.1f, 1.47f, -0.3f)
                lineToRelative(3.32f, -1.42f)
                lineToRelative(-4.44f, 9.29f)
                curveToRelative(-0.24f, 0.5f, -0.03f, 1.1f, 0.47f, 1.33f)
                curveToRelative(0.5f, 0.24f, 1.09f, 0.03f, 1.33f, -0.47f)
                lineToRelative(4.6f, -9.61f)
                lineToRelative(4.6f, 9.61f)
                curveToRelative(0.17f, 0.36f, 0.53f, 0.57f, 0.9f, 0.57f)
                curveToRelative(0.14f, 0f, 0.29f, -0.03f, 0.43f, -0.1f)
                curveToRelative(0.5f, -0.24f, 0.71f, -0.84f, 0.47f, -1.33f)
                lineToRelative(-5.11f, -10.68f)
                lineToRelative(6.85f, -2.92f)
                lineToRelative(0.45f, 0.95f)
                curveToRelative(0.17f, 0.36f, 0.53f, 0.57f, 0.91f, 0.57f)
                curveToRelative(0.14f, 0f, 0.29f, -0.03f, 0.42f, -0.1f)
                curveToRelative(0.5f, -0.23f, 0.71f, -0.83f, 0.48f, -1.33f)
                close()
                moveTo(7.43f, 12.86f)
                curveToRelative(-0.43f, 0.18f, -0.91f, 0.19f, -1.34f, 0.01f)
                reflectiveCurveToRelative(-0.77f, -0.51f, -0.95f, -0.94f)
                curveToRelative(-0.37f, -0.88f, 0.04f, -1.9f, 0.92f, -2.28f)
                lineToRelative(13.26f, -5.65f)
                lineToRelative(1.49f, 3.16f)
                lineToRelative(-13.36f, 5.7f)
                close()
            }
        }.also { _Telescope = it}
