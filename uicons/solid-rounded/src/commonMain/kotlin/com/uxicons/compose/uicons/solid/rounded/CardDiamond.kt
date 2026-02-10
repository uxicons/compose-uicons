package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardDiamond: ImageVector? = null

val Icons.Sr.CardDiamond: ImageVector
    get() = _CardDiamond ?: UXIcon(name = "CardDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                horizontalLineToRelative(-8f)
                curveTo(5.24f, 0f, 3f, 2.24f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15f, 12.71f)
                lineToRelative(-2.38f, 3.4f)
                curveToRelative(-0.3f, 0.43f, -0.94f, 0.43f, -1.25f, 0f)
                lineToRelative(-2.38f, -3.4f)
                curveToRelative(-0.3f, -0.43f, -0.3f, -1.0f, 0f, -1.43f)
                lineToRelative(2.38f, -3.4f)
                curveToRelative(0.3f, -0.43f, 0.94f, -0.43f, 1.25f, 0f)
                lineToRelative(2.38f, 3.4f)
                curveToRelative(0.3f, 0.43f, 0.3f, 1.0f, 0f, 1.43f)
                close()
            }
        }.also { _CardDiamond = it}
