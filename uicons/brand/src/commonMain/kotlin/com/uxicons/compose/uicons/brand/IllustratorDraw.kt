package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IllustratorDraw: ImageVector? = null

val Icons.Brand.IllustratorDraw: ImageVector
    get() = _IllustratorDraw ?: UXIcon(name = "IllustratorDraw") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.89f, 0.33f)
            horizontalLineTo(3.69f)
            curveTo(0.69f, 0.33f, 0f, 2.12f, 0f, 5.12f)
            lineToRelative(0.01f, 14.55f)
            curveToRelative(0f, 3f, 0.93f, 4f, 3.93f, 4f)
            horizontalLineToRelative(16.06f)
            curveToRelative(3.0f, 0f, 4.0f, -1.0f, 4.0f, -4.0f)
            verticalLineTo(4.56f)
            curveTo(24f, 1.57f, 22.88f, 0.33f, 19.89f, 0.33f)
            close()
            moveTo(11.39f, 6.07f)
            horizontalLineToRelative(2.32f)
            curveToRelative(0f, 1.29f, 1.54f, 3.2f, 2.19f, 3.57f)
            lineToRelative(-2.97f, 5.6f)
            horizontalLineToRelative(-0.07f)
            verticalLineToRelative(-3.8f)
            curveToRelative(0.34f, -0.13f, 0.56f, -0.45f, 0.56f, -0.81f)
            curveToRelative(-0.01f, -0.48f, -0.41f, -0.86f, -0.89f, -0.86f)
            curveToRelative(-0.35f, 0.0f, -0.67f, 0.22f, -0.8f, 0.55f)
            curveToRelative(-0.18f, 0.45f, 0.04f, 0.95f, 0.48f, 1.13f)
            verticalLineToRelative(3.8f)
            horizontalLineToRelative(-0.04f)
            lineTo(9.19f, 9.62f)
            curveTo(9.74f, 9.16f, 11.39f, 7.14f, 11.39f, 6.07f)
            close()
            moveTo(19.7f, 6.35f)
            lineToRelative(-6.97f, 12.56f)
            curveToRelative(-0.04f, 0.07f, -0.11f, 0.11f, -0.2f, 0.11f)
            curveToRelative(-0.04f, 0f, -0.07f, -0.01f, -0.11f, -0.03f)
            curveToRelative(-0.03f, -0.02f, -0.06f, -0.04f, -0.07f, -0.07f)
            lineToRelative(-0.0f, -0.01f)
            curveToRelative(0f, 0f, -7.61f, -11.09f, -7.8f, -11.35f)
            curveTo(4.39f, 7.39f, 4.3f, 7.17f, 4.3f, 6.93f)
            verticalLineTo(6.93f)
            curveTo(4.3f, 6.43f, 4.71f, 6.02f, 5.21f, 6.02f)
            curveToRelative(0.39f, 0.0f, 0.63f, 0.24f, 0.87f, 0.66f)
            lineToRelative(6.46f, 11.66f)
            lineTo(19.31f, 6.13f)
            lineToRelative(0.0f, 0f)
            curveToRelative(0.06f, -0.11f, 0.19f, -0.14f, 0.3f, -0.09f)
            curveTo(19.72f, 6.11f, 19.76f, 6.24f, 19.7f, 6.35f)
            close()
        }
    }.also { _IllustratorDraw = it }
