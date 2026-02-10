package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Rc.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(0f, 2.17f, -0.54f, 3.32f, -0.6f, 3.45f)
                curveToRelative(-0.11f, 0.22f, -0.3f, 0.39f, -0.52f, 0.48f)
                curveToRelative(-0.11f, 0.04f, -2.74f, 1.07f, -7.87f, 1.07f)
                curveToRelative(-5.1f, 0f, -8.19f, -1.01f, -8.32f, -1.05f)
                curveToRelative(-0.56f, -0.17f, -0.85f, -0.86f, -0.59f, -1.38f)
                curveToRelative(1.47f, -3.09f, 3.85f, -5.9f, 7.25f, -8.57f)
                curveToRelative(-3.4f, -2.67f, -5.77f, -5.48f, -7.25f, -8.57f)
                curveToRelative(-0.26f, -0.52f, 0.03f, -1.21f, 0.59f, -1.38f)
                curveToRelative(0.13f, -0.04f, 3.21f, -1.05f, 8.32f, -1.05f)
                curveToRelative(5.13f, 0f, 7.76f, 1.03f, 7.87f, 1.07f)
                curveToRelative(0.23f, 0.09f, 0.41f, 0.26f, 0.52f, 0.48f)
                curveToRelative(0.06f, 0.12f, 0.6f, 1.27f, 0.6f, 3.45f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.06f, -0.16f, -1.8f, -0.27f, -2.2f)
                curveToRelative(-0.86f, -0.26f, -3.12f, -0.8f, -6.73f, -0.8f)
                curveToRelative(-3.0f, 0f, -5.26f, 0.37f, -6.53f, 0.65f)
                curveToRelative(1.52f, 2.68f, 3.86f, 5.15f, 7.12f, 7.54f)
                curveToRelative(0.54f, 0.37f, 0.54f, 1.24f, 0f, 1.61f)
                curveToRelative(-3.26f, 2.39f, -5.6f, 4.86f, -7.12f, 7.54f)
                curveToRelative(1.27f, 0.28f, 3.53f, 0.65f, 6.53f, 0.65f)
                curveToRelative(3.6f, 0f, 5.86f, -0.54f, 6.73f, -0.8f)
                curveToRelative(0.12f, -0.4f, 0.27f, -1.14f, 0.27f, -2.2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Total = it}
