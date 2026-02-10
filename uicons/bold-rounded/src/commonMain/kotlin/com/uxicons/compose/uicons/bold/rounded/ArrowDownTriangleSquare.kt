package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownTriangleSquare: ImageVector? = null

val Icons.Br.ArrowDownTriangleSquare: ImageVector
    get() = _ArrowDownTriangleSquare ?: UXIcon(name = "ArrowDownTriangleSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.05f, 18.01f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.06f, 2.12f)
            lineToRelative(-3.04f, 2.87f)
            curveToRelative(-0.66f, 0.66f, -1.54f, 1f, -2.43f, 1f)
            reflectiveCurveToRelative(-1.8f, -0.34f, -2.49f, -1.03f)
            lineToRelative(-3.01f, -2.84f)
            curveToRelative(-0.6f, -0.57f, -0.63f, -1.52f, -0.06f, -2.12f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.63f, 2.12f, -0.06f)
            lineToRelative(1.93f, 1.82f)
            lineTo(5.01f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(8.01f, 19.77f)
            lineToRelative(1.93f, -1.82f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.06f)
            close()
            moveTo(20f, 14f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            close()
            moveTo(23.2f, 6.58f)
            lineToRelative(-2.69f, -4.39f)
            curveToRelative(-0.4f, -0.74f, -1.17f, -1.2f, -2.01f, -1.2f)
            reflectiveCurveToRelative(-1.61f, 0.46f, -1.98f, 1.15f)
            lineToRelative(-2.74f, 4.48f)
            curveToRelative(-0.39f, 0.71f, -0.37f, 1.56f, 0.04f, 2.26f)
            curveToRelative(0.42f, 0.7f, 1.15f, 1.12f, 1.96f, 1.12f)
            horizontalLineToRelative(5.43f)
            curveToRelative(0.81f, 0f, 1.55f, -0.42f, 1.96f, -1.12f)
            curveToRelative(0.42f, -0.7f, 0.43f, -1.54f, 0.02f, -2.3f)
            close()
        }
    }.also { _ArrowDownTriangleSquare = it }
