package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Sc.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.17f, 22.34f)
                curveToRelative(-0.88f, 0.44f, -1.8f, 0.66f, -2.74f, 0.66f)
                curveToRelative(-1.02f, 0f, -1.85f, -0.3f, -2.46f, -0.91f)
                curveToRelative(-0.2f, -0.2f, -0.34f, -0.45f, -0.41f, -0.72f)
                curveToRelative(-1.26f, -5.27f, -3.43f, -9.36f, -5.38f, -12.23f)
                curveToRelative(-1.8f, 1.62f, -6.1f, 6.08f, -7.19f, 12.61f)
                curveToRelative(-0.13f, 0.82f, -0.93f, 1.37f, -1.73f, 1.23f)
                curveToRelative(-0.82f, -0.14f, -1.37f, -0.91f, -1.23f, -1.73f)
                curveToRelative(1.29f, -7.73f, 6.35f, -12.8f, 8.35f, -14.54f)
                curveToRelative(-1.38f, -1.69f, -2.39f, -2.57f, -2.41f, -2.59f)
                curveToRelative(-0.09f, -0.08f, -0.22f, -0.14f, -0.55f, -0.12f)
                curveToRelative(-0.18f, 0.01f, -0.62f, 0.03f, -1.24f, 0.34f)
                curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.67f)
                curveToRelative(-0.37f, -0.74f, -0.07f, -1.64f, 0.67f, -2.01f)
                curveToRelative(0.79f, -0.39f, 1.6f, -0.61f, 2.4f, -0.65f)
                curveToRelative(1.14f, -0.07f, 2.08f, 0.24f, 2.75f, 0.9f)
                curveToRelative(0.23f, 0.19f, 7.29f, 6.33f, 10.32f, 18.09f)
                curveToRelative(0.06f, 0.0f, 0.14f, 0.01f, 0.23f, 0f)
                curveToRelative(0.2f, -0.01f, 0.67f, -0.03f, 1.29f, -0.34f)
                curveToRelative(0.74f, -0.37f, 1.64f, -0.07f, 2.01f, 0.67f)
                reflectiveCurveToRelative(0.07f, 1.64f, -0.67f, 2.01f)
                close()
            }
        }.also { _Lambda = it}
