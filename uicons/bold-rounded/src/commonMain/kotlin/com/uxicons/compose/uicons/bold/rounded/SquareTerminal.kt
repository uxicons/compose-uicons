package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Br.SquareTerminal: ImageVector
    get() = _SquareTerminal ?: UXIcon(name = "SquareTerminal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.59f, 18.24f)
            curveToRelative(-0.38f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(3.33f, -3.33f)
            curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
            lineToRelative(-3.4f, -3.4f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0f)
            lineToRelative(3.4f, 3.4f)
            curveToRelative(1.36f, 1.36f, 1.36f, 3.58f, 0f, 4.95f)
            lineToRelative(-3.33f, 3.33f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            close()
            moveTo(24f, 18.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
            moveTo(18.5f, 3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            close()
            moveTo(19f, 16.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _SquareTerminal = it }
