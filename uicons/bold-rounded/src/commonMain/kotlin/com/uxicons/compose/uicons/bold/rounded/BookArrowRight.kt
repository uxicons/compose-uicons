package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Br.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 12.66f)
            verticalLineToRelative(-1.66f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(-1.66f)
            curveToRelative(0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f)
            lineToRelative(3.16f, 3.16f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(-3.16f, 3.16f)
            curveToRelative(-0.63f, 0.63f, -1.71f, 0.18f, -1.71f, -0.71f)
            close()
            moveTo(23f, 16.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 3.04f, -2.46f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-2.38f, 0f, -4.34f, -1.86f, -4.5f, -4.2f)
            lineTo(1f, 5.5f)
            curveTo(1f, 2.46f, 3.46f, 0f, 6.5f, 0f)
            horizontalLineToRelative(11f)
            curveToRelative(1.97f, 0f, 3.78f, 1.05f, 4.76f, 2.75f)
            curveToRelative(0.36f, 0.62f, 0.28f, 1.46f, -0.27f, 1.93f)
            curveToRelative(-0.76f, 0.66f, -1.88f, 0.42f, -2.33f, -0.42f)
            curveToRelative(-0.43f, -0.83f, -1.38f, -1.26f, -2.32f, -1.26f)
            horizontalLineToRelative(-7.36f)
            lineTo(10f, 15f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(4f, 5.5f)
            lineTo(4f, 15.28f)
            curveToRelative(0.47f, -0.17f, 0.97f, -0.28f, 1.5f, -0.28f)
            horizontalLineToRelative(1.5f)
            lineTo(7f, 3f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(20f, 18f)
            lineTo(5.5f, 18f)
            curveToRelative(-1.97f, 0.04f, -1.97f, 2.96f, 0f, 3f)
            horizontalLineToRelative(12f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            close()
        }
    }.also { _BookArrowRight = it }
