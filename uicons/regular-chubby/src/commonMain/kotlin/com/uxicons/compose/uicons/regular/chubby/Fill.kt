package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Rc.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.36f, 14.25f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineTo(10.64f, 2.1f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, -0.0f)
                curveToRelative(-0.33f, 0.33f, -0.38f, 0.83f, -0.16f, 1.21f)
                curveToRelative(-0.41f, 0.34f, -0.91f, 0.76f, -1.46f, 1.25f)
                lineToRelative(-1.08f, -1.08f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.05f, 1.05f)
                curveTo(3.0f, 9.11f, 1.22f, 11.99f, 1.15f, 12.11f)
                curveToRelative(-0.18f, 0.29f, -0.2f, 0.64f, -0.05f, 0.95f)
                curveToRelative(0.06f, 0.12f, 1.37f, 2.87f, 3.76f, 5.27f)
                curveToRelative(2.39f, 2.4f, 5.14f, 3.72f, 5.26f, 3.77f)
                curveToRelative(0.14f, 0.07f, 0.28f, 0.1f, 0.43f, 0.1f)
                curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.53f, -0.15f)
                curveToRelative(0.12f, -0.08f, 3.03f, -1.88f, 6.17f, -5.03f)
                curveToRelative(1.12f, -1.13f, 2.01f, -2.15f, 2.61f, -2.9f)
                curveToRelative(0.15f, 0.09f, 0.33f, 0.13f, 0.5f, 0.13f)
                close()
                moveTo(15.83f, 15.6f)
                curveToRelative(-2.25f, 2.26f, -4.42f, 3.81f, -5.34f, 4.44f)
                curveToRelative(-0.84f, -0.46f, -2.64f, -1.54f, -4.21f, -3.12f)
                curveToRelative(-1.58f, -1.58f, -2.66f, -3.38f, -3.12f, -4.23f)
                curveToRelative(0.62f, -0.92f, 2.15f, -3.07f, 4.42f, -5.34f)
                lineToRelative(4.12f, 4.13f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-4.09f, -4.09f)
                curveToRelative(0.55f, -0.5f, 1.04f, -0.91f, 1.44f, -1.23f)
                lineToRelative(7.95f, 7.97f)
                curveToRelative(-0.57f, 0.71f, -1.45f, 1.74f, -2.59f, 2.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.35f, 16.33f)
                curveToRelative(-0.34f, -0.23f, -0.78f, -0.23f, -1.12f, 0f)
                curveToRelative(-0.17f, 0.11f, -1.65f, 1.15f, -1.65f, 2.7f)
                curveToRelative(0f, 1.22f, 0.99f, 2.21f, 2.21f, 2.21f)
                reflectiveCurveToRelative(2.21f, -0.99f, 2.21f, -2.21f)
                curveToRelative(0f, -1.55f, -1.48f, -2.59f, -1.65f, -2.7f)
                close()
            }
        }.also { _Fill = it}
