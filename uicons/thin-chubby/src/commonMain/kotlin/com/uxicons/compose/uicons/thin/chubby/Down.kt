package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Tc.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.66f, 12.57f)
                curveToRelative(-0.07f, -0.03f, -1.64f, -0.53f, -4.71f, -0.84f)
                curveToRelative(0.04f, -0.79f, 0.06f, -1.46f, 0.06f, -2.08f)
                curveToRelative(0f, -3.62f, -0.56f, -7.62f, -0.57f, -7.66f)
                curveToRelative(-0.02f, -0.17f, -0.13f, -0.31f, -0.29f, -0.39f)
                curveToRelative(-0.06f, -0.02f, -1.37f, -0.61f, -4.14f, -0.61f)
                reflectiveCurveToRelative(-4.09f, 0.58f, -4.14f, 0.61f)
                curveToRelative(-0.15f, 0.07f, -0.26f, 0.22f, -0.29f, 0.39f)
                curveToRelative(-0.01f, 0.04f, -0.57f, 4.05f, -0.57f, 7.66f)
                curveToRelative(0f, 0.61f, 0.02f, 1.28f, 0.06f, 2.08f)
                curveToRelative(-3.08f, 0.31f, -4.65f, 0.82f, -4.71f, 0.84f)
                curveToRelative(-0.3f, 0.09f, -0.44f, 0.49f, -0.26f, 0.75f)
                curveToRelative(2.59f, 3.96f, 5.84f, 7.21f, 9.65f, 9.65f)
                curveToRelative(0.16f, 0.1f, 0.38f, 0.1f, 0.54f, 0f)
                curveToRelative(3.81f, -2.44f, 7.06f, -5.68f, 9.65f, -9.65f)
                curveToRelative(0.09f, -0.13f, 0.15f, -0.58f, -0.26f, -0.75f)
                close()
                moveTo(12f, 21.95f)
                curveToRelative(-3.39f, -2.22f, -6.31f, -5.11f, -8.7f, -8.6f)
                curveToRelative(0.77f, -0.19f, 2.22f, -0.48f, 4.33f, -0.67f)
                curveToRelative(0.27f, -0.02f, 0.47f, -0.26f, 0.45f, -0.53f)
                curveToRelative(-0.06f, -0.99f, -0.08f, -1.78f, -0.08f, -2.5f)
                curveToRelative(0f, -2.98f, 0.39f, -6.24f, 0.52f, -7.23f)
                curveToRelative(0.47f, -0.15f, 1.61f, -0.43f, 3.48f, -0.43f)
                reflectiveCurveToRelative(3.01f, 0.28f, 3.48f, 0.43f)
                curveToRelative(0.13f, 0.98f, 0.52f, 4.24f, 0.52f, 7.23f)
                curveToRelative(0f, 0.71f, -0.03f, 1.51f, -0.08f, 2.5f)
                curveToRelative(-0.02f, 0.27f, 0.19f, 0.5f, 0.45f, 0.53f)
                curveToRelative(2.1f, 0.19f, 3.56f, 0.48f, 4.33f, 0.67f)
                curveToRelative(-2.39f, 3.49f, -5.31f, 6.38f, -8.7f, 8.6f)
                close()
            }
        }.also { _Down = it}
