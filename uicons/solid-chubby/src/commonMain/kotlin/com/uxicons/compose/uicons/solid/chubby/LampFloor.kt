package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Sc.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 10.63f)
                curveToRelative(0.09f, 0.5f, -0.21f, 0.99f, -0.69f, 1.14f)
                curveToRelative(-1.08f, 0.33f, -3.86f, 1.05f, -7.75f, 1.2f)
                verticalLineToRelative(6.73f)
                curveToRelative(1.23f, 0.1f, 2.08f, 0.28f, 2.36f, 0.35f)
                curveToRelative(0.8f, 0.2f, 1.29f, 1.01f, 1.1f, 1.82f)
                curveToRelative(-0.17f, 0.68f, -0.78f, 1.14f, -1.46f, 1.14f)
                curveToRelative(-0.77f, -0.07f, -1.33f, -0.36f, -3.5f, -0.36f)
                curveToRelative(-1.76f, 0f, -2.92f, 0.27f, -3.14f, 0.32f)
                curveToRelative(-0.81f, 0.2f, -1.62f, -0.29f, -1.82f, -1.1f)
                curveToRelative(-0.2f, -0.81f, 0.29f, -1.62f, 1.1f, -1.82f)
                curveToRelative(0.28f, -0.07f, 1.13f, -0.26f, 2.36f, -0.35f)
                verticalLineToRelative(-6.73f)
                curveToRelative(-3.9f, -0.16f, -6.67f, -0.87f, -7.75f, -1.2f)
                curveToRelative(-0.49f, -0.15f, -0.78f, -0.64f, -0.69f, -1.14f)
                curveToRelative(0.34f, -2.76f, 2.71f, -8.4f, 2.74f, -8.28f)
                curveToRelative(0.12f, -0.26f, 0.35f, -0.45f, 0.63f, -0.53f)
                curveToRelative(0.12f, -0.03f, 2.97f, -0.82f, 6.57f, -0.82f)
                reflectiveCurveToRelative(6.45f, 0.79f, 6.57f, 0.82f)
                curveToRelative(0.28f, 0.08f, 0.51f, 0.27f, 0.63f, 0.53f)
                curveToRelative(0.04f, -0.08f, 2.4f, 5.49f, 2.74f, 8.28f)
                close()
            }
        }.also { _LampFloor = it}
