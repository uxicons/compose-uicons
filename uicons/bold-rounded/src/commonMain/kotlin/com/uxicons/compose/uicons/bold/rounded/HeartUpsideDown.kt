package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Br.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.01f, 23.07f)
            curveToRelative(-1.09f, 0f, -2.22f, -0.26f, -3.31f, -0.79f)
            curveToRelative(-1.04f, -0.5f, -1.92f, -1.26f, -2.54f, -2.2f)
            curveTo(-2.38f, 14.77f, 2.84f, 7.57f, 8.9f, 2.6f)
            curveToRelative(1.79f, -1.47f, 4.4f, -1.47f, 6.19f, 0f)
            curveToRelative(6.07f, 4.96f, 11.29f, 12.16f, 7.75f, 17.48f)
            curveToRelative(-0.62f, 0.94f, -1.5f, 1.7f, -2.54f, 2.2f)
            curveToRelative(-2.32f, 1.12f, -4.8f, 1.04f, -6.79f, -0.21f)
            curveToRelative(-0.58f, -0.36f, -1.08f, -0.81f, -1.51f, -1.32f)
            curveToRelative(-0.42f, 0.51f, -0.93f, 0.96f, -1.51f, 1.32f)
            curveToRelative(-1.06f, 0.67f, -2.25f, 1.0f, -3.48f, 1.0f)
            close()
            moveTo(12f, 4.5f)
            curveToRelative(-0.42f, 0f, -0.85f, 0.14f, -1.2f, 0.42f)
            curveTo(6.93f, 8.1f, 1.05f, 14.52f, 3.65f, 18.42f)
            curveToRelative(0.33f, 0.49f, 0.8f, 0.89f, 1.35f, 1.16f)
            curveToRelative(1.37f, 0.66f, 2.79f, 0.64f, 3.89f, -0.05f)
            curveToRelative(1.02f, -0.64f, 1.6f, -1.75f, 1.6f, -3.03f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 1.29f, 0.58f, 2.39f, 1.6f, 3.03f)
            curveToRelative(1.1f, 0.69f, 2.52f, 0.71f, 3.89f, 0.05f)
            curveToRelative(0.55f, -0.27f, 1.02f, -0.67f, 1.35f, -1.16f)
            curveToRelative(2.6f, -3.9f, -3.27f, -10.32f, -7.15f, -13.49f)
            curveToRelative(-0.35f, -0.28f, -0.77f, -0.42f, -1.2f, -0.42f)
            close()
        }
    }.also { _HeartUpsideDown = it }
