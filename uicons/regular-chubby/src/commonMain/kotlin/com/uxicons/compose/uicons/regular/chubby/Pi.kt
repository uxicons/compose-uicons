package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Rc.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 19f)
                curveToRelative(0.01f, 2.7f, -1.35f, 4.0f, -4f, 4.0f)
                curveToRelative(-1.32f, 0f, -2.39f, -0.43f, -3.11f, -1.25f)
                curveToRelative(-0.55f, -0.63f, -1.15f, -1.81f, -0.88f, -3.85f)
                curveToRelative(0.07f, -0.56f, 0.17f, -1.15f, 0.27f, -1.78f)
                curveToRelative(0.2f, -1.27f, 0.43f, -2.7f, 0.54f, -4.17f)
                curveToRelative(0.12f, -1.57f, 0.18f, -3.24f, 0.18f, -4.96f)
                curveToRelative(0.01f, -1.54f, -0.03f, -2.81f, -0.07f, -3.73f)
                curveToRelative(-3.61f, -0.26f, -6.88f, -0.27f, -6.93f, -0.27f)
                curveToRelative(-0.03f, 0f, -0.05f, 0.0f, -0.08f, 0.0f)
                curveToRelative(0.04f, 0.9f, 0.09f, 2.29f, 0.08f, 4.0f)
                curveToRelative(-0.01f, 1.76f, -0.07f, 3.48f, -0.19f, 5.09f)
                curveToRelative(-0.39f, 5.37f, -1.29f, 9.91f, -1.33f, 10.1f)
                curveToRelative(-0.11f, 0.55f, -0.65f, 0.89f, -1.18f, 0.78f)
                curveToRelative(-0.54f, -0.11f, -0.89f, -0.64f, -0.78f, -1.18f)
                curveToRelative(0.01f, -0.04f, 0.92f, -4.61f, 1.3f, -9.85f)
                curveToRelative(0.12f, -1.57f, 0.18f, -3.24f, 0.18f, -4.96f)
                curveToRelative(0.01f, -1.63f, -0.04f, -2.96f, -0.08f, -3.84f)
                curveToRelative(-2.85f, 0.49f, -3.92f, 2.19f, -3.92f, 5.84f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(-0.0f, -5.01f, 2.04f, -7.5f, 6.54f, -7.92f)
                curveToRelative(2.23f, -0.14f, 8.05f, -0.17f, 14.66f, 0.95f)
                curveToRelative(0.54f, 0.11f, 0.89f, 0.64f, 0.78f, 1.18f)
                curveToRelative(-0.11f, 0.54f, -0.63f, 0.89f, -1.18f, 0.78f)
                curveToRelative(-1.16f, -0.23f, -2.5f, -0.41f, -3.87f, -0.55f)
                curveToRelative(0.04f, 0.92f, 0.07f, 2.14f, 0.06f, 3.57f)
                curveToRelative(-0.01f, 1.76f, -0.07f, 3.48f, -0.19f, 5.09f)
                curveToRelative(-0.11f, 1.55f, -0.35f, 3.03f, -0.56f, 4.34f)
                curveToRelative(-0.1f, 0.61f, -0.19f, 1.19f, -0.26f, 1.73f)
                curveToRelative(-0.14f, 1.03f, 0.0f, 1.81f, 0.4f, 2.27f)
                curveToRelative(0.32f, 0.36f, 0.83f, 0.56f, 1.53f, 0.57f)
                curveToRelative(1.6f, 0.01f, 2.09f, -0.38f, 2.08f, -2.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Pi = it}
