package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Box: ImageVector? = null

val Icons.Sc.Box: ImageVector
    get() = _Box ?: UXIcon(name = "Box") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.99f, 8.55f)
                lineToRelative(-0.63f, -4.82f)
                curveToRelative(-0.05f, -0.38f, -0.35f, -0.69f, -0.76f, -0.78f)
                curveToRelative(-0.18f, -0.04f, -4.55f, -0.98f, -9.6f, -0.98f)
                reflectiveCurveTo(2.59f, 2.91f, 2.4f, 2.95f)
                curveToRelative(-0.41f, 0.09f, -0.71f, 0.4f, -0.76f, 0.78f)
                lineToRelative(-0.64f, 4.77f)
                curveToRelative(-0.05f, 0.89f, 0.8f, 1.09f, 1.2f, 1.01f)
                curveToRelative(1.43f, -0.31f, 5.27f, -0.93f, 9.79f, -0.93f)
                curveToRelative(2.18f, 0f, 5.65f, 0.17f, 9.79f, 0.98f)
                curveToRelative(0.81f, 0.16f, 1.27f, -0.51f, 1.2f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 10.74f)
                curveToRelative(-4.56f, 0f, -8.47f, 0.6f, -10.11f, 0.94f)
                curveToRelative(-0.0f, 0.11f, -0.0f, 0.21f, -0.0f, 0.32f)
                curveToRelative(0f, 4.69f, 1.05f, 8.14f, 1.09f, 8.28f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.16f, 0.04f, 3.9f, 1.07f, 8.34f, 1.07f)
                reflectiveCurveToRelative(8.18f, -1.03f, 8.34f, -1.07f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.34f, 0.69f, -0.67f)
                curveToRelative(0.04f, -0.15f, 1.09f, -3.63f, 1.09f, -8.28f)
                curveToRelative(0f, -0.09f, -0.0f, -0.18f, -0.0f, -0.27f)
                curveToRelative(-4.27f, -0.82f, -7.85f, -0.99f, -10.12f, -0.99f)
                close()
                moveTo(13.91f, 15.57f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.83f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Box = it}
