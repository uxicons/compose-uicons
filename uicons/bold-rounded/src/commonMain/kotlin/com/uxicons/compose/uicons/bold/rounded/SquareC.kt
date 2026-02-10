package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Br.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
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
            moveTo(9.02f, 11f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.68f, 1.3f, 3f, 2.95f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.0f, 0f, 1.94f, -0.5f, 2.5f, -1.33f)
            curveToRelative(0.46f, -0.69f, 1.39f, -0.87f, 2.08f, -0.41f)
            curveToRelative(0.69f, 0.46f, 0.87f, 1.39f, 0.41f, 2.08f)
            curveToRelative(-1.12f, 1.67f, -2.98f, 2.67f, -4.99f, 2.67f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-3.28f, 0f, -5.95f, -2.69f, -5.95f, -6f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -3.31f, 2.67f, -6f, 5.95f, -6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(2.01f, 0f, 3.87f, 1.0f, 4.99f, 2.67f)
            curveToRelative(0.46f, 0.69f, 0.28f, 1.62f, -0.41f, 2.08f)
            curveToRelative(-0.69f, 0.46f, -1.62f, 0.28f, -2.08f, -0.41f)
            curveToRelative(-0.56f, -0.83f, -1.49f, -1.33f, -2.5f, -1.33f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.66f, 0f, -2.95f, 1.32f, -2.95f, 3f)
            close()
        }
    }.also { _SquareC = it }
