package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Br.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 22f)
            horizontalLineToRelative(-4.72f)
            curveToRelative(-2.61f, 0f, -4.88f, -1.86f, -5.39f, -4.42f)
            lineToRelative(-0.72f, -3.58f)
            horizontalLineToRelative(-3.54f)
            curveTo(2.12f, 14f, 0.36f, 12.56f, 0.05f, 10.66f)
            curveToRelative(-0.19f, -1.17f, 0.14f, -2.36f, 0.9f, -3.25f)
            curveToRelative(0.76f, -0.9f, 1.87f, -1.41f, 3.05f, -1.41f)
            horizontalLineToRelative(5.4f)
            lineToRelative(3.97f, -3.8f)
            curveToRelative(0.76f, -0.76f, 1.79f, -1.19f, 2.9f, -1.2f)
            horizontalLineToRelative(0.01f)
            curveToRelative(1.1f, 0f, 2.15f, 0.43f, 2.93f, 1.21f)
            lineToRelative(2.31f, 2.31f)
            curveToRelative(1.6f, 1.6f, 2.49f, 3.74f, 2.49f, 6.01f)
            verticalLineToRelative(5.97f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(4f, 9f)
            curveToRelative(-0.29f, 0f, -0.57f, 0.13f, -0.76f, 0.35f)
            curveToRelative(-0.11f, 0.13f, -0.29f, 0.41f, -0.22f, 0.83f)
            curveToRelative(0.07f, 0.46f, 0.57f, 0.82f, 1.12f, 0.82f)
            horizontalLineToRelative(4.77f)
            curveToRelative(0.71f, 0f, 1.33f, 0.51f, 1.47f, 1.21f)
            lineToRelative(0.96f, 4.78f)
            curveToRelative(0.23f, 1.17f, 1.26f, 2.01f, 2.45f, 2.01f)
            horizontalLineToRelative(4.72f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5.97f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            lineToRelative(-2.31f, -2.31f)
            curveToRelative(-0.21f, -0.21f, -0.5f, -0.33f, -0.81f, -0.33f)
            horizontalLineToRelative(-0.0f)
            curveToRelative(-0.3f, 0f, -0.59f, 0.12f, -0.81f, 0.34f)
            lineToRelative(-1.74f, 1.66f)
            horizontalLineToRelative(1.27f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4f)
            close()
        }
    }.also { _HandBackPointLeft = it }
