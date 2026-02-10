package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingDisc: ImageVector? = null

val Icons.Tc.FlyingDisc: ImageVector
    get() = _FlyingDisc ?: UXIcon(name = "FlyingDisc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.54f, 3.44f)
                curveToRelative(-3.89f, -3.9f, -9.06f, -3.11f, -14.62f, 2.46f)
                curveToRelative(-7.05f, 7.07f, -5.23f, 11.86f, -2.46f, 14.64f)
                curveToRelative(1.63f, 1.63f, 3.47f, 2.46f, 5.47f, 2.46f)
                curveToRelative(2.81f, 0f, 5.89f, -1.66f, 9.14f, -4.92f)
                curveToRelative(7.05f, -7.07f, 5.23f, -11.86f, 2.46f, -14.64f)
                close()
                moveTo(6.62f, 6.61f)
                curveToRelative(3.05f, -3.06f, 5.89f, -4.61f, 8.44f, -4.61f)
                curveToRelative(0.67f, 0f, 1.31f, 0.11f, 1.93f, 0.32f)
                curveToRelative(0.11f, 0.15f, 0.29f, 0.41f, 0.33f, 0.48f)
                curveToRelative(1.77f, 3.03f, 0.55f, 6.69f, -3.64f, 10.89f)
                curveToRelative(-4.28f, 4.28f, -7.98f, 5.5f, -11.0f, 3.62f)
                curveToRelative(-0.14f, -0.09f, -0.35f, -0.26f, -0.36f, -0.27f)
                curveToRelative(-1.06f, -3.01f, 0.37f, -6.51f, 4.29f, -10.43f)
                close()
                moveTo(17.37f, 17.37f)
                curveToRelative(-5.15f, 5.16f, -9.66f, 6.01f, -13.2f, 2.46f)
                curveToRelative(-0.37f, -0.37f, -0.7f, -0.76f, -0.97f, -1.15f)
                curveToRelative(0.79f, 0.33f, 1.6f, 0.49f, 2.45f, 0.49f)
                curveToRelative(2.65f, 0f, 5.58f, -1.6f, 8.76f, -4.78f)
                curveToRelative(4.19f, -4.19f, 5.6f, -7.97f, 4.22f, -11.25f)
                curveToRelative(0.41f, 0.28f, 0.82f, 0.62f, 1.21f, 1.01f)
                curveToRelative(3.57f, 3.57f, 2.74f, 8.02f, -2.46f, 13.23f)
                close()
            }
        }.also { _FlyingDisc = it}
