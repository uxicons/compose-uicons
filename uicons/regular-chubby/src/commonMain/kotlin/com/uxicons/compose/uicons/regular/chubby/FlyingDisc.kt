package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingDisc: ImageVector? = null

val Icons.Rc.FlyingDisc: ImageVector
    get() = _FlyingDisc ?: UXIcon(name = "FlyingDisc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 3.48f)
                curveToRelative(-1.64f, -1.65f, -3.52f, -2.48f, -5.58f, -2.48f)
                curveToRelative(-2.83f, 0f, -5.89f, 1.62f, -9.08f, 4.82f)
                curveToRelative(-7.03f, 7.04f, -5.15f, 11.87f, -2.34f, 14.68f)
                curveToRelative(1.65f, 1.66f, 3.53f, 2.5f, 5.58f, 2.5f)
                curveToRelative(2.82f, 0f, 5.88f, -1.63f, 9.08f, -4.84f)
                curveToRelative(7.02f, -7.04f, 5.15f, -11.87f, 2.34f, -14.68f)
                close()
                moveTo(7.25f, 7.23f)
                curveToRelative(2.81f, -2.81f, 5.38f, -4.23f, 7.67f, -4.23f)
                curveToRelative(0.53f, 0f, 1.05f, 0.08f, 1.55f, 0.24f)
                curveToRelative(0.06f, 0.1f, 0.13f, 0.21f, 0.16f, 0.26f)
                curveToRelative(1.55f, 2.65f, 0.41f, 5.93f, -3.39f, 9.74f)
                curveToRelative(-3.86f, 3.87f, -7.18f, 4.98f, -9.86f, 3.31f)
                lineToRelative(-0.13f, -0.07f)
                curveToRelative(-0.82f, -2.65f, 0.51f, -5.75f, 4.0f, -9.23f)
                close()
                moveTo(16.75f, 16.75f)
                curveToRelative(-4.61f, 4.61f, -8.53f, 5.5f, -11.68f, 2.49f)
                curveToRelative(0.28f, 0.04f, 0.58f, 0.06f, 0.88f, 0.06f)
                curveToRelative(2.29f, 0f, 5.2f, -1.13f, 8.71f, -4.65f)
                curveToRelative(3.46f, -3.46f, 5.0f, -6.67f, 4.61f, -9.57f)
                curveToRelative(2.94f, 3.13f, 2.09f, 7.05f, -2.52f, 11.67f)
                close()
            }
        }.also { _FlyingDisc = it}
