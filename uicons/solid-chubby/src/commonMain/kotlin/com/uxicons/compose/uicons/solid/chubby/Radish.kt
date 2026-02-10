package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radish: ImageVector? = null

val Icons.Sc.Radish: ImageVector
    get() = _Radish ?: UXIcon(name = "Radish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 10.86f)
                curveToRelative(-0.18f, 0.24f, -0.39f, 0.47f, -0.62f, 0.7f)
                curveToRelative(-1.7f, 1.69f, -4.68f, 2.78f, -7.13f, 3.44f)
                curveToRelative(1.33f, 0.69f, 2.73f, 1.22f, 3.96f, 1.22f)
                horizontalLineToRelative(0.01f)
                curveToRelative(2.35f, -0.01f, 3.82f, -1.73f, 3.83f, -4.51f)
                curveToRelative(0f, -0.3f, -0.01f, -0.58f, -0.04f, -0.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 1.71f)
                curveToRelative(0.21f, -0.21f, 0.44f, -0.41f, 0.67f, -0.59f)
                curveToRelative(-0.25f, -0.03f, -0.53f, -0.04f, -0.82f, -0.04f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-2.78f, 0.01f, -4.51f, 1.47f, -4.51f, 3.81f)
                curveToRelative(-0.0f, 1.24f, 0.53f, 2.65f, 1.24f, 3.99f)
                curveToRelative(0.66f, -2.43f, 1.76f, -5.48f, 3.47f, -7.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.93f, 10.14f)
                curveToRelative(0.83f, -0.83f, 2.63f, -3.31f, -0.54f, -6.47f)
                curveToRelative(-2.19f, -2.19f, -4.62f, -2.39f, -6.48f, -0.54f)
                curveToRelative(-1.8f, 1.79f, -2.87f, 5.75f, -3.36f, 7.97f)
                curveToRelative(-3.68f, -2.81f, -6.44f, -1.1f, -7.83f, 0.28f)
                curveToRelative(-3.78f, 3.76f, -0.17f, 9.39f, -0.02f, 9.63f)
                curveToRelative(0.07f, 0.12f, 0.17f, 0.21f, 0.29f, 0.29f)
                curveToRelative(0.16f, 0.1f, 5.95f, 3.62f, 9.63f, -0.02f)
                curveToRelative(3.34f, -3.3f, 1.29f, -6.49f, 0.3f, -7.8f)
                curveToRelative(2.23f, -0.48f, 6.2f, -1.55f, 8.0f, -3.34f)
                close()
            }
        }.also { _Radish = it}
