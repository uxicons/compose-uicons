package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Tc.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-1.9f, -1.93f, -3.15f, -4.54f, -4.46f, -7.31f)
                curveToRelative(-0.42f, -0.88f, -0.86f, -1.78f, -1.27f, -2.66f)
                curveToRelative(-1.19f, -2.49f, -2.31f, -4.86f, -3.89f, -6.63f)
                curveToRelative(-2.25f, 2.77f, -3.95f, 6.26f, -5.04f, 10.37f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.35f)
                curveToRelative(-0.27f, -0.07f, -0.43f, -0.34f, -0.35f, -0.61f)
                curveToRelative(1.19f, -4.48f, 3.07f, -8.25f, 5.6f, -11.2f)
                curveToRelative(0.09f, -0.11f, 0.22f, -0.17f, 0.36f, -0.17f)
                curveToRelative(0.14f, -0.0f, 0.28f, 0.05f, 0.37f, 0.15f)
                curveToRelative(1.9f, 1.93f, 3.15f, 4.54f, 4.46f, 7.31f)
                curveToRelative(0.42f, 0.88f, 0.86f, 1.78f, 1.27f, 2.66f)
                curveToRelative(1.19f, 2.49f, 2.31f, 4.86f, 3.89f, 6.63f)
                curveToRelative(2.25f, -2.77f, 3.95f, -6.26f, 5.04f, -10.37f)
                curveToRelative(0.07f, -0.27f, 0.34f, -0.43f, 0.61f, -0.35f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.35f, 0.61f)
                curveToRelative(-1.19f, 4.48f, -3.07f, 8.25f, -5.6f, 11.2f)
                curveToRelative(-0.1f, 0.11f, -0.23f, 0.18f, -0.38f, 0.17f)
                close()
            }
        }.also { _WaveTriangle = it}
