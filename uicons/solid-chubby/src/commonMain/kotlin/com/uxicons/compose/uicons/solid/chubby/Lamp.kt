package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Sc.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.29f, 12.64f)
                curveToRelative(-1.22f, 0.37f, -4.37f, 1.17f, -8.79f, 1.32f)
                verticalLineToRelative(3.11f)
                curveToRelative(3.01f, 0.36f, 3.49f, 1.92f, 3.5f, 2.91f)
                curveToRelative(0f, 1.25f, -0.46f, 2.04f, -0.51f, 2.13f)
                curveToRelative(-0.14f, 0.23f, -0.36f, 0.39f, -0.62f, 0.45f)
                curveToRelative(-0.07f, 0.02f, -1.78f, 0.43f, -3.87f, 0.43f)
                reflectiveCurveToRelative(-3.8f, -0.41f, -3.87f, -0.43f)
                curveToRelative(-0.26f, -0.06f, -0.48f, -0.23f, -0.62f, -0.45f)
                curveToRelative(-0.05f, -0.09f, -0.51f, -0.88f, -0.51f, -2.12f)
                curveToRelative(0.01f, -1.0f, 0.55f, -2.56f, 3.5f, -2.92f)
                verticalLineToRelative(-3.11f)
                curveToRelative(-4.42f, -0.16f, -7.57f, -0.95f, -8.79f, -1.32f)
                curveToRelative(-0.49f, -0.15f, -0.79f, -0.64f, -0.69f, -1.14f)
                curveToRelative(0.1f, -0.52f, 0.2f, -1.04f, 0.33f, -1.56f)
                curveToRelative(0.82f, -3.37f, 2.29f, -6.6f, 2.65f, -7.36f)
                curveToRelative(0.13f, -0.68f, 0.83f, -0.8f, 2.86f, -1.14f)
                curveToRelative(1.2f, -0.2f, 3.06f, -0.44f, 5.15f, -0.44f)
                curveToRelative(4.0f, 0f, 7.16f, 0.86f, 7.3f, 0.9f)
                curveToRelative(0.28f, 0.08f, 0.51f, 0.27f, 0.63f, 0.53f)
                curveToRelative(0.07f, 0.15f, 1.81f, 3.75f, 2.73f, 7.52f)
                curveToRelative(0.12f, 0.52f, 0.23f, 1.04f, 0.33f, 1.55f)
                curveToRelative(0.1f, 0.5f, -0.2f, 0.99f, -0.69f, 1.14f)
                close()
            }
        }.also { _Lamp = it}
