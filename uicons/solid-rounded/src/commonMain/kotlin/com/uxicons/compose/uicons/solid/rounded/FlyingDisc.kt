package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingDisc: ImageVector? = null

val Icons.Sr.FlyingDisc: ImageVector
    get() = _FlyingDisc ?: UXIcon(name = "FlyingDisc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.06f, 17.07f)
                curveToRelative(-0.18f, -3.67f, 1.69f, -8.13f, 5.3f, -11.74f)
                curveTo(7.96f, 2.73f, 11.08f, 0.93f, 14.14f, 0.27f)
                curveTo(15.15f, 0.05f, 16.12f, -0.04f, 17.04f, 0.0f)
                curveToRelative(0.31f, 0.17f, 0.59f, 0.37f, 0.84f, 0.61f)
                curveToRelative(2.54f, 2.54f, 0.73f, 8.62f, -3.94f, 13.29f)
                curveToRelative(-4.67f, 4.67f, -10.75f, 6.47f, -13.29f, 3.94f)
                curveToRelative(-0.23f, -0.23f, -0.42f, -0.49f, -0.58f, -0.78f)
                close()
                moveTo(21.98f, 2.04f)
                curveToRelative(-0.45f, -0.45f, -0.96f, -0.83f, -1.53f, -1.14f)
                curveToRelative(1.67f, 3.74f, -0.29f, 9.61f, -5.1f, 14.42f)
                curveToRelative(-2.61f, 2.61f, -5.67f, 4.48f, -8.62f, 5.27f)
                curveToRelative(-1.01f, 0.27f, -1.98f, 0.41f, -2.87f, 0.41f)
                curveToRelative(-1.08f, 0f, -2.06f, -0.19f, -2.91f, -0.57f)
                curveToRelative(0.3f, 0.56f, 0.67f, 1.07f, 1.13f, 1.52f)
                curveToRelative(1.35f, 1.35f, 3.21f, 2.05f, 5.38f, 2.05f)
                curveToRelative(0.78f, 0f, 1.6f, -0.09f, 2.46f, -0.28f)
                curveToRelative(3.06f, -0.66f, 6.17f, -2.46f, 8.78f, -5.06f)
                curveToRelative(5.49f, -5.49f, 6.96f, -12.94f, 3.29f, -16.62f)
                close()
            }
        }.also { _FlyingDisc = it}
