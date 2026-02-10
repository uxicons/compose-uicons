package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneAlt: ImageVector? = null

val Icons.Sc.PlaneAlt: ImageVector
    get() = _PlaneAlt ?: UXIcon(name = "PlaneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.6f, 8.23f)
                curveToRelative(-1.39f, -1.76f, -4.44f, -5.06f, -7.81f, -5.06f)
                curveToRelative(-0.49f, 0f, -0.93f, 0.25f, -1.16f, 0.67f)
                curveToRelative(-0.57f, 1.01f, 0.35f, 3.17f, 1.22f, 4.79f)
                curveToRelative(-0.83f, 0.09f, -1.64f, 0.22f, -2.15f, 0.31f)
                curveToRelative(-1.2f, -1.03f, -3.16f, -1.89f, -4.4f, -1.62f)
                curveToRelative(-0.59f, 0.13f, -1.04f, 0.5f, -1.22f, 1.03f)
                curveToRelative(-0.09f, 0.26f, -0.32f, 0.93f, 0.91f, 3.65f)
                curveToRelative(-1.23f, 2.72f, -1.0f, 3.38f, -0.91f, 3.64f)
                curveToRelative(0.18f, 0.53f, 0.63f, 0.92f, 1.23f, 1.04f)
                curveToRelative(1.26f, 0.27f, 3.2f, -0.57f, 4.38f, -1.59f)
                curveToRelative(0.5f, 0.08f, 1.31f, 0.2f, 2.14f, 0.29f)
                curveToRelative(-0.85f, 1.62f, -1.76f, 3.77f, -1.2f, 4.77f)
                curveToRelative(0.23f, 0.42f, 0.67f, 0.67f, 1.16f, 0.67f)
                curveToRelative(3.37f, 0f, 6.42f, -3.3f, 7.81f, -5.06f)
                curveToRelative(5.28f, -0.51f, 6.4f, -2.32f, 6.4f, -3.77f)
                reflectiveCurveToRelative(-1.12f, -3.25f, -6.4f, -3.77f)
                close()
            }
        }.also { _PlaneAlt = it}
