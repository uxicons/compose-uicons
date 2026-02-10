package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Sc.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-3.65f, 0f, -8.5f, 0.88f, -8.5f, 8.5f)
                reflectiveCurveToRelative(4.85f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -0.88f, 8.5f, -8.5f)
                reflectiveCurveToRelative(-4.85f, -8.5f, -8.5f, -8.5f)
                close()
                moveTo(14.81f, 14.4f)
                lineTo(14.4f, 14.82f)
                curveToRelative(-0.34f, 0.35f, -0.5f, 0.85f, -0.42f, 1.34f)
                lineToRelative(0.1f, 0.59f)
                curveToRelative(0.03f, 0.19f, -0.01f, 0.37f, -0.13f, 0.52f)
                curveToRelative(-0.12f, 0.15f, -0.29f, 0.23f, -0.47f, 0.23f)
                curveToRelative(-0.1f, 0f, -0.19f, -0.03f, -0.28f, -0.08f)
                lineToRelative(-0.51f, -0.28f)
                curveToRelative(-0.21f, -0.11f, -0.44f, -0.17f, -0.68f, -0.17f)
                reflectiveCurveToRelative(-0.47f, 0.06f, -0.68f, 0.17f)
                lineToRelative(-0.51f, 0.28f)
                curveToRelative(-0.09f, 0.05f, -0.19f, 0.08f, -0.28f, 0.08f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.09f, -0.47f, -0.23f)
                curveToRelative(-0.12f, -0.14f, -0.16f, -0.33f, -0.13f, -0.52f)
                lineToRelative(0.1f, -0.59f)
                curveToRelative(0.08f, -0.49f, -0.08f, -0.99f, -0.42f, -1.34f)
                lineToRelative(-0.41f, -0.42f)
                curveToRelative(-0.17f, -0.17f, -0.23f, -0.42f, -0.15f, -0.65f)
                reflectiveCurveToRelative(0.26f, -0.4f, 0.49f, -0.43f)
                lineToRelative(0.57f, -0.09f)
                curveToRelative(0.47f, -0.07f, 0.89f, -0.38f, 1.1f, -0.83f)
                lineToRelative(0.26f, -0.54f)
                curveToRelative(0.11f, -0.22f, 0.31f, -0.36f, 0.55f, -0.36f)
                reflectiveCurveToRelative(0.45f, 0.13f, 0.55f, 0.36f)
                lineToRelative(0.26f, 0.54f)
                curveToRelative(0.21f, 0.45f, 0.62f, 0.76f, 1.1f, 0.83f)
                lineToRelative(0.57f, 0.09f)
                curveToRelative(0.24f, 0.04f, 0.42f, 0.2f, 0.5f, 0.43f)
                curveToRelative(0.07f, 0.24f, 0.01f, 0.48f, -0.15f, 0.65f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.91f, 4.03f)
                curveToRelative(-1.31f, -1.64f, -2.39f, -2.69f, -2.44f, -2.74f)
                curveToRelative(-0.17f, -0.16f, -0.38f, -0.26f, -0.61f, -0.28f)
                curveToRelative(-0.08f, -0.01f, -2.12f, -0.17f, -3.9f, 1.27f)
                curveToRelative(-2.1f, 1.71f, -1.97f, 3.35f, -1.95f, 3.53f)
                curveToRelative(0.01f, 0.12f, 0.05f, 0.23f, 0.1f, 0.33f)
                curveToRelative(0.02f, 0.05f, 0.4f, 0.78f, 1.03f, 1.81f)
                curveToRelative(1.36f, -2.1f, 3.74f, -3.69f, 7.76f, -3.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.04f, 2.28f)
                curveToRelative(-1.77f, -1.44f, -3.81f, -1.28f, -3.9f, -1.27f)
                curveToRelative(-0.23f, 0.02f, -0.44f, 0.12f, -0.61f, 0.28f)
                curveToRelative(-0.05f, 0.05f, -1.14f, 1.1f, -2.44f, 2.74f)
                curveToRelative(4.02f, 0.24f, 6.4f, 1.82f, 7.76f, 3.93f)
                curveToRelative(0.63f, -1.04f, 1.0f, -1.77f, 1.03f, -1.81f)
                curveToRelative(0.05f, -0.1f, 0.09f, -0.22f, 0.1f, -0.33f)
                curveToRelative(0.02f, -0.18f, 0.15f, -1.81f, -1.95f, -3.53f)
                close()
            }
        }.also { _Medal = it}
