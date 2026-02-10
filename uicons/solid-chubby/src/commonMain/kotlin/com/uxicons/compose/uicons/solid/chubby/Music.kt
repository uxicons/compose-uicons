package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Music: ImageVector? = null

val Icons.Sc.Music: ImageVector
    get() = _Music ?: UXIcon(name = "Music") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12.09f)
                curveToRelative(0f, -4.69f, -0.77f, -8.15f, -0.8f, -8.29f)
                curveToRelative(-0.11f, -0.49f, -0.46f, -0.89f, -0.93f, -1.07f)
                curveToRelative(-0.12f, -0.05f, -3.01f, -1.13f, -6.41f, -1.13f)
                reflectiveCurveToRelative(-6.29f, 1.09f, -6.41f, 1.13f)
                curveToRelative(-0.47f, 0.18f, -0.82f, 0.58f, -0.93f, 1.08f)
                curveToRelative(-0.03f, 0.15f, -0.8f, 3.64f, -0.8f, 8.29f)
                curveToRelative(0f, 0.41f, 0.01f, 0.82f, 0.02f, 1.24f)
                curveToRelative(-0.37f, -0.06f, -0.78f, -0.09f, -1.22f, -0.09f)
                curveToRelative(-3.05f, 0f, -4.53f, 1.5f, -4.53f, 4.58f)
                reflectiveCurveToRelative(1.48f, 4.58f, 4.53f, 4.58f)
                reflectiveCurveToRelative(4.53f, -1.5f, 4.53f, -4.58f)
                curveToRelative(0f, -0.35f, -0.06f, -1.05f, -0.06f, -1.08f)
                curveToRelative(-0.17f, -1.54f, -0.26f, -3.11f, -0.26f, -4.64f)
                curveToRelative(0f, -3.03f, 0.36f, -5.57f, 0.57f, -6.81f)
                curveToRelative(0.95f, -0.28f, 2.67f, -0.69f, 4.56f, -0.69f)
                reflectiveCurveToRelative(3.61f, 0.41f, 4.57f, 0.69f)
                curveToRelative(0.21f, 1.24f, 0.57f, 3.76f, 0.57f, 6.81f)
                curveToRelative(0f, 0.45f, -0.01f, 0.9f, -0.02f, 1.35f)
                curveToRelative(-0.51f, -0.14f, -1.1f, -0.21f, -1.75f, -0.21f)
                curveToRelative(-3.05f, 0f, -4.53f, 1.5f, -4.53f, 4.58f)
                reflectiveCurveToRelative(1.48f, 4.58f, 4.53f, 4.58f)
                reflectiveCurveToRelative(4.53f, -1.5f, 4.53f, -4.58f)
                curveToRelative(0f, -0.26f, -0.01f, -0.51f, -0.03f, -0.75f)
                curveToRelative(0.19f, -1.66f, 0.28f, -3.34f, 0.28f, -4.98f)
                close()
            }
        }.also { _Music = it}
