package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Br.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.01f, 24f)
            curveToRelative(-0.95f, 0f, -1.87f, -0.33f, -2.6f, -0.95f)
            curveToRelative(-0.9f, -0.76f, -1.41f, -1.87f, -1.41f, -3.05f)
            verticalLineToRelative(-5.4f)
            lineToRelative(-3.8f, -3.97f)
            curveToRelative(-0.76f, -0.76f, -1.19f, -1.79f, -1.2f, -2.9f)
            reflectiveCurveToRelative(0.43f, -2.15f, 1.21f, -2.93f)
            lineToRelative(2.31f, -2.31f)
            curveTo(6.12f, 0.88f, 8.26f, 0f, 10.53f, 0f)
            horizontalLineToRelative(5.97f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(4.72f)
            curveToRelative(0f, 2.61f, -1.86f, 4.88f, -4.42f, 5.39f)
            lineToRelative(-3.58f, 0.72f)
            verticalLineToRelative(3.54f)
            curveToRelative(0f, 2.02f, -1.44f, 3.77f, -3.34f, 4.08f)
            curveToRelative(-0.22f, 0.04f, -0.44f, 0.05f, -0.66f, 0.05f)
            close()
            moveTo(9f, 20f)
            curveToRelative(0f, 0.29f, 0.13f, 0.57f, 0.35f, 0.76f)
            curveToRelative(0.13f, 0.11f, 0.42f, 0.29f, 0.83f, 0.22f)
            curveToRelative(0.46f, -0.07f, 0.82f, -0.57f, 0.82f, -1.12f)
            verticalLineToRelative(-4.77f)
            curveToRelative(0f, -0.71f, 0.51f, -1.33f, 1.21f, -1.47f)
            lineToRelative(4.79f, -0.96f)
            curveToRelative(1.17f, -0.23f, 2.01f, -1.26f, 2.01f, -2.45f)
            lineTo(19.0f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-5.97f)
            curveToRelative(-1.47f, 0f, -2.85f, 0.57f, -3.89f, 1.61f)
            lineToRelative(-2.31f, 2.31f)
            curveToRelative(-0.21f, 0.22f, -0.33f, 0.5f, -0.33f, 0.81f)
            curveToRelative(0f, 0.3f, 0.12f, 0.59f, 0.34f, 0.81f)
            lineToRelative(1.66f, 1.74f)
            verticalLineToRelative(-1.27f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(11f)
            close()
        }
    }.also { _HandBackPointDown = it }
