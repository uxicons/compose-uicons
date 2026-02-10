package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Br.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 6.28f)
            verticalLineToRelative(3.4f)
            curveToRelative(0f, 0.73f, -0.59f, 1.32f, -1.32f, 1.32f)
            horizontalLineToRelative(-0.77f)
            reflectiveCurveToRelative(-0.0f, 0f, -0.0f, 0f)
            curveToRelative(-0.0f, 0f, -0.0f, 0f, -0.0f, 0f)
            horizontalLineToRelative(-2.62f)
            curveToRelative(-0.69f, 0f, -1.04f, -0.84f, -0.55f, -1.33f)
            lineToRelative(0.78f, -0.78f)
            curveToRelative(-0.7f, -0.56f, -1.58f, -0.89f, -2.51f, -0.89f)
            curveToRelative(-1.51f, 0f, -2.88f, 0.84f, -3.56f, 2.18f)
            curveToRelative(-0.38f, 0.74f, -1.28f, 1.03f, -2.02f, 0.65f)
            curveToRelative(-0.74f, -0.38f, -1.03f, -1.28f, -0.65f, -2.02f)
            curveToRelative(1.2f, -2.35f, 3.59f, -3.82f, 6.24f, -3.82f)
            curveToRelative(1.75f, 0f, 3.38f, 0.65f, 4.63f, 1.76f)
            lineToRelative(1.03f, -1.03f)
            curveToRelative(0.49f, -0.49f, 1.33f, -0.14f, 1.33f, 0.55f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            close()
            moveTo(17.58f, 13.16f)
            curveToRelative(-0.74f, -0.38f, -1.64f, -0.08f, -2.02f, 0.65f)
            curveToRelative(-0.69f, 1.35f, -2.05f, 2.18f, -3.56f, 2.18f)
            curveToRelative(-0.94f, 0f, -1.78f, -0.33f, -2.47f, -0.93f)
            lineToRelative(0.74f, -0.74f)
            curveToRelative(0.49f, -0.49f, 0.14f, -1.33f, -0.55f, -1.33f)
            horizontalLineToRelative(-3.4f)
            curveToRelative(-0.73f, 0f, -1.32f, 0.59f, -1.32f, 1.32f)
            verticalLineToRelative(3.4f)
            curveToRelative(0f, 0.69f, 0.84f, 1.04f, 1.33f, 0.55f)
            lineToRelative(1.07f, -1.07f)
            curveToRelative(1.25f, 1.16f, 2.86f, 1.8f, 4.6f, 1.8f)
            curveToRelative(2.64f, 0f, 5.03f, -1.46f, 6.24f, -3.82f)
            curveToRelative(0.38f, -0.74f, 0.08f, -1.64f, -0.65f, -2.02f)
            close()
        }
    }.also { _RotateSquare = it }
