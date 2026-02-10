package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bomb: ImageVector? = null

val Icons.Sc.Bomb: ImageVector
    get() = _Bomb ?: UXIcon(name = "Bomb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 9.14f)
                curveToRelative(0.38f, 0f, 0.72f, -0.21f, 0.89f, -0.55f)
                curveToRelative(0.13f, -0.26f, 0.24f, -0.52f, 0.33f, -0.77f)
                curveToRelative(0.08f, -0.22f, 0.23f, -0.37f, 0.45f, -0.45f)
                curveToRelative(0.26f, -0.1f, 0.51f, -0.2f, 0.77f, -0.33f)
                curveToRelative(0.34f, -0.17f, 0.55f, -0.52f, 0.55f, -0.89f)
                reflectiveCurveToRelative(-0.21f, -0.72f, -0.55f, -0.89f)
                curveToRelative(-0.26f, -0.13f, -0.52f, -0.24f, -0.77f, -0.33f)
                curveToRelative(-0.22f, -0.08f, -0.37f, -0.23f, -0.45f, -0.45f)
                curveToRelative(-0.1f, -0.26f, -0.2f, -0.51f, -0.33f, -0.77f)
                curveToRelative(-0.34f, -0.68f, -1.45f, -0.68f, -1.79f, 0f)
                curveToRelative(-0.13f, 0.26f, -0.24f, 0.52f, -0.33f, 0.77f)
                curveToRelative(-0.08f, 0.22f, -0.23f, 0.37f, -0.45f, 0.45f)
                curveToRelative(-0.26f, 0.1f, -0.51f, 0.2f, -0.77f, 0.33f)
                curveToRelative(-0.34f, 0.17f, -0.55f, 0.52f, -0.55f, 0.89f)
                reflectiveCurveToRelative(0.21f, 0.72f, 0.55f, 0.89f)
                curveToRelative(0.26f, 0.13f, 0.52f, 0.24f, 0.77f, 0.33f)
                curveToRelative(0.22f, 0.08f, 0.37f, 0.23f, 0.45f, 0.45f)
                curveToRelative(0.1f, 0.26f, 0.2f, 0.51f, 0.33f, 0.77f)
                curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.89f, 0.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.66f, 4.85f)
                curveToRelative(0.91f, -0.45f, 3.46f, -0.85f, 4.84f, -0.85f)
                curveToRelative(1.86f, 0f, 2.54f, 1.4f, 2.61f, 1.57f)
                curveToRelative(0.24f, 0.58f, 0.8f, 0.93f, 1.39f, 0.93f)
                curveToRelative(0.19f, 0f, 0.37f, -0.04f, 0.56f, -0.11f)
                curveToRelative(0.77f, -0.31f, 1.14f, -1.18f, 0.83f, -1.95f)
                curveToRelative(-0.51f, -1.28f, -2.22f, -3.44f, -5.39f, -3.44f)
                curveToRelative(-1.56f, 0f, -4.65f, 0.41f, -6.16f, 1.15f)
                curveToRelative(-0.74f, 0.37f, -1.05f, 1.26f, -0.68f, 2.01f)
                curveToRelative(0.37f, 0.74f, 1.27f, 1.05f, 2.01f, 0.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.12f, 12.26f)
                lineToRelative(0.13f, -0.13f)
                curveToRelative(0.03f, -0.03f, 0.06f, -0.07f, 0.09f, -0.11f)
                curveToRelative(0.42f, -0.56f, 0.72f, -1.9f, -0.8f, -3.43f)
                curveToRelative(-1.52f, -1.53f, -2.87f, -1.22f, -3.43f, -0.8f)
                curveToRelative(-0.04f, 0.03f, -0.07f, 0.06f, -0.1f, 0.09f)
                lineToRelative(-0.13f, 0.13f)
                curveToRelative(-2.76f, -1.63f, -5.37f, -1.0f, -8.35f, 1.99f)
                curveToRelative(-3.29f, 3.28f, -3.17f, 6.73f, 0.35f, 10.25f)
                curveToRelative(1.68f, 1.68f, 3.29f, 2.57f, 4.9f, 2.72f)
                curveToRelative(0.16f, 0.01f, 0.31f, 0.02f, 0.47f, 0.02f)
                curveToRelative(1.66f, 0f, 3.3f, -0.8f, 4.88f, -2.39f)
                curveToRelative(3.0f, -3.0f, 3.63f, -5.61f, 1.99f, -8.36f)
                close()
            }
        }.also { _Bomb = it}
