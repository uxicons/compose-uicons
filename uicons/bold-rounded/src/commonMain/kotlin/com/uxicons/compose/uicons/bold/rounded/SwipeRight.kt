package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeRight: ImageVector? = null

val Icons.Br.SwipeRight: ImageVector
    get() = _SwipeRight ?: UXIcon(name = "SwipeRight") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.21f, 11.38f)
            lineToRelative(-8.21f, -2.05f)
            lineTo(9f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(13.51f)
            curveToRelative(0f, 0.04f, 0f, 0.1f, -0.1f, 0.15f)
            curveToRelative(-0.1f, 0.04f, -0.14f, -0.01f, -0.17f, -0.03f)
            curveToRelative(0f, 0f, -2.48f, -2.49f, -2.56f, -2.54f)
            curveToRelative(-0.7f, -0.48f, -1.81f, -0.56f, -2.6f, 0.23f)
            curveToRelative(-0.8f, 0.8f, -0.69f, 1.94f, -0.16f, 2.65f)
            curveToRelative(0.03f, 0.05f, 3.43f, 3.68f, 3.43f, 3.68f)
            curveToRelative(0.46f, 0.61f, 2.44f, 2.86f, 6.66f, 2.86f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-2.77f)
            curveToRelative(0f, -2.3f, -1.56f, -4.29f, -3.79f, -4.85f)
            close()
            moveTo(18f, 19f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.81f, 0f, -2.95f, -0.56f, -3.58f, -1.02f)
            curveToRelative(0.05f, -0.02f, 0.09f, -0.03f, 0.14f, -0.05f)
            curveToRelative(1.19f, -0.49f, 1.95f, -1.64f, 1.95f, -2.92f)
            verticalLineToRelative(-4.59f)
            lineToRelative(7.48f, 1.87f)
            curveToRelative(0.89f, 0.22f, 1.52f, 1.02f, 1.52f, 1.94f)
            verticalLineToRelative(2.77f)
            close()
            moveTo(23.72f, 5.19f)
            lineToRelative(-3.06f, 3.04f)
            curveToRelative(-0.61f, 0.6f, -1.65f, 0.18f, -1.65f, -0.68f)
            verticalLineToRelative(-1.52f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(-1.55f)
            curveToRelative(0f, -0.85f, 1.04f, -1.28f, 1.65f, -0.68f)
            lineToRelative(3.06f, 3.04f)
            curveToRelative(0.38f, 0.38f, 0.38f, 0.98f, 0f, 1.36f)
            close()
        }
    }.also { _SwipeRight = it }
