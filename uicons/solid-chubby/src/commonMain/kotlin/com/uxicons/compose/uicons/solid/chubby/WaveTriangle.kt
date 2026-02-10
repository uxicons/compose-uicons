package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Sc.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.15f, -1.05f, -0.43f)
                curveToRelative(-2.33f, -2.27f, -4.14f, -5.6f, -5.29f, -7.9f)
                curveToRelative(-0.85f, -1.7f, -2.09f, -4.0f, -3.59f, -5.86f)
                curveToRelative(-1.49f, 2.09f, -2.35f, 4.39f, -3.13f, 7.1f)
                curveToRelative(-0.23f, 0.8f, -1.06f, 1.26f, -1.85f, 1.03f)
                curveToRelative(-0.8f, -0.23f, -1.26f, -1.06f, -1.03f, -1.85f)
                curveToRelative(0.91f, -3.19f, 2.12f, -6.55f, 4.82f, -9.59f)
                curveToRelative(0.27f, -0.31f, 0.66f, -0.49f, 1.07f, -0.5f)
                curveToRelative(0.41f, -0.02f, 0.81f, 0.14f, 1.1f, 0.43f)
                curveToRelative(2.33f, 2.27f, 4.14f, 5.6f, 5.29f, 7.9f)
                curveToRelative(0.85f, 1.7f, 2.09f, 4.0f, 3.59f, 5.86f)
                curveToRelative(1.49f, -2.09f, 2.35f, -4.39f, 3.13f, -7.1f)
                curveToRelative(0.23f, -0.8f, 1.06f, -1.26f, 1.85f, -1.03f)
                curveToRelative(0.8f, 0.23f, 1.26f, 1.06f, 1.03f, 1.85f)
                curveToRelative(-0.91f, 3.19f, -2.12f, 6.55f, -4.82f, 9.59f)
                curveToRelative(-0.28f, 0.32f, -0.69f, 0.5f, -1.12f, 0.5f)
                close()
            }
        }.also { _WaveTriangle = it}
