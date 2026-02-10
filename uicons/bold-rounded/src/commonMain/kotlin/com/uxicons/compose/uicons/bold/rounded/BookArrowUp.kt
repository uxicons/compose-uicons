package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Br.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.66f, 15f)
            horizontalLineToRelative(-1.66f)
            verticalLineToRelative(5.5f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(-1.66f)
            curveToRelative(-0.89f, 0f, -1.34f, -1.08f, -0.71f, -1.71f)
            lineToRelative(3.16f, -3.16f)
            curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
            lineToRelative(3.16f, 3.16f)
            curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f)
            close()
            moveTo(16f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-2.38f, 0f, -4.34f, -1.86f, -4.5f, -4.2f)
            lineTo(1f, 5.5f)
            curveTo(1f, 2.46f, 3.46f, 0f, 6.5f, 0f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(1f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-7.5f)
            lineTo(10f, 15f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            lineTo(5.5f, 18f)
            curveToRelative(-1.97f, 0.04f, -1.97f, 2.96f, 0f, 3f)
            lineTo(14.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(4f, 15.28f)
            curveToRelative(0.47f, -0.17f, 0.97f, -0.28f, 1.5f, -0.28f)
            horizontalLineToRelative(1.5f)
            lineTo(7f, 3f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            lineTo(4f, 15.28f)
            close()
        }
    }.also { _BookArrowUp = it }
