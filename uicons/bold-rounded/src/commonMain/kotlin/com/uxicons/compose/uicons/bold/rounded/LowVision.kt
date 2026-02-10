package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LowVision: ImageVector? = null

val Icons.Br.LowVision: ImageVector
    get() = _LowVision ?: UXIcon(name = "LowVision") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(0.0f, 11.97f)
            lineToRelative(8.57f, 8.57f)
            curveToRelative(-3.68f, -0.97f, -6.12f, -3.38f, -7.6f, -5.49f)
            curveTo(0.32f, 14.14f, 0f, 13.06f, 0.0f, 11.97f)
            close()
            moveTo(0.97f, 8.92f)
            curveToRelative(-0.17f, 0.24f, -0.32f, 0.5f, -0.44f, 0.76f)
            lineToRelative(11.31f, 11.31f)
            curveToRelative(0.06f, 0f, 0.11f, 0.01f, 0.16f, 0.01f)
            curveToRelative(1.24f, 0f, 2.44f, -0.16f, 3.58f, -0.47f)
            lineTo(2.33f, 7.26f)
            curveToRelative(-0.48f, 0.51f, -0.94f, 1.05f, -1.36f, 1.65f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.02f, -0.15f, 1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(3.8f, 3.8f)
            curveToRelative(1.73f, -0.82f, 3.62f, -1.24f, 5.63f, -1.24f)
            curveToRelative(5.67f, 0f, 9.13f, 3.22f, 11.03f, 5.93f)
            curveToRelative(1.29f, 1.84f, 1.29f, 4.3f, 0f, 6.14f)
            curveToRelative(-0.83f, 1.18f, -1.77f, 2.19f, -2.8f, 3.04f)
            lineToRelative(3.33f, 3.33f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(8.66f, 6.54f)
            lineToRelative(1.78f, 1.78f)
            curveToRelative(1.46f, -0.62f, 3.2f, -0.33f, 4.39f, 0.85f)
            reflectiveCurveToRelative(1.47f, 2.93f, 0.85f, 4.39f)
            lineToRelative(2.41f, 2.41f)
            curveToRelative(0.92f, -0.7f, 1.75f, -1.58f, 2.48f, -2.63f)
            curveToRelative(0.56f, -0.81f, 0.56f, -1.89f, 0f, -2.69f)
            curveToRelative(-1.49f, -2.12f, -4.19f, -4.65f, -8.58f, -4.65f)
            curveToRelative(-1.18f, 0f, -2.29f, 0.18f, -3.34f, 0.54f)
            close()
        }
    }.also { _LowVision = it }
