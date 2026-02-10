package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Sc.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.27f, 5.85f)
                curveToRelative(-0.18f, -0.11f, -1.11f, -0.69f, -2.27f, -1.85f)
                curveToRelative(-1.16f, -1.16f, -1.75f, -2.1f, -1.85f, -2.27f)
                curveToRelative(-0.43f, -0.71f, -1.35f, -0.94f, -2.06f, -0.51f)
                curveToRelative(-0.71f, 0.43f, -0.94f, 1.35f, -0.51f, 2.06f)
                curveToRelative(0.14f, 0.23f, 0.56f, 0.89f, 1.28f, 1.74f)
                lineToRelative(-6.17f, 6.17f)
                curveToRelative(-1.42f, -1.2f, -2.47f, -1.72f, -3.2f, -2.08f)
                curveToRelative(-0.29f, -0.14f, -0.71f, -0.09f, -1f, 0.07f)
                curveToRelative(-0.73f, 0.41f, -1.72f, 0.96f, -2.86f, 2.07f)
                curveToRelative(-1.77f, 1.8f, -2.29f, 3.18f, -2.57f, 3.91f)
                curveToRelative(-0.04f, 0.12f, -0.07f, 0.24f, -0.07f, 0.36f)
                curveToRelative(0f, 0.82f, 0.06f, 4.98f, 1.29f, 6.21f)
                curveToRelative(1.28f, 1.28f, 6.16f, 1.29f, 6.21f, 1.29f)
                curveToRelative(0.12f, 0f, 0.31f, -0.05f, 0.42f, -0.09f)
                curveToRelative(0.66f, -0.25f, 2.04f, -0.78f, 3.86f, -2.56f)
                curveToRelative(1.08f, -1.12f, 1.64f, -2.11f, 2.09f, -2.91f)
                curveToRelative(0.16f, -0.29f, 0.17f, -0.63f, 0.03f, -0.93f)
                curveToRelative(-0.36f, -0.73f, -0.88f, -1.78f, -2.08f, -3.2f)
                lineToRelative(6.17f, -6.17f)
                curveToRelative(0.85f, 0.72f, 1.51f, 1.15f, 1.74f, 1.28f)
                curveToRelative(0.7f, 0.42f, 1.63f, 0.2f, 2.06f, -0.51f)
                curveToRelative(0.43f, -0.71f, 0.2f, -1.63f, -0.51f, -2.06f)
                close()
                moveTo(10.21f, 15.21f)
                lineTo(7.71f, 17.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.5f, -2.5f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _Shovel = it}
