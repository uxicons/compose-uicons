package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Br.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.39f, 6.61f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            horizontalLineToRelative(-0.52f)
            curveToRelative(-0.12f, -1.28f, -0.67f, -2.47f, -1.59f, -3.39f)
            curveTo(15.35f, 0.57f, 13.97f, -0.0f, 12.5f, -0.0f)
            horizontalLineToRelative(-7f)
            curveTo(4.04f, -0.0f, 2.65f, 0.57f, 1.61f, 1.61f)
            curveTo(0.57f, 2.65f, 0f, 4.04f, 0f, 5.5f)
            lineToRelative(0.0f, 11.62f)
            curveToRelative(0.0f, 1.03f, 0.84f, 1.87f, 1.87f, 1.87f)
            curveToRelative(0.18f, 0f, 0.37f, -0.03f, 0.54f, -0.08f)
            curveToRelative(0.05f, -0.01f, 3.66f, -1.53f, 3.66f, -1.53f)
            curveToRelative(0.43f, 2.61f, 2.7f, 4.61f, 5.43f, 4.61f)
            horizontalLineToRelative(5.5f)
            reflectiveCurveToRelative(4.54f, 1.9f, 4.58f, 1.92f)
            curveToRelative(0.18f, 0.05f, 0.36f, 0.08f, 0.54f, 0.08f)
            curveToRelative(1.03f, 0f, 1.87f, -0.84f, 1.87f, -1.87f)
            lineToRelative(0.01f, -11.62f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            close()
            moveTo(3f, 5.5f)
            curveToRelative(0f, -0.66f, 0.26f, -1.29f, 0.73f, -1.76f)
            curveToRelative(0.47f, -0.47f, 1.1f, -0.74f, 1.76f, -0.74f)
            horizontalLineToRelative(7f)
            curveToRelative(0.67f, 0f, 1.3f, 0.26f, 1.77f, 0.73f)
            reflectiveCurveToRelative(0.73f, 1.1f, 0.73f, 1.77f)
            verticalLineToRelative(6.0f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5.8f)
            curveToRelative(-0.2f, 0f, -0.4f, 0.04f, -0.58f, 0.12f)
            lineToRelative(-3.11f, 1.31f)
            lineToRelative(-0.0f, -9.92f)
            close()
            moveTo(20.99f, 20.42f)
            lineToRelative(-3.11f, -1.31f)
            curveToRelative(-0.18f, -0.08f, -0.38f, -0.12f, -0.58f, -0.12f)
            horizontalLineToRelative(-5.8f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            horizontalLineToRelative(3.45f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.66f, 0f, 1.29f, 0.26f, 1.76f, 0.74f)
            curveToRelative(0.47f, 0.47f, 0.74f, 1.1f, 0.73f, 1.76f)
            lineToRelative(-0.0f, 9.92f)
            close()
        }
    }.also { _Messages = it }
