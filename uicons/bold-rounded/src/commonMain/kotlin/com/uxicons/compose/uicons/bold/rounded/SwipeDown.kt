package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeDown: ImageVector? = null

val Icons.Br.SwipeDown: ImageVector
    get() = _SwipeDown ?: UXIcon(name = "SwipeDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.21f, 11.38f)
            lineToRelative(-8.21f, -2.05f)
            lineTo(12f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(13.51f)
            curveToRelative(0f, 0.04f, 0f, 0.1f, -0.1f, 0.15f)
            curveToRelative(-0.1f, 0.04f, -0.14f, -0.01f, -0.17f, -0.03f)
            curveToRelative(0f, 0f, -2.48f, -2.49f, -2.56f, -2.54f)
            curveToRelative(-0.7f, -0.48f, -1.82f, -0.56f, -2.6f, 0.22f)
            curveToRelative(-0.8f, 0.8f, -0.69f, 1.94f, -0.16f, 2.65f)
            curveToRelative(0.03f, 0.05f, 3.43f, 3.68f, 3.43f, 3.68f)
            curveToRelative(0.46f, 0.61f, 2.45f, 2.86f, 6.66f, 2.86f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-2.77f)
            curveToRelative(0f, -2.3f, -1.56f, -4.29f, -3.79f, -4.85f)
            close()
            moveTo(21f, 19f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.81f, 0f, -2.95f, -0.56f, -3.58f, -1.02f)
            curveToRelative(0.04f, -0.02f, 0.09f, -0.03f, 0.14f, -0.05f)
            curveToRelative(1.18f, -0.49f, 1.95f, -1.64f, 1.95f, -2.92f)
            verticalLineToRelative(-4.59f)
            lineToRelative(7.49f, 1.87f)
            curveToRelative(0.89f, 0.22f, 1.51f, 1.02f, 1.51f, 1.94f)
            verticalLineToRelative(2.77f)
            close()
            moveTo(3.31f, 10.72f)
            lineTo(0.27f, 7.65f)
            curveToRelative(-0.6f, -0.61f, -0.18f, -1.65f, 0.68f, -1.65f)
            horizontalLineToRelative(1.55f)
            lineTo(2.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(1.52f)
            curveToRelative(0.86f, 0f, 1.28f, 1.04f, 0.68f, 1.65f)
            lineToRelative(-3.04f, 3.06f)
            curveToRelative(-0.38f, 0.38f, -0.98f, 0.38f, -1.36f, 0f)
            close()
        }
    }.also { _SwipeDown = it }
