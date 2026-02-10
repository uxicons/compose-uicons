package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Alien: ImageVector? = null

val Icons.Br.Alien: ImageVector
    get() = _Alien ?: UXIcon(name = "Alien") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(6.49f, 0f, 2f, 4.47f, 2f, 9.98f)
            curveToRelative(0f, 5.15f, 4.43f, 10.24f, 7.07f, 12.83f)
            curveToRelative(0.82f, 0.8f, 1.88f, 1.21f, 2.93f, 1.21f)
            reflectiveCurveToRelative(2.11f, -0.4f, 2.93f, -1.21f)
            curveToRelative(2.64f, -2.58f, 7.07f, -7.68f, 7.07f, -12.83f)
            curveTo(22f, 4.47f, 17.51f, 0f, 12f, 0f)
            close()
            moveTo(12.84f, 20.66f)
            curveToRelative(-0.47f, 0.46f, -1.2f, 0.46f, -1.67f, 0f)
            curveToRelative(-3.92f, -3.83f, -6.17f, -7.73f, -6.17f, -10.68f)
            curveToRelative(0f, -3.85f, 3.14f, -6.98f, 7f, -6.98f)
            reflectiveCurveToRelative(7f, 3.13f, 7f, 6.98f)
            curveToRelative(0f, 2.96f, -2.25f, 6.85f, -6.17f, 10.68f)
            close()
            moveTo(18.0f, 9.11f)
            curveToRelative(-0.05f, 0.91f, -0.27f, 2.15f, -1.0f, 2.88f)
            curveToRelative(-0.73f, 0.73f, -1.98f, 0.95f, -2.88f, 1.0f)
            curveToRelative(-0.63f, 0.04f, -1.15f, -0.48f, -1.11f, -1.11f)
            curveToRelative(0.05f, -0.91f, 0.27f, -2.15f, 1.0f, -2.88f)
            curveToRelative(0.73f, -0.73f, 1.98f, -0.95f, 2.88f, -1.0f)
            curveToRelative(0.63f, -0.04f, 1.15f, 0.48f, 1.11f, 1.11f)
            close()
            moveTo(11.0f, 11.89f)
            curveToRelative(0.04f, 0.63f, -0.48f, 1.15f, -1.11f, 1.11f)
            curveToRelative(-0.91f, -0.05f, -2.15f, -0.27f, -2.88f, -1.0f)
            curveToRelative(-0.73f, -0.73f, -0.95f, -1.98f, -1.0f, -2.88f)
            curveToRelative(-0.04f, -0.63f, 0.48f, -1.15f, 1.11f, -1.11f)
            curveToRelative(0.91f, 0.05f, 2.15f, 0.27f, 2.88f, 1.0f)
            curveToRelative(0.73f, 0.73f, 0.95f, 1.98f, 1.0f, 2.88f)
            close()
        }
    }.also { _Alien = it }
