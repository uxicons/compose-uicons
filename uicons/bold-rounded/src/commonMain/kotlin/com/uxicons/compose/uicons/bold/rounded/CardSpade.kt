package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Br.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 0f)
            horizontalLineToRelative(-7f)
            curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(6f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(16f, 13f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            curveToRelative(-0.56f, 0f, -1.06f, -0.23f, -1.43f, -0.6f)
            curveToRelative(0.19f, 0.66f, 0.45f, 1.27f, 0.8f, 1.81f)
            curveToRelative(0.22f, 0.34f, -0.0f, 0.79f, -0.41f, 0.79f)
            horizontalLineToRelative(-1.93f)
            curveToRelative(-0.41f, 0f, -0.63f, -0.45f, -0.41f, -0.79f)
            curveToRelative(0.35f, -0.54f, 0.6f, -1.16f, 0.8f, -1.81f)
            curveToRelative(-0.36f, 0.37f, -0.87f, 0.6f, -1.43f, 0.6f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            curveToRelative(0f, -2.33f, 4f, -5f, 4f, -5f)
            curveToRelative(0f, 0f, 4f, 2.67f, 4f, 5f)
            close()
        }
    }.also { _CardSpade = it }
