package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardSpade: ImageVector? = null

val Icons.Rs.CardSpade: ImageVector
    get() = _CardSpade ?: UXIcon(name = "CardSpade") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 13f)
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
                moveTo(21f, 3f)
                verticalLineToRelative(21f)
                lineTo(3f, 24f)
                lineTo(3f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(6f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(14f)
                lineTo(19f, 3f)
                close()
            }
        }.also { _CardSpade = it}
