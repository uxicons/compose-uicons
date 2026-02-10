package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareM: ImageVector? = null

val Icons.Br.SquareM: ImageVector
    get() = _SquareM ?: UXIcon(name = "SquareM") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(19f, 7.24f)
            verticalLineToRelative(10.26f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7.51f)
            lineToRelative(-2.72f, 4.41f)
            curveToRelative(-0.27f, 0.44f, -0.76f, 0.71f, -1.28f, 0.71f)
            reflectiveCurveToRelative(-1.0f, -0.27f, -1.28f, -0.71f)
            lineToRelative(-2.72f, -4.41f)
            verticalLineToRelative(7.51f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(5f, 7.24f)
            curveToRelative(0f, -1.01f, 0.6f, -1.85f, 1.53f, -2.14f)
            curveToRelative(0.93f, -0.29f, 1.94f, 0.06f, 2.52f, 0.87f)
            lineToRelative(2.96f, 4.79f)
            lineToRelative(2.91f, -4.71f)
            curveToRelative(0.62f, -0.89f, 1.63f, -1.24f, 2.56f, -0.94f)
            curveToRelative(0.93f, 0.29f, 1.53f, 1.13f, 1.53f, 2.14f)
            close()
        }
    }.also { _SquareM = it }
