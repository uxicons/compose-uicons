package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeaWave: ImageVector? = null

val Icons.Sr.SeaWave: ImageVector
    get() = _SeaWave ?: UXIcon(name = "SeaWave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 9f)
                curveToRelative(-3.01f, 0f, -6.5f, 1.75f, -6.5f, 4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.41f, 0f, 0.8f, -0.13f, 1.12f, -0.34f)
                curveToRelative(0.27f, 0.78f, 1.01f, 1.34f, 1.88f, 1.34f)
                curveToRelative(0.8f, 0f, 1.48f, -0.47f, 1.8f, -1.15f)
                curveToRelative(0.78f, 0.78f, 1.2f, 1.83f, 1.2f, 3.15f)
                curveToRelative(0f, 2.2f, -1.79f, 3.99f, -4f, 3.99f)
                curveToRelative(-0.88f, 0f, -1.68f, -0.28f, -2.39f, -0.82f)
                curveToRelative(-0.44f, -0.33f, -1.06f, -0.25f, -1.4f, 0.19f)
                curveToRelative(-0.34f, 0.44f, -0.25f, 1.07f, 0.19f, 1.4f)
                curveToRelative(1.05f, 0.81f, 2.3f, 1.23f, 3.61f, 1.23f)
                lineToRelative(11f, 0.01f)
                curveToRelative(0.33f, 0f, 0.65f, -0.17f, 0.83f, -0.45f)
                curveToRelative(0.05f, -0.07f, 1.17f, -1.78f, 1.17f, -4.55f)
                curveToRelative(0f, -5.61f, -4.61f, -10f, -10.5f, -10f)
                close()
                moveTo(23.12f, 22.39f)
                lineTo(22.98f, 23.17f)
                curveToRelative(-0.08f, 0.48f, -0.5f, 0.83f, -0.98f, 0.83f)
                horizontalLineToRelative(-4.13f)
                curveToRelative(0.45f, -0.9f, 1.13f, -2.63f, 1.13f, -5f)
                curveToRelative(0f, -4.16f, -2.1f, -7.76f, -5.36f, -9.9f)
                curveToRelative(-0.56f, -1.79f, -1.75f, -2.99f, -3.18f, -3.71f)
                curveToRelative(-0.18f, 0.92f, -0.99f, 1.61f, -1.96f, 1.61f)
                curveToRelative(-1.01f, 0f, -1.84f, -0.75f, -1.97f, -1.73f)
                curveToRelative(-0.37f, 0.44f, -0.91f, 0.72f, -1.53f, 0.72f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0.01f, -0.46f, 0.18f, -0.93f, 0.47f, -1.27f)
                curveToRelative(0.96f, -1.37f, 3.4f, -2.73f, 7.09f, -2.73f)
                curveToRelative(7.57f, 0f, 13.49f, 5.6f, 13.49f, 12.76f)
                curveToRelative(0.15f, 3.47f, -0.4f, 6.6f, -0.93f, 9.63f)
                close()
            }
        }.also { _SeaWave = it}
