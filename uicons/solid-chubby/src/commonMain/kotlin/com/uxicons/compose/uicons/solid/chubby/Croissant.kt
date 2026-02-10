package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Croissant: ImageVector? = null

val Icons.Sc.Croissant: ImageVector
    get() = _Croissant ?: UXIcon(name = "Croissant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.14f, 20.27f)
                curveToRelative(0.7f, 1.51f, 2.08f, 2.73f, 3.75f, 2.73f)
                curveToRelative(0.87f, 0f, 1.59f, -0.35f, 2.16f, -0.92f)
                curveToRelative(0.27f, -0.27f, 0.5f, -0.58f, 0.7f, -0.94f)
                curveToRelative(-1.88f, 0.74f, -4.23f, 0.66f, -6.6f, -0.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.56f, 18.11f)
                curveToRelative(2.79f, 2.22f, 5.48f, 1.7f, 7.01f, 0.16f)
                curveToRelative(0.07f, -0.07f, 0.14f, -0.15f, 0.21f, -0.23f)
                curveToRelative(0.12f, -0.14f, 0.25f, -0.31f, 0.37f, -0.51f)
                lineTo(1.83f, 11.47f)
                curveToRelative(-1.22f, 2.49f, -0.95f, 5.3f, 0.73f, 6.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.23f, 2.08f)
                curveToRelative(1.52f, 2.38f, 1.6f, 4.74f, 0.87f, 6.62f)
                curveToRelative(0.34f, -0.19f, 0.64f, -0.42f, 0.9f, -0.68f)
                curveToRelative(0.57f, -0.57f, 0.93f, -1.3f, 0.93f, -2.19f)
                curveToRelative(0f, -1.67f, -1.2f, -3.05f, -2.7f, -3.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.66f, 1.67f)
                lineToRelative(5.8f, 8.49f)
                curveToRelative(0.21f, -0.14f, 0.4f, -0.27f, 0.55f, -0.4f)
                curveToRelative(0.07f, -0.06f, 0.14f, -0.12f, 0.2f, -0.19f)
                curveToRelative(1.54f, -1.54f, 2.07f, -4.25f, -0.14f, -7.07f)
                curveToRelative(-1.29f, -1.65f, -3.98f, -1.95f, -6.41f, -0.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.39f, 4.28f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-1.69f, 1.7f, -2.4f, 3.35f, -2.68f, 4.58f)
                lineToRelative(9.99f, 7.28f)
                curveToRelative(0.81f, -0.32f, 1.73f, -0.87f, 2.65f, -1.78f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(0.89f, -0.9f, 1.44f, -1.81f, 1.76f, -2.61f)
                lineTo(9.16f, 1.56f)
                curveToRelative(-1.23f, 0.24f, -2.97f, 0.92f, -4.77f, 2.72f)
                close()
            }
        }.also { _Croissant = it}
