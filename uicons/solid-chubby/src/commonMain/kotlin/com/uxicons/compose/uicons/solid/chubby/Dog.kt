package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dog: ImageVector? = null

val Icons.Sc.Dog: ImageVector
    get() = _Dog ?: UXIcon(name = "Dog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7f)
                curveToRelative(0f, 1.69f, -0.54f, 2.82f, -0.6f, 2.95f)
                curveToRelative(-0.1f, 0.21f, -0.28f, 0.37f, -0.49f, 0.47f)
                curveToRelative(-0.06f, 0.02f, -1.19f, 0.52f, -2.96f, 0.59f)
                curveToRelative(-0.16f, 1.59f, -0.64f, 3.04f, -0.94f, 3.81f)
                curveToRelative(-0.02f, 3.1f, -0.39f, 7.0f, -0.4f, 7.09f)
                curveToRelative(-0.03f, 0.19f, -0.13f, 0.36f, -0.28f, 0.48f)
                curveToRelative(-0.07f, 0.06f, -0.77f, 0.61f, -1.93f, 0.61f)
                curveToRelative(-1.21f, 0f, -1.83f, -0.59f, -1.9f, -0.66f)
                curveToRelative(-0.13f, -0.13f, -0.21f, -0.3f, -0.23f, -0.48f)
                curveToRelative(0f, -0.01f, -0.25f, -2.27f, -0.46f, -4.33f)
                curveToRelative(-0.64f, 0.24f, -1.54f, 0.47f, -2.81f, 0.47f)
                reflectiveCurveToRelative(-2.16f, -0.23f, -2.79f, -0.47f)
                curveToRelative(-0.21f, 2.07f, -0.46f, 4.32f, -0.46f, 4.33f)
                curveToRelative(-0.02f, 0.18f, -0.1f, 0.35f, -0.23f, 0.48f)
                curveToRelative(-0.07f, 0.07f, -0.69f, 0.66f, -1.9f, 0.66f)
                curveToRelative(-1.16f, 0f, -1.86f, -0.55f, -1.93f, -0.61f)
                curveToRelative(-0.15f, -0.12f, -0.25f, -0.29f, -0.28f, -0.48f)
                curveToRelative(-0.02f, -0.1f, -0.41f, -4.27f, -0.41f, -7.41f)
                curveToRelative(0f, -1.15f, 0.14f, -2.13f, 0.41f, -2.96f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f)
                curveToRelative(-1.41f, -1.27f, -1.58f, -3.2f, -1.41f, -4.25f)
                curveToRelative(0.14f, -0.82f, 0.91f, -1.37f, 1.73f, -1.24f)
                curveToRelative(0.81f, 0.14f, 1.36f, 0.9f, 1.24f, 1.71f)
                curveToRelative(-0.03f, 0.24f, -0.07f, 0.88f, 0.3f, 1.36f)
                curveToRelative(1.1f, -0.76f, 2.54f, -1.13f, 4.21f, -1.09f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.41f, -1.37f, 0.93f, -2.31f, 1.96f, -3.52f)
                curveToRelative(0.48f, -2.01f, 1.81f, -3.08f, 2.71f, -3.43f)
                curveToRelative(0.53f, -0.21f, 1.09f, 0.21f, 1.09f, 0.78f)
                verticalLineToRelative(1.67f)
                curveToRelative(0.97f, 0.48f, 1.65f, 1.12f, 2.01f, 1.53f)
                curveToRelative(0.66f, 0.09f, 1.8f, 0.36f, 2.7f, 1.25f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                close()
            }
        }.also { _Dog = it}
