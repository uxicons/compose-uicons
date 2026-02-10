package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BringForward: ImageVector? = null

val Icons.Br.BringForward: ImageVector
    get() = _BringForward ?: UXIcon(name = "BringForward") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 16f)
            lineTo(5.5f, 16f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(5f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(13f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            close()
            moveTo(24f, 18.5f)
            verticalLineToRelative(-5.13f)
            curveToRelative(0f, -2.51f, -1.7f, -4.7f, -4.13f, -5.33f)
            curveToRelative(-0.8f, -0.2f, -1.62f, 0.28f, -1.83f, 1.08f)
            curveToRelative(-0.21f, 0.8f, 0.28f, 1.62f, 1.08f, 1.83f)
            curveToRelative(1.1f, 0.28f, 1.87f, 1.28f, 1.87f, 2.42f)
            verticalLineToRelative(5.13f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5.13f)
            curveToRelative(-1.14f, 0f, -2.14f, -0.77f, -2.42f, -1.87f)
            curveToRelative(-0.21f, -0.8f, -1.02f, -1.28f, -1.83f, -1.08f)
            curveToRelative(-0.8f, 0.21f, -1.29f, 1.02f, -1.08f, 1.83f)
            curveToRelative(0.62f, 2.43f, 2.82f, 4.13f, 5.33f, 4.13f)
            horizontalLineToRelative(5.13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
        }
    }.also { _BringForward = it }
