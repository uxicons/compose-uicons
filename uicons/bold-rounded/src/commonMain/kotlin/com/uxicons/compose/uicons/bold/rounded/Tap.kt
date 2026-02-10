package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Br.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 19.23f)
            verticalLineToRelative(3.27f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.27f)
            curveToRelative(0f, -0.92f, -0.62f, -1.72f, -1.51f, -1.94f)
            lineToRelative(-7.49f, -1.87f)
            verticalLineToRelative(7.08f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.27f)
            curveToRelative(-0.97f, 0f, -1.9f, -0.41f, -2.56f, -1.11f)
            curveToRelative(0f, 0f, -2.23f, -2.39f, -2.26f, -2.43f)
            curveToRelative(-0.52f, -0.71f, -0.64f, -1.85f, 0.17f, -2.65f)
            curveToRelative(0.78f, -0.78f, 1.89f, -0.7f, 2.59f, -0.22f)
            curveToRelative(0.08f, 0.05f, 2.56f, 2.54f, 2.56f, 2.54f)
            curveToRelative(0.02f, 0.02f, 0.07f, 0.07f, 0.17f, 0.03f)
            curveToRelative(0.1f, -0.04f, 0.1f, -0.11f, 0.1f, -0.14f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.83f)
            lineToRelative(8.21f, 2.05f)
            curveToRelative(2.23f, 0.56f, 3.79f, 2.55f, 3.79f, 4.85f)
            close()
            moveTo(3.93f, 10f)
            curveToRelative(0.2f, 0f, 0.4f, -0.04f, 0.6f, -0.13f)
            curveToRelative(0.76f, -0.33f, 1.1f, -1.22f, 0.77f, -1.98f)
            curveToRelative(-0.58f, -1.33f, -0.3f, -2.85f, 0.72f, -3.87f)
            curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
            curveToRelative(1.02f, 1.02f, 1.3f, 2.54f, 0.72f, 3.88f)
            curveToRelative(-0.33f, 0.76f, 0.01f, 1.64f, 0.77f, 1.98f)
            curveToRelative(0.76f, 0.33f, 1.64f, -0.01f, 1.98f, -0.77f)
            curveToRelative(1.08f, -2.47f, 0.55f, -5.3f, -1.35f, -7.2f)
            curveTo(10.56f, -0.63f, 6.44f, -0.63f, 3.9f, 1.9f)
            curveToRelative(-1.9f, 1.9f, -2.43f, 4.73f, -1.35f, 7.2f)
            curveToRelative(0.25f, 0.56f, 0.8f, 0.9f, 1.38f, 0.9f)
            close()
        }
    }.also { _Tap = it }
