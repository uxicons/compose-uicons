package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingDisc: ImageVector? = null

val Icons.Sc.FlyingDisc: ImageVector
    get() = _FlyingDisc ?: UXIcon(name = "FlyingDisc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.59f, 12.65f)
                curveToRelative(4.43f, -4.45f, 5.79f, -8.29f, 4.05f, -11.44f)
                curveToRelative(-0.56f, -0.14f, -1.13f, -0.21f, -1.72f, -0.21f)
                curveToRelative(-2.83f, 0f, -5.88f, 1.62f, -9.07f, 4.82f)
                curveToRelative(-4.52f, 4.54f, -5.35f, 8.16f, -4.61f, 10.91f)
                curveToRelative(3.13f, 1.71f, 6.95f, 0.34f, 11.36f, -4.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 3.48f)
                curveToRelative(-0.41f, -0.41f, -0.83f, -0.77f, -1.27f, -1.08f)
                curveToRelative(0.77f, 3.49f, -0.97f, 7.4f, -5.21f, 11.66f)
                curveToRelative(-4.05f, 4.06f, -7.4f, 5.37f, -10.03f, 5.37f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.05f, -1.5f, -0.15f)
                curveToRelative(0.32f, 0.44f, 0.67f, 0.84f, 1.04f, 1.21f)
                curveToRelative(1.65f, 1.66f, 3.53f, 2.5f, 5.57f, 2.5f)
                curveToRelative(2.81f, 0f, 5.86f, -1.63f, 9.06f, -4.84f)
                curveToRelative(7.01f, -7.04f, 5.14f, -11.87f, 2.33f, -14.68f)
                close()
            }
        }.also { _FlyingDisc = it}
