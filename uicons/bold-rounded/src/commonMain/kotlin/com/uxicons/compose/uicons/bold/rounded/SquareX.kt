package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareX: ImageVector? = null

val Icons.Br.SquareX: ImageVector
    get() = _SquareX ?: UXIcon(name = "SquareX") {
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
            moveTo(17.66f, 7.45f)
            lineToRelative(-3.72f, 4.55f)
            lineToRelative(3.72f, 4.55f)
            curveToRelative(0.52f, 0.64f, 0.43f, 1.59f, -0.21f, 2.11f)
            curveToRelative(-0.28f, 0.23f, -0.61f, 0.34f, -0.95f, 0.34f)
            curveToRelative(-0.43f, 0f, -0.86f, -0.19f, -1.16f, -0.55f)
            lineToRelative(-3.34f, -4.08f)
            lineToRelative(-3.34f, 4.08f)
            curveToRelative(-0.3f, 0.36f, -0.73f, 0.55f, -1.16f, 0.55f)
            curveToRelative(-0.33f, 0f, -0.67f, -0.11f, -0.95f, -0.34f)
            curveToRelative(-0.64f, -0.52f, -0.73f, -1.47f, -0.21f, -2.11f)
            lineToRelative(3.72f, -4.55f)
            lineToRelative(-3.72f, -4.55f)
            curveToRelative(-0.52f, -0.64f, -0.43f, -1.59f, 0.21f, -2.11f)
            curveToRelative(0.64f, -0.52f, 1.59f, -0.43f, 2.11f, 0.21f)
            lineToRelative(3.34f, 4.08f)
            lineToRelative(3.34f, -4.08f)
            curveToRelative(0.53f, -0.64f, 1.47f, -0.73f, 2.11f, -0.21f)
            curveToRelative(0.64f, 0.52f, 0.73f, 1.47f, 0.21f, 2.11f)
            close()
        }
    }.also { _SquareX = it }
