package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LacrosseStick: ImageVector? = null

val Icons.Ss.LacrosseStick: ImageVector
    get() = _LacrosseStick ?: UXIcon(name = "LacrosseStick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 7.59f)
                curveToRelative(-0.2f, -1.83f, -1.1f, -3.62f, -2.52f, -5.03f)
                curveTo(20.02f, 1.14f, 18.23f, 0.25f, 16.41f, 0.04f)
                curveToRelative(-1.91f, -0.21f, -3.64f, 0.35f, -4.87f, 1.57f)
                curveToRelative(-0.91f, 0.91f, -1.46f, 2.12f, -1.58f, 3.49f)
                curveToRelative(-0.08f, 0.89f, -0.64f, 1.76f, -1.52f, 2.39f)
                curveToRelative(-1.96f, 1.39f, -2.84f, 3.83f, -2.24f, 6.2f)
                curveToRelative(0.17f, 0.67f, 0.46f, 1.29f, 0.85f, 1.85f)
                lineTo(0.06f, 22.52f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.98f, -6.98f)
                curveToRelative(0.56f, 0.39f, 1.18f, 0.68f, 1.85f, 0.85f)
                curveToRelative(0.49f, 0.12f, 0.99f, 0.19f, 1.48f, 0.19f)
                curveToRelative(1.86f, 0f, 3.62f, -0.88f, 4.72f, -2.43f)
                curveToRelative(0.63f, -0.89f, 1.5f, -1.44f, 2.39f, -1.52f)
                curveToRelative(1.37f, -0.12f, 2.58f, -0.67f, 3.49f, -1.59f)
                curveToRelative(1.23f, -1.23f, 1.78f, -2.95f, 1.57f, -4.87f)
                close()
            }
        }.also { _LacrosseStick = it}
