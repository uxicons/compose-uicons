package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Sc.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.74f, 8.64f)
                curveToRelative(-0.38f, -0.74f, -1.28f, -1.03f, -2.02f, -0.66f)
                curveToRelative(-0.74f, 0.38f, -1.03f, 1.28f, -0.66f, 2.02f)
                curveToRelative(0.82f, 1.62f, 0.98f, 2.94f, 0.92f, 3.93f)
                lineToRelative(-5.12f, -4.73f)
                curveToRelative(-0.84f, -0.78f, -1.94f, -1.2f, -3.08f, -1.14f)
                curveToRelative(-1.14f, 0.05f, -2.19f, 0.54f, -2.96f, 1.39f)
                curveToRelative(-0.23f, 0.25f, -0.54f, 0.4f, -0.87f, 0.41f)
                curveToRelative(-0.33f, 0.01f, -0.61f, -0.09f, -0.85f, -0.29f)
                lineTo(3.64f, 5.53f)
                curveToRelative(-0.54f, -0.63f, -1.48f, -0.7f, -2.11f, -0.17f)
                curveToRelative(-0.63f, 0.54f, -0.7f, 1.49f, -0.17f, 2.12f)
                curveToRelative(0f, 0f, 3.59f, 4.2f, 3.63f, 4.24f)
                curveToRelative(0.84f, 0.79f, 1.94f, 1.19f, 3.08f, 1.14f)
                curveToRelative(1.14f, -0.05f, 2.19f, -0.54f, 2.96f, -1.39f)
                curveToRelative(0.23f, -0.25f, 0.53f, -0.4f, 0.87f, -0.41f)
                curveToRelative(0.34f, -0.0f, 0.66f, 0.11f, 0.91f, 0.34f)
                lineToRelative(4.97f, 4.59f)
                curveToRelative(-0.96f, 0.04f, -2.21f, -0.15f, -3.72f, -0.93f)
                curveToRelative(-0.73f, -0.38f, -1.64f, -0.09f, -2.02f, 0.65f)
                curveToRelative(-0.38f, 0.74f, -0.09f, 1.64f, 0.65f, 2.02f)
                curveToRelative(1.86f, 0.96f, 3.51f, 1.27f, 4.86f, 1.27f)
                curveToRelative(2.43f, 0f, 3.91f, -1.01f, 4.0f, -1.07f)
                curveToRelative(0.15f, -0.1f, 0.27f, -0.23f, 0.37f, -0.38f)
                curveToRelative(0.1f, -0.15f, 2.46f, -3.67f, -0.2f, -8.9f)
                close()
            }
        }.also { _ArrowTrendDown = it}
