package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareQuote: ImageVector? = null

val Icons.Br.SquareQuote: ImageVector
    get() = _SquareQuote ?: UXIcon(name = "SquareQuote") {
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
            moveTo(11f, 9.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.92f, -1.35f, 3.59f, -3.2f, 3.97f)
            curveToRelative(-0.1f, 0.02f, -0.2f, 0.03f, -0.3f, 0.03f)
            curveToRelative(-0.7f, 0f, -1.32f, -0.49f, -1.47f, -1.2f)
            curveToRelative(-0.17f, -0.81f, 0.36f, -1.6f, 1.17f, -1.77f)
            curveToRelative(0.45f, -0.09f, 0.8f, -0.54f, 0.8f, -1.03f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18f, 9.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.92f, -1.35f, 3.59f, -3.2f, 3.97f)
            curveToRelative(-0.1f, 0.02f, -0.2f, 0.03f, -0.3f, 0.03f)
            curveToRelative(-0.7f, 0f, -1.32f, -0.49f, -1.47f, -1.2f)
            curveToRelative(-0.17f, -0.81f, 0.36f, -1.6f, 1.17f, -1.77f)
            curveToRelative(0.45f, -0.09f, 0.8f, -0.54f, 0.8f, -1.03f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _SquareQuote = it }
