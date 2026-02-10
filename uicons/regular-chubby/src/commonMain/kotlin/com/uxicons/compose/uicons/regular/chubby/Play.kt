package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Rc.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.43f, 10.1f)
                curveToRelative(-1.23f, -1.45f, -3.42f, -3.62f, -6.83f, -5.78f)
                curveToRelative(-2.81f, -1.77f, -5.31f, -2.72f, -6.92f, -3.19f)
                curveToRelative(-0.9f, -0.27f, -1.85f, -0.1f, -2.61f, 0.46f)
                curveToRelative(-0.76f, 0.57f, -1.19f, 1.43f, -1.19f, 2.38f)
                lineTo(2.87f, 20.04f)
                curveToRelative(0f, 0.94f, 0.44f, 1.81f, 1.19f, 2.38f)
                curveToRelative(0.52f, 0.39f, 1.14f, 0.59f, 1.76f, 0.59f)
                curveToRelative(0.28f, 0f, 0.57f, -0.04f, 0.85f, -0.12f)
                curveToRelative(1.6f, -0.48f, 4.11f, -1.42f, 6.92f, -3.19f)
                curveToRelative(3.42f, -2.16f, 5.6f, -4.33f, 6.83f, -5.78f)
                curveToRelative(0.94f, -1.1f, 0.94f, -2.7f, 0f, -3.81f)
                close()
                moveTo(18.9f, 12.61f)
                curveToRelative(-1.14f, 1.34f, -3.17f, 3.36f, -6.38f, 5.38f)
                curveToRelative(-2.62f, 1.65f, -4.93f, 2.53f, -6.42f, 2.97f)
                curveToRelative(-0.29f, 0.09f, -0.6f, 0.03f, -0.85f, -0.15f)
                curveToRelative(-0.25f, -0.18f, -0.39f, -0.47f, -0.39f, -0.77f)
                lineTo(4.87f, 3.96f)
                curveToRelative(0f, -0.31f, 0.14f, -0.59f, 0.39f, -0.77f)
                curveToRelative(0.17f, -0.13f, 0.37f, -0.19f, 0.57f, -0.19f)
                curveToRelative(0.09f, 0f, 0.18f, 0.01f, 0.28f, 0.04f)
                curveToRelative(1.48f, 0.44f, 3.8f, 1.31f, 6.42f, 2.97f)
                curveToRelative(3.2f, 2.02f, 5.24f, 4.04f, 6.38f, 5.38f)
                curveToRelative(0.3f, 0.35f, 0.3f, 0.86f, 0f, 1.21f)
                close()
            }
        }.also { _Play = it}
