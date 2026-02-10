package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateReverse: ImageVector? = null

val Icons.Sc.RotateReverse: ImageVector
    get() = _RotateReverse ?: UXIcon(name = "RotateReverse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.66f, 11.86f)
                curveToRelative(1.17f, -0.53f, 1.61f, -0.9f, 2.43f, -1.86f)
                curveToRelative(0.54f, -0.63f, 0.46f, -1.58f, -0.17f, -2.11f)
                curveToRelative(-0.25f, -0.21f, -0.55f, -0.33f, -0.86f, -0.35f)
                curveToRelative(0.84f, -2.04f, 2.69f, -2.85f, 6.02f, -2.85f)
                curveToRelative(4.16f, 0f, 5.9f, 1.18f, 6.42f, 4.35f)
                curveToRelative(0.14f, 0.82f, 0.92f, 1.37f, 1.73f, 1.23f)
                curveToRelative(0.82f, -0.14f, 1.37f, -0.91f, 1.23f, -1.73f)
                curveTo(20.44f, 2.39f, 15.62f, 1.68f, 12.08f, 1.68f)
                curveToRelative(-1.96f, 0f, -7.39f, 0f, -9.07f, 5.57f)
                curveToRelative(-0.37f, -0.13f, -0.8f, -0.12f, -1.18f, 0.07f)
                curveToRelative(-0.74f, 0.37f, -1.03f, 1.28f, -0.66f, 2.02f)
                curveToRelative(0.57f, 1.12f, 0.93f, 1.56f, 1.93f, 2.35f)
                curveToRelative(0.27f, 0.21f, 0.86f, 0.5f, 1.56f, 0.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.84f, 14.66f)
                curveToRelative(-0.57f, -1.12f, -0.93f, -1.56f, -1.93f, -2.35f)
                curveToRelative(-0.45f, -0.35f, -1.05f, -0.42f, -1.56f, -0.17f)
                curveToRelative(-1.16f, 0.55f, -1.61f, 0.9f, -2.43f, 1.86f)
                curveToRelative(-0.54f, 0.63f, -0.46f, 1.58f, 0.17f, 2.11f)
                curveToRelative(0.25f, 0.21f, 0.55f, 0.33f, 0.86f, 0.35f)
                curveToRelative(-0.84f, 2.04f, -2.69f, 2.85f, -6.02f, 2.85f)
                curveToRelative(-4.16f, 0f, -5.9f, -1.18f, -6.42f, -4.35f)
                curveToRelative(-0.14f, -0.82f, -0.92f, -1.38f, -1.73f, -1.23f)
                curveToRelative(-0.82f, 0.14f, -1.37f, 0.91f, -1.23f, 1.73f)
                curveToRelative(1.02f, 6.15f, 5.85f, 6.86f, 9.38f, 6.86f)
                curveToRelative(1.96f, 0f, 7.39f, 0f, 9.07f, -5.57f)
                curveToRelative(0.46f, 0.19f, 0.96f, 0.04f, 1.18f, -0.07f)
                curveToRelative(0.74f, -0.37f, 1.03f, -1.28f, 0.66f, -2.02f)
                close()
            }
        }.also { _RotateReverse = it}
