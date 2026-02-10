package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Rc.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-2.07f, -2.07f, -3.52f, -4.85f, -5.19f, -8.27f)
                curveToRelative(-1.37f, -2.8f, -2.57f, -5.13f, -4.06f, -6.91f)
                curveToRelative(-1.83f, 2.36f, -3.1f, 5.1f, -4.08f, 8.73f)
                curveToRelative(-0.14f, 0.53f, -0.69f, 0.85f, -1.23f, 0.71f)
                curveToRelative(-0.53f, -0.14f, -0.85f, -0.69f, -0.71f, -1.23f)
                curveToRelative(1.18f, -4.39f, 2.79f, -7.6f, 5.21f, -10.39f)
                curveToRelative(0.18f, -0.21f, 0.44f, -0.33f, 0.72f, -0.34f)
                curveToRelative(0.27f, -0.02f, 0.55f, 0.1f, 0.74f, 0.29f)
                curveToRelative(2.07f, 2.07f, 3.52f, 4.85f, 5.19f, 8.27f)
                curveToRelative(1.37f, 2.8f, 2.57f, 5.13f, 4.06f, 6.91f)
                curveToRelative(1.83f, -2.36f, 3.1f, -5.1f, 4.08f, -8.73f)
                curveToRelative(0.14f, -0.53f, 0.69f, -0.85f, 1.23f, -0.71f)
                curveToRelative(0.53f, 0.14f, 0.85f, 0.69f, 0.71f, 1.23f)
                curveToRelative(-1.18f, 4.4f, -2.79f, 7.6f, -5.21f, 10.4f)
                curveToRelative(-0.18f, 0.21f, -0.44f, 0.33f, -0.72f, 0.34f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.04f, 0f)
                close()
            }
        }.also { _WaveTriangle = it}
