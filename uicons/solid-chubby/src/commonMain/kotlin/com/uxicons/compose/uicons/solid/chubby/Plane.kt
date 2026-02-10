package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plane: ImageVector? = null

val Icons.Sc.Plane: ImageVector
    get() = _Plane ?: UXIcon(name = "Plane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 9.62f)
                curveToRelative(-1.7f, -0.2f, -4.33f, -0.43f, -7.2f, -0.43f)
                curveToRelative(-1.8f, 0f, -3.7f, 0.09f, -5.66f, 0.27f)
                lineToRelative(-0.13f, -0.19f)
                curveToRelative(-0.71f, -1.05f, -1.84f, -1.75f, -3.1f, -1.93f)
                lineToRelative(-1.97f, -0.27f)
                curveToRelative(-0.34f, -0.04f, -1.3f, 0.13f, -1.09f, 1.28f)
                lineToRelative(1.99f, 6.64f)
                curveToRelative(0.11f, 0.37f, 0.42f, 0.64f, 0.81f, 0.7f)
                curveToRelative(0.11f, 0.02f, 2.41f, 0.37f, 5.59f, 0.55f)
                curveToRelative(-1.74f, 3.18f, -1.6f, 4.02f, -1.28f, 4.58f)
                curveToRelative(0.24f, 0.42f, 0.66f, 0.65f, 1.16f, 0.65f)
                curveToRelative(3.68f, 0f, 6.74f, -3.17f, 8.39f, -5.31f)
                curveToRelative(0.94f, -0.07f, 1.78f, -0.15f, 2.46f, -0.23f)
                curveToRelative(1.61f, -0.17f, 2.83f, -1.53f, 2.83f, -3.16f)
                curveToRelative(0f, -1.61f, -1.21f, -2.97f, -2.8f, -3.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.0f, 7.19f)
                curveToRelative(1.54f, 0f, 3.02f, 0.07f, 4.33f, 0.16f)
                curveToRelative(-1.7f, -2.08f, -4.59f, -4.83f, -8.01f, -4.83f)
                curveToRelative(-0.5f, 0f, -0.92f, 0.24f, -1.16f, 0.65f)
                curveToRelative(-0.31f, 0.54f, -0.45f, 1.32f, 1.04f, 4.14f)
                curveToRelative(1.3f, -0.08f, 2.57f, -0.12f, 3.8f, -0.12f)
                close()
            }
        }.also { _Plane = it}
