package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brain: ImageVector? = null

val Icons.Sc.Brain: ImageVector
    get() = _Brain ?: UXIcon(name = "Brain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6.01f)
                curveToRelative(-0.05f, -2.27f, -1.52f, -3.0f, -3.46f, -3.02f)
                curveToRelative(-1.93f, 0.01f, -3.39f, 0.72f, -3.46f, 2.95f)
                curveToRelative(-1.18f, 0.34f, -1.96f, 1.17f, -2.0f, 2.83f)
                curveToRelative(0.01f, 0.48f, 0.09f, 0.9f, 0.23f, 1.25f)
                curveToRelative(-0.79f, 0.61f, -1.27f, 1.59f, -1.3f, 3.07f)
                curveToRelative(0.04f, 1.88f, 0.88f, 2.99f, 2.17f, 3.53f)
                curveToRelative(-0.06f, 0.28f, -0.09f, 0.58f, -0.1f, 0.91f)
                curveToRelative(0.05f, 2.51f, 1.74f, 3.44f, 3.96f, 3.45f)
                curveToRelative(2.23f, -0.01f, 3.91f, -0.89f, 3.96f, -3.45f)
                verticalLineTo(6.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6.01f)
                curveToRelative(0.05f, -2.27f, 1.52f, -3.0f, 3.46f, -3.02f)
                curveToRelative(1.93f, 0.01f, 3.39f, 0.72f, 3.46f, 2.95f)
                curveToRelative(1.18f, 0.34f, 1.96f, 1.17f, 2.0f, 2.83f)
                curveToRelative(-0.01f, 0.48f, -0.09f, 0.9f, -0.23f, 1.25f)
                curveToRelative(0.79f, 0.61f, 1.27f, 1.59f, 1.3f, 3.07f)
                curveToRelative(-0.04f, 1.88f, -0.88f, 2.99f, -2.17f, 3.53f)
                curveToRelative(0.06f, 0.28f, 0.09f, 0.58f, 0.1f, 0.91f)
                curveToRelative(-0.05f, 2.51f, -1.74f, 3.44f, -3.96f, 3.45f)
                curveToRelative(-2.23f, -0.01f, -3.91f, -0.89f, -3.96f, -3.45f)
                verticalLineTo(6.01f)
                close()
            }
        }.also { _Brain = it}
