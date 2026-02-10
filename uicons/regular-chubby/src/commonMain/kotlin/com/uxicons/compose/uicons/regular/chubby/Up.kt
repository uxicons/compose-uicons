package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Rc.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-2.54f, 0f, -3.78f, -0.53f, -3.91f, -0.59f)
                curveToRelative(-0.31f, -0.14f, -0.53f, -0.43f, -0.58f, -0.77f)
                curveToRelative(-0.02f, -0.15f, -0.51f, -3.63f, -0.51f, -6.89f)
                curveToRelative(0f, -0.62f, 0.02f, -1.29f, 0.05f, -2.0f)
                curveToRelative(-2.84f, -0.3f, -4.3f, -0.78f, -4.37f, -0.8f)
                curveToRelative(-0.61f, -0.18f, -0.88f, -0.97f, -0.52f, -1.5f)
                curveToRelative(2.5f, -3.82f, 5.62f, -6.95f, 9.3f, -9.29f)
                curveToRelative(0.33f, -0.21f, 0.75f, -0.21f, 1.08f, 0f)
                curveToRelative(3.67f, 2.35f, 6.8f, 5.48f, 9.3f, 9.29f)
                curveToRelative(0.36f, 0.52f, 0.09f, 1.31f, -0.52f, 1.5f)
                curveToRelative(-0.07f, 0.02f, -1.53f, 0.5f, -4.37f, 0.8f)
                curveToRelative(0.04f, 0.71f, 0.05f, 1.38f, 0.05f, 2.0f)
                curveToRelative(0f, 3.25f, -0.49f, 6.74f, -0.51f, 6.89f)
                curveToRelative(-0.05f, 0.34f, -0.27f, 0.63f, -0.58f, 0.77f)
                curveToRelative(-0.13f, 0.06f, -1.37f, 0.59f, -3.91f, 0.59f)
                close()
                moveTo(9.41f, 20.74f)
                curveToRelative(0.49f, 0.12f, 1.34f, 0.26f, 2.59f, 0.26f)
                reflectiveCurveToRelative(2.1f, -0.14f, 2.59f, -0.26f)
                curveToRelative(0.14f, -1.14f, 0.41f, -3.66f, 0.41f, -5.99f)
                curveToRelative(0f, -0.85f, -0.04f, -1.8f, -0.11f, -2.83f)
                curveToRelative(-0.04f, -0.55f, 0.37f, -1.02f, 0.92f, -1.07f)
                curveToRelative(1.55f, -0.13f, 2.73f, -0.32f, 3.55f, -0.48f)
                curveToRelative(-2.06f, -2.87f, -4.53f, -5.28f, -7.36f, -7.18f)
                curveToRelative(-2.82f, 1.9f, -5.29f, 4.31f, -7.36f, 7.18f)
                curveToRelative(0.81f, 0.16f, 2f, 0.35f, 3.55f, 0.48f)
                curveToRelative(0.55f, 0.04f, 0.95f, 0.52f, 0.92f, 1.07f)
                curveToRelative(-0.07f, 1.03f, -0.11f, 1.98f, -0.11f, 2.83f)
                curveToRelative(0f, 2.33f, 0.27f, 4.85f, 0.41f, 5.99f)
                close()
            }
        }.also { _Up = it}
