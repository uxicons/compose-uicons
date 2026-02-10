package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Rr.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 13f)
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
                moveTo(21f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(3f, 5f)
                curveTo(3f, 2.24f, 5.24f, 0f, 8f, 0f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(19f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(19f, 5f)
                close()
            }
        }.also { _CardSpade = it}
