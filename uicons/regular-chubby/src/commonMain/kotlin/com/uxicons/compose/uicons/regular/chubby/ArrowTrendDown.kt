package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Rc.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.74f, 8.64f)
                curveToRelative(-0.24f, -0.5f, -0.84f, -0.7f, -1.34f, -0.46f)
                curveToRelative(-0.5f, 0.24f, -0.7f, 0.84f, -0.46f, 1.34f)
                curveToRelative(1.28f, 2.62f, 1.16f, 4.63f, 0.86f, 5.82f)
                lineToRelative(-6.18f, -5.92f)
                curveToRelative(-0.77f, -0.74f, -1.78f, -1.13f, -2.83f, -1.09f)
                curveToRelative(-1.05f, 0.04f, -2.02f, 0.51f, -2.73f, 1.32f)
                curveToRelative(-0.34f, 0.39f, -0.81f, 0.62f, -1.31f, 0.64f)
                curveToRelative(-0.48f, 0.01f, -0.95f, -0.15f, -1.32f, -0.49f)
                lineTo(2.77f, 5.36f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.49f, -1.41f, -0.14f)
                curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.14f, 1.41f)
                curveToRelative(0f, 0f, 3.75f, 4.54f, 3.78f, 4.57f)
                curveToRelative(0.77f, 0.74f, 1.79f, 1.14f, 2.83f, 1.09f)
                curveToRelative(1.05f, -0.04f, 2.02f, -0.51f, 2.73f, -1.32f)
                curveToRelative(0.34f, -0.39f, 0.81f, -0.62f, 1.31f, -0.64f)
                curveToRelative(0.52f, -0.02f, 0.98f, 0.17f, 1.36f, 0.53f)
                lineToRelative(6.2f, 5.94f)
                curveToRelative(-1.12f, 0.31f, -3.03f, 0.44f, -5.51f, -0.89f)
                curveToRelative(-0.49f, -0.26f, -1.09f, -0.08f, -1.35f, 0.41f)
                curveToRelative(-0.26f, 0.49f, -0.08f, 1.09f, 0.41f, 1.35f)
                curveToRelative(1.88f, 1.0f, 3.53f, 1.33f, 4.88f, 1.33f)
                curveToRelative(2.37f, 0f, 3.79f, -1.0f, 3.88f, -1.07f)
                curveToRelative(0.1f, -0.07f, 0.18f, -0.16f, 0.24f, -0.26f)
                curveToRelative(0.1f, -0.15f, 2.38f, -3.67f, -0.25f, -9.04f)
                close()
            }
        }.also { _ArrowTrendDown = it}
