package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Bs.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.56f, 0f, -1.06f, -0.23f, -1.43f, -0.6f)
                curveToRelative(0.3f, 1.0f, 0.74f, 1.92f, 1.43f, 2.6f)
                horizontalLineToRelative(-4f)
                curveToRelative(0.68f, -0.68f, 1.13f, -1.59f, 1.43f, -2.6f)
                curveToRelative(-0.36f, 0.37f, -0.87f, 0.6f, -1.43f, 0.6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -2.33f, 4f, -5f, 4f, -5f)
                curveToRelative(0f, 0f, 4f, 2.67f, 4f, 5f)
                close()
            }
        }.also { _CardSpade = it}
