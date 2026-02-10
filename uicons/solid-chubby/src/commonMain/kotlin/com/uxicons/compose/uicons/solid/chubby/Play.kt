package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Sc.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.43f, 10.1f)
                curveToRelative(-1.23f, -1.45f, -3.42f, -3.62f, -6.83f, -5.78f)
                curveToRelative(-2.81f, -1.77f, -5.31f, -2.72f, -6.92f, -3.19f)
                curveToRelative(-0.9f, -0.27f, -1.85f, -0.1f, -2.61f, 0.46f)
                curveToRelative(-0.76f, 0.57f, -1.19f, 1.43f, -1.19f, 2.38f)
                verticalLineTo(20.04f)
                curveToRelative(0f, 0.94f, 0.44f, 1.81f, 1.19f, 2.38f)
                curveToRelative(0.52f, 0.39f, 1.14f, 0.59f, 1.76f, 0.59f)
                curveToRelative(0.28f, 0f, 0.57f, -0.04f, 0.85f, -0.12f)
                curveToRelative(1.6f, -0.48f, 4.11f, -1.42f, 6.92f, -3.19f)
                curveToRelative(3.42f, -2.16f, 5.6f, -4.33f, 6.83f, -5.78f)
                curveToRelative(0.94f, -1.1f, 0.94f, -2.7f, 0f, -3.81f)
                close()
            }
        }.also { _Play = it}
