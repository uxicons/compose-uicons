package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Sr.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.12f, 3.9f)
                curveToRelative(-1.2f, -1.25f, -2.81f, -1.91f, -4.66f, -1.9f)
                curveToRelative(-2.25f, 0.05f, -4.34f, 1.29f, -5.44f, 3.26f)
                curveToRelative(0f, 0.01f, -0.01f, 0.02f, -0.02f, 0.03f)
                curveToRelative(0f, -0.01f, -0.02f, -0.02f, -0.02f, -0.03f)
                curveToRelative(-1.11f, -1.96f, -3.19f, -3.21f, -5.46f, -3.26f)
                curveToRelative(-1.84f, 0f, -3.44f, 0.66f, -4.64f, 1.91f)
                curveTo(0.61f, 5.22f, -0.07f, 7.09f, 0f, 9.01f)
                curveToRelative(0f, 4.5f, 4.66f, 9.4f, 8.57f, 12.72f)
                curveToRelative(0.99f, 0.84f, 2.21f, 1.26f, 3.43f, 1.26f)
                curveToRelative(1.23f, 0f, 2.46f, -0.43f, 3.46f, -1.28f)
                curveToRelative(3.18f, -2.71f, 8.53f, -7.95f, 8.53f, -12.63f)
                curveToRelative(0.07f, -1.98f, -0.61f, -3.87f, -1.88f, -5.18f)
                close()
                moveTo(14.17f, 20.19f)
                curveToRelative(-0.35f, 0.3f, -0.75f, 0.51f, -1.17f, 0.64f)
                lineTo(13f, 9f)
                curveToRelative(0f, -1.62f, 0.69f, -2.63f, 0.69f, -2.63f)
                curveToRelative(0.02f, -0.03f, 0.04f, -0.06f, 0.06f, -0.1f)
                curveToRelative(0.75f, -1.36f, 2.19f, -2.23f, 3.74f, -2.27f)
                curveToRelative(1.27f, 0f, 2.37f, 0.45f, 3.18f, 1.29f)
                curveToRelative(0.89f, 0.93f, 1.37f, 2.28f, 1.32f, 3.76f)
                curveToRelative(0f, 2.81f, -2.92f, 6.98f, -7.82f, 11.14f)
                close()
            }
        }.also { _HeartHalfStroke = it}
