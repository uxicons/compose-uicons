package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flame: ImageVector? = null

val Icons.Sc.Flame: ImageVector
    get() = _Flame ?: UXIcon(name = "Flame") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.59f, 18.45f)
                curveToRelative(-0.04f, -1.27f, -1.56f, -2.99f, -2.58f, -3.97f)
                curveToRelative(-1.18f, 1.15f, -2.58f, 2.88f, -2.6f, 4.0f)
                curveToRelative(0.04f, 1.14f, 1.36f, 2.8f, 2.61f, 2.82f)
                curveToRelative(1.21f, -0.02f, 2.52f, -1.66f, 2.58f, -2.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.43f, 2.11f)
                curveToRelative(-2.27f, -1.36f, -2.63f, -1.16f, -2.95f, -0.98f)
                lineToRelative(-0.01f, 0.0f)
                curveToRelative(-2.76f, 1.59f, -4.36f, 3.83f, -4.63f, 6.48f)
                lineToRelative(-0.41f, -0.41f)
                curveToRelative(-0.21f, -0.21f, -0.5f, -0.31f, -0.79f, -0.29f)
                curveToRelative(-0.29f, 0.02f, -0.56f, 0.17f, -0.73f, 0.41f)
                curveToRelative(-1.48f, 2.0f, -2.29f, 4.48f, -2.33f, 7.22f)
                curveToRelative(0.13f, 4.07f, 3.71f, 7.73f, 8.0f, 8.46f)
                curveToRelative(-1.8f, -0.76f, -3.13f, -2.79f, -3.19f, -4.51f)
                curveToRelative(0.05f, -2.72f, 3.55f, -5.79f, 3.95f, -6.13f)
                curveToRelative(0.37f, -0.32f, 0.92f, -0.32f, 1.29f, -0.01f)
                curveToRelative(0.4f, 0.33f, 3.96f, 3.3f, 3.96f, 6.1f)
                curveToRelative(0f, 1.71f, -1.39f, 3.8f, -3.18f, 4.56f)
                curveToRelative(4.27f, -0.73f, 7.86f, -4.39f, 7.99f, -8.47f)
                curveToRelative(0.19f, -7.04f, -4.29f, -10.81f, -6.98f, -12.43f)
                close()
            }
        }.also { _Flame = it}
