package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandScissors: ImageVector? = null

val Icons.Br.HandScissors: ImageVector
    get() = _HandScissors ?: UXIcon(name = "HandScissors") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 10.53f)
            verticalLineToRelative(5.97f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-2.67f, 0f, -4.9f, -1.93f, -5.42f, -4.7f)
            lineToRelative(-0.68f, -3.48f)
            lineToRelative(-7.15f, 1.16f)
            curveToRelative(-0.81f, 0.13f, -1.59f, -0.42f, -1.72f, -1.24f)
            curveToRelative(-0.13f, -0.82f, 0.42f, -1.59f, 1.24f, -1.72f)
            lineToRelative(8.59f, -1.39f)
            curveToRelative(0.8f, -0.13f, 1.56f, 0.4f, 1.71f, 1.19f)
            lineToRelative(0.96f, 4.92f)
            curveToRelative(0.26f, 1.38f, 1.23f, 2.26f, 2.48f, 2.26f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5.97f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            lineToRelative(-2.31f, -2.31f)
            curveToRelative(-0.21f, -0.21f, -0.5f, -0.33f, -0.81f, -0.33f)
            horizontalLineToRelative(-0.0f)
            curveToRelative(-0.3f, 0f, -0.59f, 0.12f, -0.81f, 0.34f)
            lineToRelative(-2.51f, 2.41f)
            lineToRelative(1.77f, 0.27f)
            curveToRelative(0.82f, 0.13f, 1.38f, 0.89f, 1.25f, 1.71f)
            curveToRelative(-0.11f, 0.74f, -0.75f, 1.27f, -1.48f, 1.27f)
            curveToRelative(-0.08f, 0f, -0.15f, -0.01f, -0.23f, -0.02f)
            lineTo(1.27f, 7.98f)
            curveTo(0.45f, 7.86f, -0.11f, 7.09f, 0.02f, 6.27f)
            curveToRelative(0.12f, -0.82f, 0.9f, -1.39f, 1.71f, -1.25f)
            lineToRelative(7.49f, 1.15f)
            lineToRelative(4.14f, -3.97f)
            curveToRelative(0.76f, -0.76f, 1.79f, -1.19f, 2.9f, -1.2f)
            horizontalLineToRelative(0.01f)
            curveToRelative(1.1f, 0f, 2.15f, 0.43f, 2.93f, 1.21f)
            lineToRelative(2.31f, 2.31f)
            curveToRelative(1.6f, 1.6f, 2.49f, 3.74f, 2.49f, 6.01f)
            close()
        }
    }.also { _HandScissors = it }
